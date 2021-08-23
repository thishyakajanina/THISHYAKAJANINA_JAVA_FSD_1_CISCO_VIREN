package cisco.java.program.exception;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("6");
		lhs.add("25");
		lhs.add("10");
		
		hs.add("Mango");
		hs.add("banana");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Graphes");
		
		ts.add("India");
		ts.add("Pakistan");
		ts.add("Nepal");
		ts.add("America");
		ts.add("China");
		
		System.out.println("Hashset is :"+hs);
		System.out.println("Remove element in Hashset :"+hs.remove("Mango"));
		System.out.println("Does Hashset contains elements :"+hs.contains("Orange"));
		System.out.println("get class :"+hs.getClass());
		
		System.out.println("LinkedHashset is :"+lhs);
		System.out.println("Remove element in LinkedHashset :"+lhs.remove("6"));
		System.out.println("Does LinkedHashset contains elements :"+lhs.contains("5"));
		System.out.println("get class :"+lhs.getClass());
		
		System.out.println("Treeset is :"+ts);
		System.out.println("Remove element in Treeset :"+ts.remove("America"));
		System.out.println("Does Treeset contains elements :"+ts.contains("India"));
		System.out.println("get class :"+ts.getClass());
	}

}
