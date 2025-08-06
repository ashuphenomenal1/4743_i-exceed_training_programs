
class student
{
    String name;
    int age;
    String dept;
    static String college="Gct";
 
    student(String name,int age,String dept)
	{
	   this.name=name;
	   this.age=age;
	   this.dept=dept;
	}
 
    public void displayStudent()
	{
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
	   System.out.println("Department="+dept);
	   System.out.println("College="+student.college);
 
	}
 
}
 
class democlassvar
{
    public static void main(String ads[])
	{
	   student obj1=new student("Rakesh",21,"CSE");
	   student obj2=new student("Bhargav",23,"Ece");
	   obj2.displayStudent();
	} 
}
