package CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterfaceQueue {

	public static void main(String[] args) {
		/*
		 * Queue q=new PriorityQueue();
		 * 
		 * q.offer(156); q.offer(14); q.offer(94564); q.offer(75645465); q.offer(45856);
		 * 
		 * System.out.println(q); System.out.println(q.peek());
		 * System.out.println(q.poll()); System.out.println(q.peek());
		 * 
		 */
			
		Queue q=new LinkedList();
		 q.offer("debnath");
		 q.offer("rahul");
		 q.offer("vijay");
		 q.offer("abhishek");
		 q.offer("lucky");
		 //q.offer(45856);
		 
		 System.out.println(q);
		 System.out.println(q.peek());
		 System.out.println(q.poll());
        System.out.println(q.peek());
		 
		
	}

}
