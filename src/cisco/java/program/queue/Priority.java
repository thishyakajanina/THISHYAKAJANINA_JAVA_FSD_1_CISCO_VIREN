package cisco.java.program.queue;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("India");
		queue.add("America");
		queue.add("China");
		queue.add("Sri Lanka");
		queue.add("Japan");
		queue.add("Africa");
		queue.add("Canada");
		
		System.out.println("Priority Queue elements :"+queue);
		queue.poll();
		queue.poll();
		System.out.println("After removal of two country Priority Queue elements :"+queue);
		queue.add("Russia");
		queue.add("England");
		System.out.println("After adding of two country Priority Queue elements :"+queue);
		System.out.println("Head using peek :"+queue.peek());

	}

}
