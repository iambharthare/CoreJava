package CFJuly27;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ImplementEnumeration {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		 v.add(1);
		 v.add(2);
		 v.add("v");
		 v.add("Shubham");
		 v.add(54.359);
		 v.add(12.54799f);
		 
		 Enumeration em = v.elements();
		 
		 while (em.hasMoreElements()) {
			Object object = (Object) em.nextElement();
			System.out.println(object);
		}
	

	}

}
