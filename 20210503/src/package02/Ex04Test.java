package package02;

public class Ex04Test {

	public static void main(String[] args) {
		String s1="123";
		//int i = s1;
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		String s2 = "10.5"; 
		/// Integer i3 = Integer.parseInt(s2);
		// System.out.println(i3);
		int i4 = 123;
		if(i1 == i4) {// �Ϲ��ڷ����� Wrapper �ڷ����� ��.
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		if(i1.equals(i4)) {//�Ϲ��ڷ����� Wrapper �ڷ����� equals��
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		System.out.println("MAX ��  : " + Integer.MAX_VALUE);
		System.out.println("MIN ��  : " + Integer.MIN_VALUE);
	}
}