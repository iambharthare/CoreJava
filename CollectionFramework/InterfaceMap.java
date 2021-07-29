package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class InterfaceMap {

	public static void main(String[] args) {
		Map m=new Properties(); //-->> Same for HashMap (Increasing Order)
		
		 m.put(1, 142);
		 m.put(2, "Rahul");
		 m.put(3, 1478.3654);
		 m.put(4, "s");
		 
		 System.out.println(m);
		 System.out.println(m.containsKey(5));
		 System.out.println(m.containsValue("rahul"));  //---->case-sensitive
		 System.out.println(m.entrySet());
		 System.out.println(m.get(3));
		 System.out.println(m.keySet());
		 System.out.println(m.size());
		 System.out.println(m.values());
		 
		 
		 
		
		 

	 

	}

}
