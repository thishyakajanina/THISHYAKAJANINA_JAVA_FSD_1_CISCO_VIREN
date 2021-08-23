package cisco.java.program.p2;

import cisco.java.program.p1.ClassM;
import cisco.java.program.p1.ClassN;
import cisco.java.program.p1.ClassP;

public class ClassZ extends ClassM{

	public static void main(String[] args) {
		new ClassX().methodProtected();
		new ClassM().methodM();
		new ClassN().methodN();
		new ClassP().methodP();

	}

}
