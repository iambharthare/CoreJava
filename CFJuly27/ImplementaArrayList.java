package CFJuly27;

import java.util.ArrayList;

public class ImplementaArrayList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		
		  a.add("one");
		  a.add("two"); 
		  a.add("three");
		  a.add("four");
		  
		/*
		 * Integer i = new Integer (4); a.add(i); Integer value= (Integer) a.get(3);
		 * 
		 * System.out.println(a);
		 */
		
		  int size =a.size();
		  for (int j=0; j<size; j++) {
			  System.out.println(j+":"+ a.get(j));
			  
		  }
		
		
		

	}

}
