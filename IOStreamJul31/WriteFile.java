package IOStreamJul31;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("C:\\abc.txt");
		PrintWriter pw= new PrintWriter(writer);
		
		/*
		 * pw.println("hello"); pw.println("Rays"); pw.println("Tech");
		 * pw.println("Indore");
		 */
		for(int i=0;i<5;i++) {
			pw.println(i+ ":rays");
		}
		pw.close();
		writer.close();
		
		System.out.println("Done");
		

	}

}
