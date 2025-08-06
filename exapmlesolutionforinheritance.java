class car{

    String nameofBrand;
    Boolean isAvailable;
    
    car(String nameofBrand,Boolean isAvailabe){
        this.nameofBrand=nameofBrand;
        this.isAvailable=isAvailabe;
    }
    
    public void getCarDetails(){
            System.out.println("Name of the brand "+nameofBrand);
            System.out.println("Availability "+isAvailable);
        }

    }


class scorpio extends car{
    
    String carName,modelName,colour;
    
    
    scorpio(String carName,String modelName,String colour,String nameofBrand,Boolean isAvailable){
    
        super(nameofBrand,isAvailable);
        this.carName=carName;
        this.modelName=modelName;
        this.colour=colour;
    }
       
    public void displayCar(){
        
        System.out.println("The Car Name " +carName);
        System.out.println("The Model Name "+modelName);
        System.out.println("Colour "+ colour);
    }
}


public class exapmlesolutionforinheritance {
    public static void main(String[] args) {
        scorpio obj= new scorpio("Mahindra","Thar","Black","Mahindra",true);
        obj.getCarDetails();
        obj.displayCar();

    }
    
}
