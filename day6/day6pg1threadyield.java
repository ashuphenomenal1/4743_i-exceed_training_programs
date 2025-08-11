class one extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()"-Itteration"+i);
        }
    }
    }


public class day6pg1threadyield {
    public static void main(String[] args) {
        one obj=new one();
        obj.start();

        for(int i=0;i<10;i++){
            System.out.println("Main thread is running.");
        }

    }
    
}
