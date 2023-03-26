package sample18;

public class MainClass {
	public static void main(String[] args) {
		/*
			OverLoad : 함수명은 같고 매개변수(parameter)의 갯수나 자료형이 다른 함수를 의미한다.
						-> 이름만 같고 다른 함수 -> 다른 함수
						구분 -> parameter로
						
			painting();  -> background image			 
			painting(int x, int y) -> character image
		*/		
		
		func();		
		
		func('A');
		
		func(33);
		
		func('B', 66);
		
		func(99, 'C');
		
		int s = sum(1, 2, 3);
		System.out.println("합계:" + s);
		
		s = sum(100, 90, 80, 100, 70);
		System.out.println("합계:" + s);
		
		
	}
	
	static void func() {
		System.out.println("func() 호출");
	}
	
	static void func(char c) {
		System.out.println("func(char c) 호출");
	}
	
	static void func(int i) {
		System.out.println("func(int i) 호출");
	}
	
	static void func(char c, int i) {
		System.out.println("func(char c, int i) 호출");
	}
	
	static void func(int i, char c) {
		System.out.println("func(int i, char c) 호출");
	}
	
	/*
	static void func(char cc, int ii) {
		System.out.println("func(char c, int i) 호출");
	}
	*/
	
	/*
	static int func() {
		System.out.println("func() 호출");
	}
	*/
	
	// 가변인수
	static int sum(int...number) {
		int s = 0;		
		for(int i = 0;i < number.length; i++) {
			s = s + number[i];
		}
		return s;
	}
	
	
}










