package cisco.java.program.methods;

public class ParameterizedCons {
	int id;
	String name;
	public ParameterizedCons(){
		System.out.println("inside");
	}
	public ParameterizedCons(int i,String n){
		id=i;
		name=n;
	}
	public void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ParameterizedCons s1 = new ParameterizedCons(111,"gd");
		ParameterizedCons s2 = new ParameterizedCons (222,"tk");
		s1.display();
		s2.display();

	}

}
