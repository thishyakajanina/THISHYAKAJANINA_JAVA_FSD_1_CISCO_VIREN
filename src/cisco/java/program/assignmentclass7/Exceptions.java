package cisco.java.program.assignmentclass7;


import java.util.Scanner;



public class Exceptions {
	 
	public long power(int n,int p) throws Exception
	{
		if(n==0 && p==0)
		{
			throw new Exception("n and p should not be zero");
		}
		else if (n<0 || p<0)
		{
			throw new Exception("n and p should not be negative");
		}
		else{
			return (long)(Math.pow(n, p));
		}
	}
	
	
	public static void main(String[] args) {
	
		Exceptions calculator = new Exceptions();
	
		Scanner in = new Scanner(System.in);
	
		while (in .hasNextInt()) {
			int n = in .nextInt();
			int p = in .nextInt();
		
		
	try{
		
		System.out.println(calculator.power(n, p));
	}
	catch(Exception e)
	{
	System.out.println(e);
 }
	}
}
}	


