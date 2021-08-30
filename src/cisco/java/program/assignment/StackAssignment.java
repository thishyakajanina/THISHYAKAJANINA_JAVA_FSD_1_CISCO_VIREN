package cisco.java.program.assignment;
import java.util.*;  
public class StackAssignment {
	

	public static void main(String[] args) {
	
		Stack<Integer> stack =new Stack <Integer>();
		System.out.println("Enter the stack: ");
		for(int i=0;i<5;i++){
			Scanner a = new Scanner(System.in);
			int number = a.nextInt();
			stack.push(number);
		}

		System.out.println("remove top element : "+stack.pop());
		System.out.println(" stack: "+stack);
		System.out.println("remove the another top element: "+stack.pop());
		System.out.println(" stack: "+stack);
		
		System.out.println("get the top of the element "+stack.peek());
		
		
		System.out.println("Enter the stack to be searched: ");
		
		Scanner b = new Scanner(System.in);
		int sn=b.nextInt();
		
		System.out.println("search the stack: "+stack.search(sn));
		
	}

}
