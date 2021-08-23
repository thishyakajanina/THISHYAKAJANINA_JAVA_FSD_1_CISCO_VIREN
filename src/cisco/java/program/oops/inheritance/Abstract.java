package cisco.java.program.oops.inheritance;

abstract class Abstract {
	private String name="abc";
	public Abstract() {
		System.out.println("Inside the abstract class.....");
	}
	public void MyMethod(){
		System.out.println("Hello" +name);
	}
	
	abstract public void anotherMethod();
}
class BasicAbstractExample extends Abstract {
	BasicAbstractExample(){
		super();
		System.out.println("Inside the child class ");
	}
	public void anotherMethod(){
		System.out.println("Abstract Method   :");
	}
	public static void main(String[] args) {
		
		Abstract obj=new BasicAbstractExample();
		obj.anotherMethod();
		obj.MyMethod();

	}

}
