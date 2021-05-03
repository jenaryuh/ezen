package package03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11Test {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String strNow = now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now);
		/// 날짜를 문자열로 변환 sdf.format(날짜)
		System.out.println(strNow2);
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss am");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 SS");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 w주 HH시 mm분 ss초 SS");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 W주 HH시 mm분 ss초 SS");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
