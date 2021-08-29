package cisco.java.program.innerclass;

class Outer{
	private int age=20;
   void dis(){
	   System.out.println("Inside dis method");
   }
   
   void outerMethod(){
	   System.out.println("Inside outer method");
			   //inner class is local to outer method
	   
	   class Inner{
		   void InnerMethod(){
			   dis();
			   System.out.println("inside method"+age);
			   
		   }
	   }
	   Inner y=new Inner();
	   y.InnerMethod();
   }
public void f(){

}
}

public class MethodlocalInnerclass {

	public static void main(String[] args) {
		Outer x =new Outer();
		x.outerMethod();
	}

}
