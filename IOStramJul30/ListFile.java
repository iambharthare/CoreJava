package IOStramJul30;

import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("C:\\");
		File [] list=f.listFiles();
		 for (int i=0;i<list.length;i++) {
			 if (list[i].isFile()) {
				 System.out.println((i+1+":"+list[i].getName()));
			 }
			 
		 }


	}

}
