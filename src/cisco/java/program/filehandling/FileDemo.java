package cisco.java.program.filehandling;
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		try{
		
			File file=new File("D://mine/thish.txt");
		
		if(file.createNewFile())
		{
			System.out.println("Newfile is Created!!!");
		}
		else{
			if(file.exists())
			{
				System.out.println("File already Exists!!");
				System.out.println("File path:"+file.getAbsolutePath());
				System.out.println("File name:"+file.getName());
				System.out.println("File class:"+file.getClass());
				System.out.println("File Parent:"+file.getParent());
				System.out.println("File length:"+file.length());
			}
			else
			{
				System.out.println("File doesnot exists");
			}
			boolean b =file.delete();
			if(b==true)
			{
				System.out.println("File deleted!!1");
			}
			else
			{
				System.out.println("File not deleted");
			}
		}
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		
		}
	}



