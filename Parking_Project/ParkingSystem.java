import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Entity Class (SRP: Only represents one parked vehicle)
// bundle related data into one object .

class ParkingSlot {
    String vehicleNumber;   
    String vehicleType;     
    String slotCode;        
    String slotNumber;      
    LocalDateTime entryTime;
    boolean isEmployee;     

    // Constructor used when parking a new vehicle
    ParkingSlot(String vehicleNumber, String vehicleType, String slotCode,
                String slotNumber, boolean isEmployee) {
        this(vehicleNumber, vehicleType, slotCode, slotNumber, isEmployee, LocalDateTime.now());
    }

    // Constructor for recreating object from file
    ParkingSlot(String vehicleNumber, String vehicleType, String slotCode,
                String slotNumber, boolean isEmployee, LocalDateTime entryTime) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.slotCode = slotCode;
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
        this.isEmployee = isEmployee;
    }

    // Convert object -> String for file storage
    @Override
    public String toString() {
        return vehicleNumber + "," + vehicleType + "," + slotCode + "," + slotNumber
                + "," + isEmployee + "," + entryTime;
    }

    // Convert String -> Object when loading from file
    //factory method that converts a line of text back into a ParkingSlot object.
    public static ParkingSlot fromString(String line) {
        try {
            String[] p = line.split(",");
            return new ParkingSlot(
                p[0],                       // vehicleNumber
                p[1],                       // vehicleType
                p[2],                       // slotCode
                p[3],                       // slotNumber
                Boolean.parseBoolean(p[4]), // isEmployee parse-to restore the correct data types.
                LocalDateTime.parse(p[5])   // entryTime
            );
        } catch (Exception e) {
            System.out.println("Error parsing line: " + line);
            return null;
        }
    }
}


// Abstraction
// common contract for saving and loading data.

interface ParkingDataStore {
    void save(List<ParkingSlot> vehicles);
    List<ParkingSlot> load();
}


// File-based Storage 

class FileParkingDataStore implements ParkingDataStore {
    private static final String FILE_NAME = "parking_data.txt";

    // Save the full list of vehicles into file using FileOutputStream
    @Override
    public void save(List<ParkingSlot> vehicles) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            for (ParkingSlot v : vehicles) {
                String line = v.toString() + System.lineSeparator(); //Converts the object into a comma-separated string
                fos.write(line.getBytes()); // FileOutputStream requires byte[]
            }
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load vehicles from file using FileInputStream
    @Override
    public List<ParkingSlot> load() {
        List<ParkingSlot> list = new ArrayList<>();
        File f = new File(FILE_NAME);
        if (!f.exists()) return list;

        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            byte[] data = fis.readAllBytes();
            String content = new String(data); // convert bytes back to String
            String[] lines = content.split("\\R");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    ParkingSlot slot = ParkingSlot.fromString(line.trim()); //Converts each line back into a ParkingSlot object.
                    if (slot != null) list.add(slot);
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
        return list;
    }
}


// Business Logic Class 

class ParkingLot {
    private int employeeSlots;
    private int normalSlots;

    private List<ParkingSlot> parkedVehicles;           
    private List<String> availableEmployeeSlots = new ArrayList<>();
    private List<String> availableNormalSlots = new ArrayList<>();
    private Random rand = new Random();

    private ParkingDataStore storage; // DIP: depends on abstraction not concrete class

    public ParkingLot(int totalSlots, int employeeSlots, ParkingDataStore storage) {
        this.employeeSlots = employeeSlots;
        this.normalSlots = totalSlots - employeeSlots;
        this.storage = storage;

        // Fill available slots initially
        for (int i = 1; i <= employeeSlots; i++) availableEmployeeSlots.add("E" + i);
        for (int i = 1; i <= normalSlots; i++) availableNormalSlots.add("N" + i);

        // Load previous data
        parkedVehicles = storage.load();
        for (ParkingSlot s : parkedVehicles) {
            if (s.isEmployee) availableEmployeeSlots.remove(s.slotNumber);
            else availableNormalSlots.remove(s.slotNumber);
        }
    }

    // Park a new vehicle
    public void parkVehicle(boolean isEmployee, String number, String type) {
        String slotNumber;
        if (isEmployee) {
            if (availableEmployeeSlots.isEmpty()) {
                System.out.println("No employee slots available!");
                return;
            }
            slotNumber = availableEmployeeSlots.remove(0);
        } else {
            if (availableNormalSlots.isEmpty()) {
                System.out.println("No normal slots available!");
                return;
            }
            slotNumber = availableNormalSlots.remove(0); // removes the element at index 0 (the first element) from a list.
                                                               //At the same time, it returns that element so you can use it.
        }

        String code = "QR" + (1000 + rand.nextInt(9000));
        ParkingSlot slot = new ParkingSlot(number, type, code, slotNumber, isEmployee);
        parkedVehicles.add(slot);
        storage.save(parkedVehicles); // persist data

        System.out.println("\nVehicle parked successfully!");
        System.out.println("Slot Number : " + slotNumber);
        System.out.println("Slot Code   : " + code);
        System.out.println("Entry Time  : " + slot.entryTime);
    }

