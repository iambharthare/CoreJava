package Threads;

public class TestThread {

	public static void main(String[] args) {
		DemoThread dt1 = new DemoThread("Bairagi");
		DemoThread dt2 = new DemoThread("Mayank");
		
		Thread th1= new Thread(dt1);
		Thread th2= new Thread(dt2);
		
		th1.start();
		th2.start();
		

	}

}
