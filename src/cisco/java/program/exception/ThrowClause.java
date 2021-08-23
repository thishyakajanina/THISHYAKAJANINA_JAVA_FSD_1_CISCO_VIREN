package cisco.java.program.exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowClause {
	static int add(int num1,int num2){
		if(num1>900){
			throw new ArithmeticException("..err");
		}
		else{
			try {
				throw new IOException("err IO");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return num1+num2;
	}
	public static void main(String args []){
		int result=0;
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("num1");
		int num1=scanner.nextInt();
		
		System.out.println("num12");
		int num2=scanner.nextInt();
		
		try{
			result=add(num1,num2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		System.out.println("result"+result);
	}

}
