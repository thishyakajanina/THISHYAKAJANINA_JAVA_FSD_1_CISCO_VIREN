package AssignmentLesson1;
import java.util.*;

public class ArithmeticCalculator {

	public static void main(String []args){
        int a,b,c;
        float result=0;
        /*scanner class object to read values*/
        Scanner sc=new Scanner(System.in); 
         
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
         
        System.out.println("\n 1: Addition.");
        System.out.println("\n 2: Subtraction.");
        System.out.println("\n 3: Multiplication");
        System.out.println("\n 4: Division.");
        System.out.println("\n 5: Exit.");
       
         
        System.out.print("\nEnter your choice: ");
        c=sc.nextInt();
         
        switch(c)
        {
            case 1:
                result=(a+b);
                break;
            case 2:
                result=(a-b);
                break;
            case 3:
                result=(a*b);
                break;
            case 4:
                result=(float)((float)a/(float)b); 
                break;
            
            default:
                System.out.println("An Invalid Choice!!!\n");
        }
        if(c>=1 && c<=4){
           System.out.println("Result is: " + result);
         
        	}
        }
        
}