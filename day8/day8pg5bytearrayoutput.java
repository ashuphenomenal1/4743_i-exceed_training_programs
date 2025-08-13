import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class day8pg5bytearrayoutput {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.writeBytes("This is soo gooood".getBytes());

        FileOutputStream fos1=new FileOutputStream("barry1.txt");
        FileOutputStream fos2=new FileOutputStream("barry2.txt");

        bos.writeTo(fos1);
        bos.writeTo(fos2);

        //FileInputStream for displaying 

        FileInputStream fi=new FileInputStream("barry1.txt");
        int i=0;
        while((i=fi.read())!=-1){
            System.out.print((char) i);
        }
        
        FileInputStream fi1=new FileInputStream("barry2.txt");
        int j=0;
        while((j=fi1.read())!=-1){
            System.out.print((char) j);
        }


    }
    
}
