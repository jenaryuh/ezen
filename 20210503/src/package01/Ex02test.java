package package01;

import java.util.Scanner;

public class Ex02test {

	public static void main(String[] args) {
		Ex01 ex=new Ex01();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("시작 단을 입력ㅇㅇ");
		int dan1=sc.nextInt();
		System.out.print("끝 단을 입력ㅇㅇ");
		int dan2=sc.nextInt();
		System.out.print("시작 곱을 입력ㅇㅇ");
		int gop1=sc.nextInt();
		System.out.println("끝 곱을 입력ㅇㅇ");
		int gop2=sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);
		
		
		

	}

}
