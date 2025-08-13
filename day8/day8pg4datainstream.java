import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class day8pg4datainstream{
    public static void main(String[] args) throws Exception {
        File f=new File("sample3.txt");
        FileOutputStream fout=new FileOutputStream(f);
        DataOutputStream dout=new DataOutputStream(fout);

        dout.writeInt(17);
        dout.writeBoolean(false);
        dout.writeDouble(10.33);

        dout.close();

        //display with FileInputStream.

        DataInputStream din=new DataInputStream(new FileInputStream(f));
        System.out.println(din.readInt());
        System.out.println(din.readBoolean());
        System.out.println(din.readDouble());

    }
}