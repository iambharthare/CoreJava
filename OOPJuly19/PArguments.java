package OOPJuly19;

public class PArguments {

	public static void main(String[] args) {

		PShape[] s = new PShape[3];
		s[0] = new Prectangle(12, 14);
		s[1] = new Pcircle(5);
		s[2] = new Ptriangle(14, 16);

		double totalArea = calcArea(s);

		System.out.println(totalArea);

	}

	public static double calcArea(PShape[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = s[i].area();

		}

		return totalArea;
	}
}
