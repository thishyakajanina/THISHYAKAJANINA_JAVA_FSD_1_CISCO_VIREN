package cisco.java.program.methods;

public class MethodOverload {
	
	public void area(int b,int h){
		System.out.println("Area of Triangule  :"+(0.5*b*h));
	}
	public void area(long r){
		System.out.println("Area of Circle  :"+(3.14*r*r));
	}
	public void area(float g,int c){
		System.out.println("Printing the value  :"+g+"----"+c);
	}
	public void area(int h,float j,char a){
		System.out.println("Area of Triangular  :"+h+"-----"+j+"----"+a);
	}


	public static void main(String[] args) {
		MethodOverload ob =new MethodOverload();
		ob.area(6);
		ob.area(5,9);
	}

}
