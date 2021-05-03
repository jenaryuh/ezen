package package03;

import java.util.Random;

public class Ex10Test {

	public static void main(String[] args) {
		double num = Math.random(); // 0.000000000000000
		                            // ~0.99999999999999
		int num1 = (int)Math.random();
		int num2 = (int)(0.25);
		int num3 = (int)(1.65);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		System.out.println(num);
		System.out.println(num1);
		
		int num4 = (int)Math.random() * 3; // 0,1,2
		/// 0.000000000 * 3 = 0.0000000000
		/// 0.999999999 * 3 = 2.99999999987
		System.out.println(num4); // 0,1,2
		int num5 = (int)Math.random() * 9; // 0,1,2,3,4,5,6,7,8
		/// 0.000000000 * 9 = (int)0.000000000
		/// 0.99999999 * 9  = (int)8.9999999987
		int num6 = (int)Math.random() * 45;
		/// 0,1,2,3,4,5,6,7,8,9,...,44 
		int num7 = (int)(Math.random() * 45) + 1;
		/// 0,1,2,3,4,5,6,7,8,9,...,44 + 1
		/// 1,2,3,4,5,6,7,8,9,...,45
		Random rnd = new Random();// seed
		int num8 = rnd.nextInt(45);// 0,1,2,3,4,5,6,7,8,9,...,44
		System.out.println("num8 : " + num8);
		int num9 = rnd.nextInt(45) + 1; // 1,2,3,4,5,6,7,8,...,45
		System.out.println("num9 : " + num9);
	}
}