package CollectionFramework;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InterfaceList {

	public static void main(String[] args) {
		List l =new LinkedList();  //SAME FOR VECTOR, ARRAYLIST
		 l.add(156);
		 l.add("Vijay");
		 l.add(9.445f);
		 l.add(1.2);
		 l.add("V");
		 
		 System.out.println(l);
		 l.add(2, "Shubham");
		 
		 System.out.println(l);
		 System.out.println(l.get(4));
		 System.out.println(l.remove(3));
		 System.out.println(l.set(1,"Bharthare"));
		 System.out.println(l.indexOf("V"));
		 System.out.println(l.subList(1, 4));
		 
	
		 
		
		 

	}

}
