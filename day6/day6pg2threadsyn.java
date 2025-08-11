class call{
    synchronized public void callme(String msg){
     System.out.print("[");
     System.out.print(msg);
     System.out.print("]");
     display();
    }
    public void display(){
        for(int i=0;i<10;i++){
            System.out.print(i);
        }
    }
}

class caller extends Thread{
    call obj;
    String str;
    Thread t=new Thread(this);

    caller(call obj,String str){
        this.obj=obj;
        this.str=str;
        t.start();
    }

        public void run(){
           obj.callme(str);
        }
    }




public class day6pg2threadsyn {
    
    public static void main(String[] args) {
        call obj=new call();
        caller c1=new caller(obj,"Hello");
        caller c2=new caller(obj,"Hii");
        caller c3=new caller(obj,"Rao Sahab");
    }
}
