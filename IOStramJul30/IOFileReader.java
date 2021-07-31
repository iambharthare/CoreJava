package IOStramJul30;

import java.io.FileReader;

public class IOFileReader {

	public static void main(String[] args) throws Exception{
		FileReader reader= new FileReader ("c:\\shubh.txt");
		int ch =reader.read();
		char chr;
while(ch!=-1) {
	chr= (char) ch;
	System.out.print(chr);
	ch=reader.read();
}
	

	}

}
