package package02;

public class Ex05Test {

	public static void main(String[] args) {
		String f = "12.4";
		Float f1 = Float.parseFloat(f);
		System.out.println(f1 + 20.5);
		Float f2 = new Float(f);
		System.out.println(f2 + 20.5);
		
		System.out.println("byte : " + f1.byteValue());
		System.out.println("long : " + f1.longValue());
		System.out.println("long : " + f1.shortValue());
		System.out.println("long : " + f1.intValue());
		
		System.out.println("MAX �� " + Float.MAX_VALUE);
		System.out.println("MIN �� " + Float.MIN_VALUE);
	}
}
