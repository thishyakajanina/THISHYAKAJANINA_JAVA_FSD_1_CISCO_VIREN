package cisco.java.program.p1;

public class ClassN {
	public int e=5;
	double f=100.90;
	protected long d=2;

	public void methodN(){
		System.out.println("Class N Public int value is "+e);
		System.out.println("Class N Default double value is "+f);
		System.out.println("Class N Protected long value is "+d);
	}

	
	public static void main(String[] args) {
		ClassN B= new ClassN();
		B.methodN();
		
	}

}
