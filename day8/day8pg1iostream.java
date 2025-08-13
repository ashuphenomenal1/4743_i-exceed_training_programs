import java.io.FileReader;
import java.io.File;
class day8pg1iostream{
    public static void main(String[] args) throws Exception
    {
        File f=new File("C:/Users/ashutosh.kumar/.vscode/sample.txt");
        FileReader fr=new FileReader(f);
        int i=0;
        while((i=fr.read())!=-1){ 
            System.out.print((char)i); //typecasting since read file throws integer
        }
    }
}
