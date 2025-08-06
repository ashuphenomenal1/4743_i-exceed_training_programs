
class sample {
  public void display(){System.out.println("inside display");}
  public void display(int x,int y){
    System.err.println(x*y);
  }
  public void display(String str){
    System.err.println("my name is "+str);
  }
 
}
 
class demomethodover
 {
      public static void main(String[] args) {
         sample obj=new sample();
         obj.display("Rao Sahab");
         obj.display();
         obj.display(10, 10);
      }
 }