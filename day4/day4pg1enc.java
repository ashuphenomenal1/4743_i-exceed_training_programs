class sample{
    private String name,address;
    private int rollno,busnumber;

    sample(String name,String address,int rollno,int busnumber){
        this.name=name;
        this.address=address;
        this.rollno=rollno;
        this.busnumber=busnumber;

    }

    //method for get or to display

    public String getname(){
            return name;
    }
    public String getaddress(){
            return address;
    }
    public int getrollno(){
            return rollno;
    }
    public int busnumber(){
            return busnumber;
    }
        //setter method to set the value in class.


    public void setname(){
            this.name=name;
    }

    public void setaddress(){
            this.address=address;
    }

    public void setrollno(){
            this.rollno=rollno;
    }

    public void setbusnumber(){
            this.busnumber=busnumber;
    }

}


public class day4pg1enc {

    public static void main(String[] args) {
        sample obj=new sample("Ritu Singh","MPI",5,4);
        System.out.println(obj.getname());
        System.out.println(obj.getaddress());
        System.out.println(obj.getrollno());
    }
    
}
