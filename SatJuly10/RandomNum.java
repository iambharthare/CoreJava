package SatJuly10;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		int otp;
		Random r= new Random();
		
			for (int i=0; i<5; i++) {
				
				otp=r.nextInt(9);
				System.out.println(otp);
			}
		}


	
}
