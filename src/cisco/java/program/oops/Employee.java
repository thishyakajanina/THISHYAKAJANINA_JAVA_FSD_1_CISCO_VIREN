package cisco.java.program.oops;

public class Employee {
	float salary=40000;
	int bonus=6770;
	
	public void show(){
		System.out.println("parent class");
	
	}
	public void display(){
		System.out.println("display method of the parent class");
	}
}
class Programmer extends Employee
{
	int bonus=10000;
	
	public void show(){
		System.out.println("Bonus of Employee is  "+super.bonus);
		System.out.println("Inside cchild class");
	}
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		System.out.println("Programmer salary is"+p.salary);
		System.out.println("Bonus of Programmer is:"+p.bonus);
		p.show();
		p.display();
	}
}


