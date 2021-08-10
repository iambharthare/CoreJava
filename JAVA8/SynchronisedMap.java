package JAVA8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedMap extends Thread {
	private static Map hm = Collections.synchronizedMap(new HashMap());

@Override
public void run() {
	hm.put("five", 5);
}

	public static void main(String[] args) {
		hm.put("One", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);

		SynchronisedMap t1 = new SynchronisedMap();
		t1.start();
		for (Object o : hm.entrySet()) {
			System.out.println(o);

		}
		System.out.println(hm);

	}
}
