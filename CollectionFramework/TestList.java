package CollectionFramework;
import java.util.List;
import java.util.ArrayList;


public class TestList {

	public static void main(String[] args) {
		List l= new ArrayList();
		 l.add(156);
		 l.add("Vijay");
		 l.add(9.445f);
		 l.add(1.2);
		 l.add("V");
		 l.add("d");
		 l.add(14.2564f); 
		
		 System.out.println(l);
		 System.out.println( l.size());
		 
	 for (Object e : l) {
		 System.out.println(e);
		}
	 
	 List s= new ArrayList();
	 s.add(14);
	 s.add("d");
	 s.add(14.2564f); 
	 s.add("Shubham");
	 s.addAll(l);
	 s.add("Vijay");
	 
	 //s.clear();
	 //s.remove(2);
	 
	 System.out.println(s);
	 System.out.println(s.containsAll(l));
	// System.out.println(s.iterator());
	 
	// System.out.println(s.removeAll(l));
	 System.out.println(s.retainAll(l));
	 
	 
	 
	
		 
		
		 


	}

}
