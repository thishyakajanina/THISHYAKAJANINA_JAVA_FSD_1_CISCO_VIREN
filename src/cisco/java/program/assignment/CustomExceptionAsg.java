package cisco.java.program.assignment;

import java.util.Scanner;

public class CustomExceptionAsg {
	static void validate(int salary)throws InvalidSalaryException{
		if(salary<2000){
			throw new InvalidSalaryException(" You need to work hard");
		}
		else if(salary<5000){
			throw new InvalidSalaryException(" Your salary is good ");
		}
		else{
			throw new InvalidSalaryException(" Your salary is very good");
		}
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("salary");
		int salary=scanner.nextInt();
		try{
			validate(salary);
		}
		catch(Exception m)
		{
			System.out.println("Message :"+m.getMessage());
		}

		
	}
}
class InvalidSalaryException extends Exception{
	InvalidSalaryException(String s){
		super(s);
	}
}

