package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex15Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("����","����","�̸�");
		list.add(b);
		list.add(new Board("����1","����1","�̸�1"));
		list.add(new Board("����2","����2","�̸�2"));
		list.add(new Board("����3","����3","�̸�3"));
		for(Board bb : list) {
			System.out.println(bb.content);
		}
		
		List<Board> list1 = Arrays.asList(
				new Board("����","����","�̸�"),
				new Board("����1","����1","�̸�1"),
				new Board("����2","����2","�̸�2"),
				new Board("����3","����3","�̸�3"));
		for(Board bb : list1) {
			System.out.println(bb.content);
		}
		
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("����","����","�̸�");
		list2.add(b1);
		list2.add(new Board("����1", "����1", "�۾���1"));
		list2.add(new Board("����2", "����2", "�۾���2"));
		list2.add(new Board("����3", "����3", "�۾���3"));
		list2.add(new Board("����4", "����4", "�۾���4"));
		for(Board bb : list2) {
			System.out.println(bb.content);
		}
	}
}
// ����Ʈ�� �� �߰� add("��"), ����Ʈ�� �ִ� ���� ������ �� get(index)
// ����Ʈ�� �ִ� �� ���� remove(index), remove("��")
// ����Ʈ�� ũ�� size(), 
// ����Ʈ�� �� ���� add(index, "��")
// ����Ʈ ��ü ���� �� ���Ǵ� class : ArrayList, Arrays.asList,
//                              Vector