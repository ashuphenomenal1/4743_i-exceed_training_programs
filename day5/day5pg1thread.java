class sample extends Thread{
    Thread t=new Thread(this);
    public void run(){

        t.setName("I-exceed");
        System.out.println("Thread inside the class method\t"+t.getName());
    }
}

public class day5pg1thread {
    
    public static void main(String[] args) {
        System.out.println("Thread inside main class "+Thread.currentThread().getName());
        sample obj=new sample();
        obj.start();
    }
}
