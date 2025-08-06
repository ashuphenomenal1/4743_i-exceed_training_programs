class sample{   //super class
    sample(){

    }
        public void display(){
            System.out.println("Inside a super class");
        }
    }


class sample1 extends sample  {

    sample1(){

    }

    public void display(){
       System.out.println("Inside derived class");
    }


} 


    public class day3pg1Polym{

        public static void main(String[] args) {
            sample ref;
            sample obj=new sample();
            sample obj1=new sample();
            ref=obj;
            obj.display();

        }
    }