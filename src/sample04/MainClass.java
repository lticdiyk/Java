package sample04;

public class MainClass {
	public static void main(String[] args) {
		
		// 자료형 변환
		// short(2), int(4), long(8), double(8), String(?), char(2)
		
		short sh;		
		sh = 128;
		
		int i;
		
		// 자동 (자료)형변환(cast)
		i = sh;
		System.out.println("i = " + i);
				
		// 강제 (자료)형변환(cast)
		i = 1234;
		sh = (short)i;
		System.out.println("sh = " + sh);
		
		
		int number1, number2;
		number1 = 3;
		number2 = 2;
		
		float f;
		f = (float)number1 / (float)number2;	// 3.0 / 2
		System.out.println("f = " + f);
		
	}
}




