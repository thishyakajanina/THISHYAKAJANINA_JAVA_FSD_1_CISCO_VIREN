package cisco.java.program.oops;


	class Animal {
		public void eat()
		{
		
			System.out.println("Eating...");
		}
	}
	class Dog extends Animal
		{
			void bark()
			{
				System.out.println("barking...");
				
			}
		}
	class BabyDog extends Dog
		{
			void weep()
			{
				System.out.println("weeping...");
			}
		}

	 class Multilevel1{

		public static void main(String args[]){
			
			BabyDog c = new BabyDog();
			
			c.weep();
			c.eat();
			c.bark();
		}
		

	}
