package package01;

import java.util.Scanner;

public class Ex02test {

	public static void main(String[] args) {
		Ex01 ex=new Ex01();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� ���� �Է¤���");
		int dan1=sc.nextInt();
		System.out.print("�� ���� �Է¤���");
		int dan2=sc.nextInt();
		System.out.print("���� ���� �Է¤���");
		int gop1=sc.nextInt();
		System.out.println("�� ���� �Է¤���");
		int gop2=sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);
		
		
		

	}

}