    // Remove vehicle
    public void removeVehicle(String searchValue, boolean byCode) {
        ParkingSlot found = null;
        for (ParkingSlot s : parkedVehicles) {
            if ((byCode && s.slotCode.equalsIgnoreCase(searchValue)) ||
                (!byCode && s.vehicleNumber.equalsIgnoreCase(searchValue))) {
                found = s; break;
            }
        }

        if (found == null) {
            System.out.println("No vehicle found!");
            return;
        }

        LocalDateTime exitTime = LocalDateTime.now();
        long hours = Duration.between(found.entryTime, exitTime).toHours();
        if (hours == 0) hours = 1;
        int ratePerHour = found.vehicleType.equalsIgnoreCase("bike") ? 30 : 50;
        long amount = hours * ratePerHour;

        if (found.isEmployee) availableEmployeeSlots.add(found.slotNumber);
        else availableNormalSlots.add(found.slotNumber);

        System.out.println("\n--- Parking Receipt ---");
        System.out.println("Vehicle Number : " + found.vehicleNumber);
        System.out.println("Vehicle Type   : " + found.vehicleType);
        System.out.println("Slot Number    : " + found.slotNumber);
        System.out.println("Slot Code      : " + found.slotCode);
        System.out.println("Entry Time     : " + found.entryTime);
        System.out.println("Exit Time      : " + exitTime);
        System.out.println("Total Hours    : " + hours);
        System.out.println("Amount to Pay  : ₹" + amount);

        parkedVehicles.remove(found);
        storage.save(parkedVehicles);
    }

    // Search vehicle
    public void search(String value, boolean byCode) {
        for (ParkingSlot s : parkedVehicles) {
            if ((byCode && s.slotCode.equalsIgnoreCase(value)) ||
                (!byCode && s.vehicleNumber.equalsIgnoreCase(value))) {
                System.out.println("\n----- Vehicle Info -----");
                System.out.println("Vehicle Number : " + s.vehicleNumber);
                System.out.println("Vehicle Type   : " + s.vehicleType);
                System.out.println("Slot Number    : " + s.slotNumber);
                System.out.println("Slot Code      : " + s.slotCode);
                System.out.println("Employee       : " + (s.isEmployee ? "Yes" : "No"));
                System.out.println("Entry Time     : " + s.entryTime);
                return;
            }
        }
        System.out.println("No vehicle found.");
    }

    // View free slots
    public void viewAvailableSlots() {
        System.out.println("\n--- Available Slots ---");
        System.out.println("Employee Slots (free/total): " + availableEmployeeSlots.size() + "/" + employeeSlots);
        System.out.println("Normal Slots   (free/total): " + availableNormalSlots.size() + "/" + normalSlots);
        System.out.println("Free Employee Slots: " + availableEmployeeSlots);
        System.out.println("Free Normal Slots  : " + availableNormalSlots);
    }
}


//  Main Class 

public class ParkingSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter total slots: ");
        int totalSlots = sc.nextInt();
        System.out.print("Enter reserved slots for employees: ");
        int empSlots = sc.nextInt();

        // Dependency Injection: ParkingLot uses ParkingDataStore abstraction
        ParkingDataStore storage = new FileParkingDataStore();
        ParkingLot lot = new ParkingLot(totalSlots, empSlots, storage);

        while (true) {
            System.out.println("\n---- Parking System ----");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. View Available Slots");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Is this an Employee? (yes/no): ");
                    boolean emp = sc.next().equalsIgnoreCase("yes");
                    System.out.print("Enter vehicle number: ");
                    String num = sc.next();
                    System.out.print("Enter vehicle type (car/bike): ");
                    String type = sc.next();
                    lot.parkVehicle(emp, num, type);
                    break;
                case 2:
                    System.out.println("Remove by: 1. Slot Code  2. Vehicle Number");
                    int r = sc.nextInt();
                    if (r == 1) {
                        System.out.print("Enter Slot Code: ");
                        lot.removeVehicle(sc.next(), true);
                    } else {
                        System.out.print("Enter Vehicle Number: ");
                        lot.removeVehicle(sc.next(), false);
                    }
                    break;
                case 3:
                    System.out.println("Search by: 1. Vehicle Number  2. Slot Code");
                    int s = sc.nextInt();
                    if (s == 1) {
                        System.out.print("Enter Vehicle Number: ");
                        lot.search(sc.next(), false);
                    } else {
                        System.out.print("Enter Slot Code: ");
                        lot.search(sc.next(), true);
                    }
                    break;
                case 4:
                    lot.viewAvailableSlots();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
