import java.io.File;
 
class day6pg7filecreation

{

    public static void main(String asd[]) throws Exception

	{

	  File f=new File("d:/java_prg/java_blore_aug25/sample.txt");

	  f.createNewFile();

	  System.out.println(f.isAbsolute());

	  System.out.println(f.getAbsolutePath());

	  boolean ex=f.exists();

	  System.out.println(ex);

	  if(ex)

		{

		   System.out.println("can Read?"+f.canRead());

		   System.out.println("can Write ?"+f.canWrite());

		}
 
	  f.delete();

	  System.out.println("is file is available?\t"+f.exists());

	}

}
 