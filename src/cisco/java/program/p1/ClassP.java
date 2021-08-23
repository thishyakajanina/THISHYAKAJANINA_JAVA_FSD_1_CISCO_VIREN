package cisco.java.program.p1;


public class ClassP {
	
	public void methodP(){
		new ClassM().methodM();
		new ClassN().methodN();
	}

	public static void main(String[] args) {
		ClassP Obj= new ClassP();
		Obj.methodP();
	}

}
