package cisco.java.program.filehandling;


import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


public class FileReaderDemo {

	public static void main(String[] args) {
		
	char[] array =new char[50];
	try{
		FileReader input = new FileReader("D://mine/hai.txt");
		
		input.read(array);
		 System.out.println("Data in the file");
		 System.out.println(array);
		 input.close();
	}
	catch (Exception e){
		e.getStackTrace();
	}
	}
}