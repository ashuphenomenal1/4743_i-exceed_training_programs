class first1{

   public void display(){
    System.out.println("Default");
   }  
   public void display(int x,int y){
    System.out.println(x+y);
   }    
   public void display(String str){
    System.out.println(str);
   }  
}


public class first{
    public static void main(String[] args) {
        first1 obj=new first1();
     
        obj.display();
        obj.display(10, 30);
        obj.display("Rao Sahab");

        
    }
}
