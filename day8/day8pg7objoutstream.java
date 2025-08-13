
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class employee implements Serializable
{
    String ename,desgn;
    int salary;
    
    employee(String ename,String desgn,int salary){
        this.ename=ename;
        this.desgn=desgn;
        this.salary=salary;
    }
}

public class day8pg7objoutstream {

    public static void main(String[] args) throws Exception
     {
        employee em=new employee("Ashutosh", "Software Engineer", 23060);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
        obj.writeObject(em);
        obj.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("employee.txt")));
        employee e=(employee)ois.readObject();
        ois.close();

        System.out.println("Name of the Employee: "+e.ename);
        System.out.println("Designation : "+e.desgn);
        System.out.println("Salary: "+e.salary);
 
    }
    
}
