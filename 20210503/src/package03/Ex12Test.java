package package03;

import java.util.*;

public class Ex12Test {

	public static void main(String[] args) {
		// ����: �ڷḦ �ϳ��� ����
		// �迭 : ���� �ڷ��� �����͸� ������ ũ�� ��ŭ ����
		// class :���� ������ �����͸� ������ �� �ְ� ����
		// �÷��� : ũ�Ⱑ �������� ���� �ڷ���.(List, Map, set,...)
		//        ũ�⸦ ���������� ����� �� �ְ� ����� ����.
		// List�� Map�� ���̴� index�� ����ϴ��� �Ǵ� Ű�� ����ϴ���
		List<String> list = new ArrayList<String>();
		list.add("�̻��"); // 0
		list.add("�����"); // 1
		// DataBase       //2
		list.add("�̻�"); // 2
		list.add("���湫"); // 3
		list.add("�����"); // 4
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("����Ʈ�� ũ�� : " + list.size());
		
		String str = list.get(2);
		System.out.println("2�� index " +  str);
	
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(3); // index�� �̿��ؼ� ����
		System.out.println(list.get(3));
		System.out.println(list.size());
	
		list.add(2, "Database"); //2�� index�� �߰�
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove("Database"); // value�� �̿��ؼ� ����.
		System.out.println(list.get(2));
	}
}