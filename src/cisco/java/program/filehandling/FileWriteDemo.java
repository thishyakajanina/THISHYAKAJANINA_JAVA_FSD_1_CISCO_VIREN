package cisco.java.program.filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the data:");
	String input =in.nextLine();
	try{
		FileWriter output = new FileWriter("D://mine/hai.txt");
		 output.write(input);
		 System.out.println("Data written");
		 output.close();
	}
	catch (Exception e){
		e.getStackTrace();
	}
	}

}
