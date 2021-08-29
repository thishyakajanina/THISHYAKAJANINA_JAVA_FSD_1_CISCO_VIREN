package cisco.java.program.innerclass;
class Demo{
	void show(){
		System.out.println("i am show method of super class");
	}
}

public class AnnonnymousInnerClass {
	static Demo d = new Demo (){
		void show(){
			super.show();
			System.out.println("i am in demo class");
		}
	};
	public static void main(String args[]){
		d.show();
	}

}
