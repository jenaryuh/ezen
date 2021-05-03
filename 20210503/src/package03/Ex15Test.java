package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex15Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("제목","내용","이름");
		list.add(b);
		list.add(new Board("제목1","내용1","이름1"));
		list.add(new Board("제목2","내용2","이름2"));
		list.add(new Board("제목3","내용3","이름3"));
		for(Board bb : list) {
			System.out.println(bb.content);
		}
		
		List<Board> list1 = Arrays.asList(
				new Board("제목","내용","이름"),
				new Board("제목1","내용1","이름1"),
				new Board("제목2","내용2","이름2"),
				new Board("제목3","내용3","이름3"));
		for(Board bb : list1) {
			System.out.println(bb.content);
		}
		
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("제목","내용","이름");
		list2.add(b1);
		list2.add(new Board("제목1", "내용1", "글쓴이1"));
		list2.add(new Board("제목2", "내용2", "글쓴이2"));
		list2.add(new Board("제목3", "내용3", "글쓴이3"));
		list2.add(new Board("제목4", "내용4", "글쓴이4"));
		for(Board bb : list2) {
			System.out.println(bb.content);
		}
	}
}
// 리스트에 값 추가 add("값"), 리스트에 있는 값을 가져올 때 get(index)
// 리스트에 있는 값 삭제 remove(index), remove("값")
// 리스트의 크기 size(), 
// 리스트에 값 삽입 add(index, "값")
// 리스트 객체 만들 때 사용되는 class : ArrayList, Arrays.asList,
//                              Vector