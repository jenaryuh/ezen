package package02;

import java.util.ArrayList;
import java.util.List;

public class Ex09Test {

	public static void main(String[] args) {
		List<Integer> map = // ����Ʈ�� index�� ����ؼ� ���� �����´�.
				new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) { // 1~ 45����  ����Ʈ�� ����
			map.add(i);
		}
		int [] lotto = new int[6]; // ����Ʈ���� 6���� ���� �����ϱ� ���� �迭

		for(int i = 0; i < lotto.length; i++) {
			// ����Ʈ�� index�� ���� ������ ������   // 45 : 0 ~ 44
			                               // 44 : 0 ~ 43
			int num = (int)(Math.random() * map.size()); 
			lotto[i] = map.get(num); // ����Ʈ�� �ִ� ���� �迭�� ����
			map.remove(num); // �迭�� ����� ����Ʈ�� ���� ����
			                 // ����Ʈ���� ���� �����ϸ� ����Ʈũ��� 1�� �����Ѵ�.
		}
		for(int i = 0; i < lotto.length ; i++) {
			System.out.println(lotto[i]);
		}
	}
}