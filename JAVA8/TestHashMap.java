package JAVA8;

import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap extends Thread {
	private static ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();

	@Override
	public void run() {
		chm.put("Five", 5);
	}

	public static void main(String[] args) {
		chm.put("one", 1);
		chm.put("two", 2);
		chm.put("three", 3);
		chm.put("four", 4);

		TestHashMap t1 = new TestHashMap();
		t1.start();
		for (Object o : chm.entrySet()) {
			System.out.println(o);

		}
		System.out.println(chm);

	}

}
