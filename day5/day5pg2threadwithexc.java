class sample extends Thread{
    Thread t=new Thread(this);

    public void run(){
        for (int i = 0; i < 10; i++) {


            try {
                System.out.println("Sample1 Class\t"+i);
                new Thread(this).sleep(1000);
            } catch (InterruptedException e) {

            }
            
            
        }

        for (int i = 10; i < 21; i++) {


            try {
                System.out.println("Sample Class\t"+i);
                new Thread(this).sleep(1000);
            } catch (InterruptedException e) {

            }
            
            
        }

    }
    }


public class day5pg2threadwithexc {
    public static void main(String[] args) throws InterruptedException {
        sample obj=new sample();
        sample obj1=new sample();
        sample obj2=new sample();
        obj.start();
        obj.join();

        obj1.start();
        obj1.join();

        obj2.start();
    


    }
}
