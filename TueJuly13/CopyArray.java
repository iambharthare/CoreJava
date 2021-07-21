package TueJuly13;

public class CopyArray {

	public static void main(String[] args) {
		char[] copyFrom= {'d','f','g','e','r','t','y','u','k','a','p','t','y' };
		char[] copyTo= new char[8];
		System.arraycopy(copyFrom, 3, copyTo, 0, 8);
		System.out.println("Copied:"+ new String (copyTo));

	}

}
