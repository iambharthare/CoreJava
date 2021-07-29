package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InterfaceDeque {

	public static void main(String[] args) {
		Deque d = new LinkedList();
		 d.addFirst(1);
		 d.offer("debnath");
		 d.offer("rahul");
		 d.offer("vijay");
		 d.offer("abhishek");
		 d.offer("lucky");
		 d.addLast(1452.235f);
		 System.out.println(d);
		 System.out.println(d.peekFirst());
		 System.out.println(d.pollLast());
		 System.out.println(d.poll());
		 System.out.println(d);
		 System.out.println(d.contains("lucky"));
	    
	    
	    		
	    		
	}

}
