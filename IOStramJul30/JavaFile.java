package IOStramJul30;

import java.io.File;
import java.util.Date;

public class JavaFile {

	public static void main(String[] args) {
		File f=new File("C:\\shubh.txt");
		if(f.exists()) {
			System.out.println("Name: "+f.getName());
			System.out.println("Absolute path: "+f.getAbsolutePath());
			System.out.println("Length: "+f.length());
			System.out.println("Modified: "+new Date(f.lastModified()));
			System.out.println("Is writable: "+f.canWrite());
			System.out.println("Is readable: "+f.canRead());
			System.out.println("Is file: "+f.isFile());
		}
		

	}

}
