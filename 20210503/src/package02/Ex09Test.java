package package02;

import java.util.ArrayList;
import java.util.List;

public class Ex09Test {

	public static void main(String[] args) {
		List<Integer> map = // 리스트는 index를 사용해서 값을 가져온다.
				new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) { // 1~ 45까지  리스트에 저장
			map.add(i);
		}
		int [] lotto = new int[6]; // 리스트에서 6개의 값을 저장하기 위한 배열

		for(int i = 0; i < lotto.length; i++) {
			// 리스트의 index를 랜덤 값으로 가져옴   // 45 : 0 ~ 44
			                               // 44 : 0 ~ 43
			int num = (int)(Math.random() * map.size()); 
			lotto[i] = map.get(num); // 리스트에 있는 값을 배열에 저장
			map.remove(num); // 배열에 저장된 리스트의 값을 삭제
			                 // 리스트에서 값을 삭제하면 리스트크기는 1씩 감소한다.
		}
		for(int i = 0; i < lotto.length ; i++) {
			System.out.println(lotto[i]);
		}
	}
}