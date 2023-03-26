package sample34;

public class MainClass {
	public static void main(String[] args) {
		/*
			final : 변수, 클래스, 메소드
			 		== const, define
		*/
		
		final int NUMBER = 1;  // 상수(변경할 수 없는 수), 대입용, 대문자 		
		// number = 2;
		
		int num = NUMBER;
	}
}

// 상속금지
/* final */ class MyClass{
	
	// override 금지
	public /* final */ void method() {
		
	}
}

class YouClass extends MyClass{
	
	public void method() {  //override
		
	}
}




