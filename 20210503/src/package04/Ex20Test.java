package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {
	public static void main(String[] args) {
		   // ���̵�
		Map<String, Student> map = 
				new HashMap<String, Student>();
		                       // ��й�ȣ        �̸�
		Student std = new Student("123456", "�̼���");
		map.put("high1", std);
		std = new Student("234567", "�̻��");
		map.put("high2", std);
		std = new Student("121212", "�����");
		map.put("high3", std);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = sc.nextLine();	
			System.out.print("��й�ȣ: ");
			String password = sc.nextLine();
			// map�� Ű�� �����ϴ� �� 
			if(map.containsKey(id)) {
				Student std1 = map.get(id);
				if(std1.sno.equals(password)) {
					// ���̵� ���� ��й�ȣ�� ����
					System.out.println("�α��εǾ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}else {
				System.out.println("���̵��������� �ʽ��ϴ�.");
			}
		}
	}
}