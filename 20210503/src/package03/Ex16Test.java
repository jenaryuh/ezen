package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {
		Map<String, Integer> map =
				new HashMap<String , Integer>();
		map.put("�̼���", 25);
		map.put("�̻��", 30);
		map.put("�����", 35);
		
		System.out.println("map�� ũ�� : " + map.size());
		
		System.out.println("������ ��� : " + map.get("�����"));
		
		// map�� ������ ����
		map.remove("�����");
		for(String str : map.keySet()) {
			System.out.println(map.get(str));
		}
		// map�� �ִ� ������ ����
		map.put("�̼���",50); // map�� �ߺ�Ű�� ������� �ʱ� ������ 
		                     // Ű�� ������� ���� ����
		for(String str : map.keySet()) {
			System.out.println("���� �� : " + map.get(str));
		}
		
		// ��ü ����
		map.clear();
		System.out.println("map�� ũ�� : " + map.size());
	}
}
// ������ ���� : put(Ű, ��) �ߺ� Ű�� ������� �ʴ´�.
// �����͸� ���� : put(Ű, ��) Ű�� �����ϴ� Ű�̾�� �Ѵ�.
// Ű�� ������ �� : keySet()
// ���� ������ �� : get(Ű);
// ��� ������ ���� : clear();
// Ư�� �� ���� : remove(Ű) , remove(Ű,��)
// map�� ũ�� : size()
// Ű�� ���� ���� Ȯ�� : containsKey()
