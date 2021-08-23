package cisco.java.program.oops.inheritance;

abstract class Bike {
	Bike() {
		System.out.println("Bike is created...");
	}
	abstract void run1();
	void changeGear()
	{
		System.out.println("Gear changed...");
		
	}
}
abstract class Honda extends Bike {
	Honda(){
		System.out.println("Honda is created..");
		
	}
	abstract void run();
	abstract void run1();
}
class Hello extends Honda {
	void run(){
		System.out.println("RUNNING SAFELY....");
	}
	void run1(){
		System.out.println("Runnig....");
	}
}
class AbstractExample {
	
	public static void main(String[] args) {
	Honda k = new Hello();
	k.run();
	k.run1();
	k.changeGear();

	}

}
