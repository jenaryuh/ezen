package package03;

import java.util.Hashtable;
import java.util.Map;

public class Ex19Test {

	public static void main(String[] args) {
		Map<Integer, String> map = 
				new Hashtable<Integer, String>();
		map.put(1, "�̻��");
		map.put(2, "�����");
		map.put(3, "�̼���");
		
		for(Integer i : map.keySet()) {
			String str = map.get(i);
			System.out.println(str);
		}
		map.remove(1);
		for(Integer i : map.keySet()) {
			String str = map.get(i);
			System.out.println(str);
		}
		map.clear();
		System.out.println("ũ�� : " + map.size());
	}
}
