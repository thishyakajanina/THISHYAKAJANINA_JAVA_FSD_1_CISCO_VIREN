package cisco.java.program.p1;

public class ClassM {
	private int a=10;
	long b=100;
	protected float c=2;
	
	public void methodM(){
		System.out.println("Class M Private int value is "+a);
		System.out.println("Class M Default Long value is "+b);
		System.out.println("Class M Protected Float value is "+c);
		
	}

	public static void main(String[] args) {
		
		ClassM A= new ClassM();
		A.methodM();
	}
	

}
