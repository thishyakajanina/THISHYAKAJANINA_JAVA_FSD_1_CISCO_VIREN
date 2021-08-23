package cisco.java.program.p2;
import cisco.java.program.p1.ClassM;
import cisco.java.program.p1.ClassN;

public class ClassY extends ClassN{

	public static void main(String[] args) {
		new ClassM().methodM();
		new ClassN().methodN();
		new ClassX().methodProtected();
		
		
	}

}
