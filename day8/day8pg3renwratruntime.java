import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class day8pg3renwratruntime {
    
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the text add in the file: ");
    String str=sc.nextLine();

    //FileOutputStream to write in the content.

    FileOutputStream f=new FileOutputStream("sample2.txt");

    f.write(str.getBytes());
    f.close();
    //FileInputStream is to read the content.

    FileInputStream fr=new FileInputStream("sample2.txt");
    int i=0;
    while((i=fr.read())!=-1){
        System.out.print((char) i);
    }
    
    fr.close();
    
    

}

}
