interface one{
    public void methodfromOne();
}

interface two extends one{
    public void methodfromTwo();
}

class sample implements two{
    sample(){



    }
    @Override
    public void methodfromOne(){
        System.out.println("This is inside the first interface");
    }

    @Override
    public void methodfromTwo(){
        System.out.println("This is inside the second interface.");
    }
}

public class day3pg2Interface{
    public static void main(String[] args) {
        
        sample obj1=new sample();
        obj1.methodfromOne();
        obj1.methodfromTwo();
    }
}

