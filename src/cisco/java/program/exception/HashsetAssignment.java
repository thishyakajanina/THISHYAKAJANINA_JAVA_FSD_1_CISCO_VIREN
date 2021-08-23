package cisco.java.program.exception;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashsetAssignment {

	public static void main(String[] args) {
		LinkedHashSet  l1=new LinkedHashSet();
		System.out.println("Enter the input for l1 :");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		float c = input.nextFloat();
		float d = input.nextFloat();
		char e =  input.next().charAt(0);
		char f =input.next().charAt(0);
		int g = input.nextInt();
		boolean bn=input.nextBoolean();
		
		l1.add(a);
		l1.add(b);
		l1.add(c);
		l1.add(d);
		l1.add(e);
		l1.add(f);
		l1.add(g);
		l1.add(bn);
		

		System.out.println("Linkedhashset1 is :"+l1);
		
		
		LinkedHashSet l2=new LinkedHashSet();
		System.out.println("Enter the input for l2 :");
		Scanner input1 =new Scanner(System.in);
		int a1 = input1.nextInt();
		int b1 = input1.nextInt();
		int c1 = input1.nextInt();
		int d1 = input1.nextInt();
		int e1 =  input1.nextInt();
		int f1 =  input1.nextInt();
		int g1 = input1.nextInt();
		int h1 = input1.nextInt();
		
		l2.add(a1);
		l2.add(b1);
		l2.add(c1);
		l2.add(d1);
		l2.add(e1);
		l2.add(f1);
		l2.add(g1);
		l2.add(h1);
		
		System.out.println("Linkedhashset2 is :"+l2);
		
		TreeSet<String> t=new TreeSet<String>();
		t.add("C");
		t.add("c++");
		t.add("HTML");
		t.add("CSS");
		t.add("JAVA");
		t.add("python");
		
		System.out.println("the programming lang in treeset is :"+t);
		System.out.println("Remove two programing lang"+t.remove("C")+t.remove("c++"));
		System.out.println("After removal of two programming lang in treeset is :"+t);
		System.out.println("Add another three programming lang :"+t.add("php")+t.add("c#")+t.add("javascript"));
		System.out.println("After adding of three programming lang in treeset is :"+t);
		System.out.println("check if java is part of programming lang or not in treeset :"+t.contains("JAVA"));
		t.clear();
		System.out.println("After removal of all programming lang in treeset is :"+t);
		

	}

}
