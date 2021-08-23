package cisco.java.program.exception;


public class NestedTryDemo {

	public static void main(String[] args) {
		try{
			CheckExecption();  //calling method
			int arr[]={1,3,5,2,4};
			int r=8;
			int a;
			a=arr[r];
		}
		finally{
			System.out.println("Finally outside");
		}
	}
	public static void CheckExecption(){
		try{
			int res=3/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
		finally{
			System.out.println("Finally inside");
		}
	}

}
