package Threads;

public class ThreadInfo {

	public static void main(String[] args) {
		Thread t= new Thread("My Thread");
		log("", t);
		
	}

	private static void log(String indent, Thread t) {
		System.out.println(indent+"THREAD NAME: "+t.getName());
		System.out.println(indent+"ID"+t.getId());
		System.out.println(indent+"Priority: "+t.getPriority());
		System.out.println(indent+"State: "+t.getState());
		System.out.println(indent+"is Alive: "+t.isAlive());
		System.out.println(indent+"is Daemon: "+t.isDaemon());
		
		
	}
	
}
