class Address{
    String city,area;
    int pin;
    Address(String city,String area,int pin){
            this.city=city;
            this.area=area;
            this.pin=pin;
    }

    public void displayAddress(){
        System.out.println("City name "+city);
        System.out.println("Area "+area);
        System.out.println("Pin = "+pin);
    }
}
