interface movie1{
    default void movieDetail1(){
      System.out.println("Iron man is best");
    }
    public void movie1Detail();
    
}

interface movie2 extends movie1{
    public void movie2Detail();
}

class aboutMovie implements movie2{
    aboutMovie(){

    }
    @Override
    public void movie1Detail(){
        System.out.println("Iron Man 1");
    }

    @Override
    public void movie2Detail(){
        System.out.println("Iron man 2 ");
    }

}

public class day3pg3Interex {

    public static void main(String[] args) {
        aboutMovie obj=new aboutMovie();
        
        obj.movie1Detail();
        obj.movie2Detail();
        obj.movieDetail1();
    }
    
}
