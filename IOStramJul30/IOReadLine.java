package IOStramJul30;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOReadLine {

	public static void main(String[] args) throws Exception {
		FileReader reader= new FileReader("c:\\shubh.txt");
	   BufferedReader bfr=new BufferedReader(reader);
	   
	   String line=bfr.readLine();
	   while (line != null){
		   System.out.println(line);
		   line=bfr.readLine();
		   
	   }

	}

}
