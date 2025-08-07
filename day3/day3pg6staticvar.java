class sample{
    int x=17;
    static int y=18;
    public void display(){
        System.out.println("Instanc Variable "+x);
        System.out.println("Static Variable "+y);
    }

    static void display1(){
        System.out.println("Instance variable "+new sample().x); //can't access instance variable in static class directly.
        System.out.println("Static variable "+y);
    }

}

public class day3pg6staticvar{
    public static void main(String[] args) {
        sample s1=new sample();
        s1.display();
        s1.display1();
    }
}