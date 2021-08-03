package IOStreamAug2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * Scanner sc1= new Scanner(System.in);
		 * System.out.println("Enter first value:"); int a= sc1.nextInt();
		 * 
		 * Scanner sc2=new Scanner(System.in);
		 * System.out.println("Enter second value:"); int b= sc2.nextInt(); int c=a+b;
		 * 
		 * System.out.println("Sum is "+c);
		 */
		Scanner sc =new Scanner(System.in);
		
		String add ="+";
		String sub ="-";
		String multi ="*";
		String div="/";
		
		String op=sc.next();
		
		while (op.equals(add)) {
			
			int a=sc.nextInt();
		    int b= sc.nextInt();
			int c= a+b;
			System.out.println(c);
			break;
		}
		
		  while (op.equals(sub)) {
		  
		  int a=sc.nextInt(); 
		  int b= sc.nextInt(); 
		  int c= a-b; 
		  System.out.println(c);
		  break;
		  }
		  
		  while (op.equals(multi)) {
		  
		  int a=sc.nextInt(); 
		  int b= sc.nextInt(); 
		  int c= a*b; 
		  System.out.println(c); 
		  break;
		  }
		  while (op.equals(div)) {
		  
		  int a=sc.nextInt(); 
		  int b= sc.nextInt(); 
		  int c= a/b; 
		  System.out.println(c); 
		  break;
		  }
		 
	}

}
