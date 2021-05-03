package package02;

public class Ex03 {

	public static void main(String[] args) {
		// byte , char, short, int, long, float, double, boolean
		// 정수를 문자열로 변환X, 실수나 부울타입도 문자열로 변환X
		// 문자열을 기본 자료형으로 변환X
		// 기본 자료형을  문자열로 변환하고 믄자열을 기본자료형으로 변환이 가능하게 
		// 하기 위한 자료형이 Wrapper 자료형
		int i = 10;
		Integer i1 = 10;
		short s = 10;
		Short s1 = 10;
		byte b = 10;
		Byte b1 = 12;
		long l = 10L;
		Long l1 = 10L;
		float f = 10.5f;
		Float f1 = 10.5f;
		double d = 10.5;
		Double d1 = 10.5;
		boolean bl = true;
		Boolean bl1 = true;
		
		Integer i2 = 100; // 박싱
		int i3 = i2; // 언박싱
		
		// i3 = null;
		i2 = null;
		// Wrapper자료형은 null값을 저장하기 위해서 사용한다.
		// 문자열을 기본 자료형으로 변환하기 위해서 사용
	}

}
