package CFJuly28;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet extends Marksheet {

	public static void main(String[] args) {
		List l= new ArrayList();
		Marksheet m1= new Marksheet();
		m1.setRollNo("1");
		m1.setChemistry(56);
		m1.setMaths(75);
		m1.setPhysics(46);
		l.add(m1);
		
		Marksheet m2= new Marksheet ();
		l.add(m2);
		m2.setRollNo("2");
		m2.setChemistry(76);
		m2.setMaths(54);
		m2.setPhysics(66);
		
		
		Marksheet m3= new Marksheet ();
		l.add(m3);
		m3.setRollNo("3");
		m3.setChemistry(46);
		m3.setMaths(64);
		m3.setPhysics(96);
		
		Collections.sort(l);
		
		Iterator it=l.iterator();
		while (it.hasNext()) {
			Object n = (Object) it.next();
			System.out.println(n);
			
		}
		
		/*
		 * System.out.println(l); System.out.println(l.contains(m2));
		 * System.out.println(l.remove(m2)); System.out.println(m2.equals(m3));
		 */
	
		
		
	}
	

}
