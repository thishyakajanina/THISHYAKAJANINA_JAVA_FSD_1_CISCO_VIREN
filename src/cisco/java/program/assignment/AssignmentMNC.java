package cisco.java.program.assignment;

abstract class MNC{
	
	MNC() {
		
	}
	abstract void open();
	abstract void close();							//ABSTRACT METHOD
	void Normal()
	{
		System.out.println("Working...");			//NORMAL METHOD
		
	}
}
abstract class Infosys extends MNC {
	
	void open(){
		System.out.println("Opening Helo....");      //implementation of abstract method in MNC
	}
}
class Helo extends Infosys {
	void open(){
		System.out.println("Opening ....");
	}
	void close(){
		System.out.println("Closing ....");		//	I	MPLEMENTATION OF ALL ABSTRACT METHOD
	}
	void Normal1(){
		System.out.println("Working NORMAL....");			// NORMAL METHOD
	}
}
class AssignmentMNC {
	public static void main(String[] args) {
	Infosys k = new Helo();
	Helo a= new Helo();
	k.open();
	k.close();
	k.Normal();
	a.Normal1();


	}

}