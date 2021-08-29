package cisco.java.program.innerclass;

public  class StaticNested {
	static int u=90;
	private static void outermethod(){
		System.out.println("Inside method");
	}
	
	static class Inner{
		public static void main(String[]args){
			System.out.println("Inside inner class method"+u);
			outermethod();
		}
		
	}
}
