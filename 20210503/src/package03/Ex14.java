package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("����","����","�̸�");
		list.add(b);
		b = new Board("����1","����1","�̸�1");
		list.add(b);
		b = new Board("����2","����2","�̸�2");
		list.add(b);
		for(Board bd : list) {
			System.out.println(bd.content+","+bd.subject+","+bd.writer);
		}
		
		for(int idx = 0; idx < list.size();  idx++) {
			Board bd = list.get(idx);
			System.out.println(bd.content+","+bd.subject);
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); list1.add(2); list1.add(3);
		
		for( Integer i : list1) {
			System.out.println(i);
		}
	}

}
