package cisco.java.program.methods;

public class ConstructorOverload {
	long id;
	String name;
	int age=10;
	ConstructorOverload(long i, String n){
		id=i;
		name=n;
	}
	ConstructorOverload(boolean h, int n){
		
	}
	ConstructorOverload(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		ConstructorOverload s1 = new ConstructorOverload(23,"kk");
		ConstructorOverload s2 = new ConstructorOverload(45,"th",23);
		s1.display();
		s2.display();

	}

}
