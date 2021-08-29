package cisco.java.program.filehandling;

import java.io.*;
  
import java.io.IOException;

public class FileInputStreamProgram {

	public static void main(String[] args)  throws IOException{
		FileInputStream fin = new FileInputStream ("D://mine/hai.txt");
	
	
	int ch;
	while((ch=fin.read())!=-1)
	{
		System.out.println((char)ch);
		fin.close();
	}
	
	}

}
