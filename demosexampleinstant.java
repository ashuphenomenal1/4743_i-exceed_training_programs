class student{
    String name,dept;
    int roll;
    Address adr;

    student(int roll,String name,String dept,Address adr){
     this.roll=roll;
     this.name=name;
     this.dept=dept;
     this.adr=adr;
     

    }

    public void displayStudent(){
        System.out.println("Name "+name);
        System.out.println("roll no. "+roll);
        System.out.println("Department "+dept);
    }
}

public class demosexampleinstant {
public static void main(String[] args) {

    Address ad1=new Address("Bengaluru","Kormangala",560065);
    student st=new student(18,"Ashutosh","CSE",ad1);
    st.displayStudent();

    
}
    
}
