package cisco.java.program.innerclass;

class MotherBoard{
	static class USB{
		int usb2 =3;
		int usb3 = 1;
		int getTotalPorts(){
			return usb2+usb3;
		}
	}
}
public class StaticNestMain {

	public static void main(String[] args) {
		MotherBoard.USB usb =new MotherBoard.USB();
		System.out.println("Total ports ="+usb.getTotalPorts());

	}

}
