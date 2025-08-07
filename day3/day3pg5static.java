class sample{
    static int x=17;
    sample(){
        x++;
        System.out.println(x);
    }
}

public class day3pg5static {
    public static void main(String[] args) {
        sample obj=new sample();
        sample obj1=new sample();
        sample obj3=new sample();
    }
}
