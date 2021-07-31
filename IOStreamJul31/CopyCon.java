package IOStreamJul31;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyCon {

	public static void main(String[] args) throws Exception {
		String target="C:\\abc.txt";
		FileWriter fw= new FileWriter(target);
		PrintWriter pw= new PrintWriter(fw);
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String line=br.readLine();
		while (!line.equals("quit")) {
		 pw.print(line);
		 line=br.readLine();
		 
			
		}
		isr.close();
		pw.close();
		

	}

}
