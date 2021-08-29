package cisco.java.program.filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("D://mine/hai.txt");
		BufferedOutputStream bout= new BufferedOutputStream(fout,1024);
		System.out.println("Enter text (@ at the end");
		char ch;
		while((ch=(char)dis.read())!='@')
		{
			bout.write(ch);
		}
		bout.close();
	}

}
