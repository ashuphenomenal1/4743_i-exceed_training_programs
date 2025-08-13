import java.io.FileInputStream;
import java.io.FileOutputStream;


class day8pg2inoutstream{

public static void main(String[] args) throws Exception
{
    //FileOutputStream is to write in to the file.

    FileOutputStream f=new FileOutputStream("sample1.txt");

    String str="Goyal is the most beautiful girl i know";
    byte bystr[]=str.getBytes();  //Fileoutstream can only be written in bytes that is why we are converting the string into the bytes.
    f.write(bystr);
    f.close();
    

    //FileInputStream is used to read the file content.

    FileInputStream fr=new FileInputStream("sample1.txt");

    //to read line by line we will use while loop and also that will be in bytes so we will typecaste it.

    int i=0;
    while((i=fr.read())!=-1){
    System.out.print((char) i);
    }
    fr.close();

}

}
