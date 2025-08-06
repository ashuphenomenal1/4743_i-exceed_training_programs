

interface anuj{
    default void f1(){
        System.out.println("Default");
    }

    static void f2(){
        System.out.println("Static");
    }

    public void f3();
}

interface somu extends anuj{
    default void f1(){
        System.out.println("Default inside interface 2");
    }
    public void f4();
}

class friend implements somu,anuj{
    friend(){

    }

    @Override
    public void f3(){
        System.out.println("Childhood friend");
    }
    @Override
    public void f4(){
        System.out.println("Dependable friend");
    }

    public void f1(){
        System.out.println("Inside Default");
        somu.super.f1();
    
        anuj.f2();
    }
}


public class day3pg4diamondprob {

    public static void main(String[] args) {
        friend fd=new friend();
        fd.f1();
        anuj.f2();

    }
    
}
