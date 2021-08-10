package Threads;

public class TestAcc extends Thread {

	
     public static SynchronisationAcc data = new SynchronisationAcc();
     String name=null;
     
     public TestAcc(String name) {
    	 this.name=name;
     }
@Override
public void run() {
	for(int i=0; i<5;i++) {
		
		try {
			data.deposit(name, 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	TestAcc t1=new TestAcc("Shubham");
	TestAcc t2=new TestAcc("Bharthare");
	
	t1.start();
	t2.start();
	
}

	

}
