package CFJuly27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ImplementIterator {

	public static void main(String[] args) {
		 List a = new ArrayList();
		 
		 a.add(1);
		 a.add(2);
		 a.add("v");
		 a.add("Shubham");
		 a.add(54.359);
		 a.add(12.54799f);
		 
		 Iterator it = a.iterator();
		 
		// a.add(1645435); --->> Concurrent modification exception; can't modify after iterator is created
		 while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
			//System.out.println(it.next());
		}
		 

	}

}
