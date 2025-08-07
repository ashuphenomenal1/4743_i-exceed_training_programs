class car{
    private final engine eng;
    String brand,model;
    int year;
    
    car(String brand,String model,int year){
        eng=new engine("Revatron","Third",4);
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public void displayCar(){
        System.out.println("Brand of the car: "+brand);
        System.out.println("Model of the car: "+model);
        System.out.println("Year of the manufacturing: "+year);

        eng.displayEngine();
    }
}

    class engine{
        String name,version;
        int cylinder;
         engine(String name,String version,int cylinder){
            this.name=name;
            this.version=version;
            this.cylinder=cylinder;
         }

         public void displayEngine(){
            System.out.println("Engine name: "+name);
            System.out.println("Version of the engine: "+version);
            System.out.println("Number of Cylinder: "+cylinder);
         }

    }

public class day4pg2enccom {
    
public static void main(String[] args) {
    car c=new car("Safari","Adventure",2025);
    c.displayCar();
}


}
