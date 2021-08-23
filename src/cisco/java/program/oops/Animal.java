package cisco.java.program.oops;

class Animal1 {
	
	public void eat()
	{
	
		System.out.println("Eating...");
	}
}
class Dog1 extends Animal1
	{
		void bark()
		{
			System.out.println("barking...");
			
		}
	}
class Cat extends Animal1
	{
		void meow()
		{
			System.out.println("meowing...");
		}
	}

 class Multilevel{

	public static void main(String args[]){
		
		Cat c = new Cat();
		
		c.meow();
		c.eat();

	}
	

}
