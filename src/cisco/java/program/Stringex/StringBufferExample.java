package cisco.java.program.Stringex;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Welcome");
		sb.append("to cisco");
		System.out.println(sb);
		
		sb.insert(1, "cisco");
		System.out.println(sb);
		
		sb.replace(2, 7, "progarm");
		System.out.println(sb);
		
		sb.delete(2, 7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.charAt(6));
		
		StringBuilder sd= new StringBuilder("Welcome to java program");
		
		System.out.println(">>>>>>>"+sd);
		sd.append("cisco");
		System.out.println(">>>>>"+sd);
		System.out.println(sd.length());
		System.out.println(sd.charAt(6));
		System.out.println(sd.reverse());
		
	}
}
