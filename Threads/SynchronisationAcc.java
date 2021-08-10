package Threads;

public class SynchronisationAcc {
	private int balance=0;
	
	public synchronized void deposit(String message, int amount) throws InterruptedException {
		int bal=getBalance();
		setBalance(bal+amount);
		System.out.println(message + " "+getBalance());
		
		}

	public int getBalance() throws InterruptedException {
		Thread.sleep(100);
		return balance;
	}

	public void setBalance(int balance) throws InterruptedException {
		Thread.sleep(100);
		this.balance = balance;
	}
	
	

}
