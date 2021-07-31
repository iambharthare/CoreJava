package IOStramJul30;

import java.io.File;

public class DisplayFile {

	public static void main(String[] args) {
		File directory=new File("C:\\Program Files\\Microsoft Office\\Office14");
		String[]list = directory.list();
		for(int i=0; i<list.length; i++) {
			File f=new File("C:\\Program Files\\Microsoft Office\\Office14",list[i]);
			if (f.isFile()) {
				System.out.println((i+1 +":"+list[i]));
			}
			
		}

	}

}
