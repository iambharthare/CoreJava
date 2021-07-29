package CFJuly28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrderByName implements Comparator<Marksheet> {

	public static void main(String[] args) {
		List l= new ArrayList();
		Marksheet m1= new Marksheet();
		m1.setRollNo("1");
		m1.setFirstname("Rahul");
		m1.setChemistry(56);
		m1.setMaths(75);
		m1.setPhysics(46);
		l.add(m1);
		
		Marksheet m2= new Marksheet ();
		l.add(m2);
		m2.setRollNo("2");
		m2.setFirstname("Abhishek");
		m2.setChemistry(76);
		m2.setMaths(54);
		m2.setPhysics(66);
		
		
		Marksheet m3= new Marksheet ();
		l.add(m3);
		m3.setRollNo("3");
		m3.setFirstname("Prakash");
		m3.setChemistry(46);
		m3.setMaths(64);
		m3.setPhysics(96);
		
		
		Collections.sort(l, new OrderByName());
		Iterator it= l.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}

	}

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
    	return m1.getFirstname().compareTo(m2.getFirstname());
	}

}
