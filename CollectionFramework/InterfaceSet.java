package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {

	public static void main(String[] args) {
		Set s= new HashSet();  //-->Arrange in Random order
		 s.add(156);
		 s.add("Vijay");
		 s.add(9.445f);
		 s.add(1.2);
		 s.add("V");
		 s.add("V");
		 s.add(14.2564f); 
		 
		 System.out.println(s);
		 
		 Set t= new TreeSet();   //-->Arrange in Ascending order

		 t.add(156);
		 t.add(156);
		 t.add(14);
		 t.add(94564);
		 t.add(75645465);
		 t.add(45856);
		 //t.add("Vijay");
		//t.add("V");
		 //t.add("V");
		/*
		 * t.add(9.445); t.add(1.2); t.add(14.256);
		 */
		 System.out.println(t);
		 
		 Set l= new LinkedHashSet();  //-->Arrange in Insertion Sequence order
		 l.add(156);
		 l.add("Vijay");
		 l.add(9.445f);
		 l.add(1.2);
		 l.add("V");
		 l.add("V");
		 l.add(14.2564f); 
		 
		 System.out.println(l);



	}

}
