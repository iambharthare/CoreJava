package JAVA8;

//---->>>>Anonymous Function


public class TestInterface {

	public static void main(String[] args) {
		HelloInt1 h = new HelloInt1 () {
			
		@Override
			public void say() {
				System.out.println("Anonymus Function");
				} 
		};
		h.say();

}
}