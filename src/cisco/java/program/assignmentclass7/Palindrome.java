package cisco.java.program.assignmentclass7;

import java.util.Scanner;

public class Palindrome {
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);	
		String A = in .nextLine();
	
		int n=A.length();
		StringBuffer b= new StringBuffer(A);
		b.reverse();	
		if(n<50){
			
		}
		else{
			System.out.println("No");
		}
	}
}
	
