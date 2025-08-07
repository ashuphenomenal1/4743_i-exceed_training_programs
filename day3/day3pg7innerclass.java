class Karnataka{
    String kingname,place;
    int region,reign;
    

    class dynasty
    {
        String dynastyname,capital;
        int period;

        dynasty(String dynastyname,String capital,int period){
            this.dynastyname=dynastyname;
            this.capital=capital;
            this.period=period;
        }

        public void display(){
            System.out.println("Dynasty Name: "+dynastyname);
            System.out.println("Capital Name: "+capital);
            System.out.println("Duration : "+period);
        }
    }

}

public class day3pg7innerclass {
    public static void main(String[] args) {
       Karnataka ka=new Karnataka();
        Karnataka.dynasty dy=ka.new dynasty("Gowdas","Bengaluru",1906);
        dy.display();
    }

}
