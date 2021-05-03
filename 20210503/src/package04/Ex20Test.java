package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {
	public static void main(String[] args) {
		   // 아이디
		Map<String, Student> map = 
				new HashMap<String, Student>();
		                       // 비밀번호        이름
		Student std = new Student("123456", "이숭무");
		map.put("high1", std);
		std = new Student("234567", "이상범");
		map.put("high2", std);
		std = new Student("121212", "이장범");
		map.put("high3", std);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = sc.nextLine();	
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			// map에 키가 존재하는 지 
			if(map.containsKey(id)) {
				Student std1 = map.get(id);
				if(std1.sno.equals(password)) {
					// 아이디도 같고 비밀번호도 같음
					System.out.println("로그인되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디존재하지 않습니다.");
			}
		}
	}
}