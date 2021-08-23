package cisco.java.program.methods;

public class ConstructorEX {
	int id;
	String name;
	public ConstructorEX(){
		id=10;
		name="hello";
		System.out.println("its default constructor");
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args){
		ConstructorEX s1;
		s1 = new ConstructorEX();
		ConstructorEX s2 =new ConstructorEX();
		s1.display();
		s2.display();
	}

}
