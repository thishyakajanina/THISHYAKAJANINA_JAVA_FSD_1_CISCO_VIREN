package cisco.java.program.p2;


public class ClassX {
		private int g=78;
		long h=98;
		protected float i=34;
		public char j='h';
		
		public void methodProtected(){
			methodPrivate();
		}

		
		private void methodPrivate() {
			System.out.println("Class X Public char value is "+j);
			System.out.println("Class X Default long value is "+h);
			System.out.println("Class X Protected float value is "+i);
			System.out.println("Class X Private int value is "+g);
			
			
		}
}
