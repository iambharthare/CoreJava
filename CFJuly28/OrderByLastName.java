package CFJuly28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrderByLastName implements Comparator<Marksheet>{

	public static void main(String[] args) {
		List l= new ArrayList();
		Marksheet m1= new Marksheet();
		m1.setRollNo("1");
		m1.setFirstname("Rahul");
		m1.setLastname("Verma");
		m1.setChemistry(56);
		m1.setMaths(75);
		m1.setPhysics(46);
		l.add(m1);
		
		Marksheet m2= new Marksheet ();
		l.add(m2);
		m2.setRollNo("2");
		m2.setFirstname("Abhishek");
		m2.setLastname("Gupta");
		m2.setChemistry(76);
		m2.setMaths(54);
		m2.setPhysics(66);
		
		
		Marksheet m3= new Marksheet ();
		l.add(m3);
		m3.setRollNo("3");
		m3.setFirstname("Prakash");
		m3.setLastname("Sharma");
		m3.setChemistry(46);
		m3.setMaths(64);
		m3.setPhysics(96);
		
		Marksheet m4= new Marksheet ();
		l.add(m4);
		m4.setRollNo("2");
		m4.setFirstname("Abhishek");
		m4.setLastname("Chouhan");
		m4.setChemistry(54);
		m4.setMaths(67);
		m4.setPhysics(78);
		
		Collections.sort(l, new OrderByLastName());
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
				

	}

	/*
	 * @Override public int compare(Marksheet m1, Marksheet m2) {
	 * 
	 * return m1.getLastname().compareTo(m2.getLastname()); }
	 */
	
	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		  Marksheet x= (Marksheet)m1; Marksheet y= (Marksheet)m2;
		 
		if (m1.getFirstname().equals(m2.getFirstname())==true) {
			return m1.getLastname().compareTo(m2.getLastname());
			
			
		} 
		else {
			return m1.getFirstname().compareTo(m2.getFirstname());
			} 
			
		

	
		
		
	}

}
