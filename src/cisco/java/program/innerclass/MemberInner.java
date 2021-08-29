package cisco.java.program.innerclass;

public class MemberInner {
	private int data=30;
	
	void display(){
		System.out.println("I am inside the outer class");
	}
	
	class Inner{
		void msg(){
			MemberInner.this.display(); //its for calling the outer class method in inner class
			System.out.println("data is "+data);
		}
		//calling the duplicate of outer class
		void display(){
			System.out.println(" I am inside the inner class");
		
		//inner class accessing the outside private variable
		}
	}
	public static void main(String[] args) {
		MemberInner obj = new MemberInner();		//creating object of outer class
		MemberInner.Inner in =obj.new Inner();		//creating object of inner class
		in.msg();
		in.display();
		

	}

}
