package IOStreamJul31;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {

	public static void main(String[] args) throws Exception {
		String source="C:\\shubh.txt";
		String target="C:\\target1.txt";
		
		FileReader fr= new FileReader(source);
		FileWriter fw= new FileWriter(target);
		
		int ch=fr.read();
		while(ch!=-1) {
			fw.write(ch);
			ch=fr.read();
		}
		fw.close();
		fr.close();
 System.out.println(source+"is copied to"+target);
	}

}
