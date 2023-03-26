package sample15_function;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		/*
			함수 : 	function. 독립적인 처리자
					method. == 함수   class에 소속되어 있는 함수
				
			형식:		
			return값 함수명(parameters, , , ){
			
				처리코드
				
				return 값;		
			}
			
			void -> 자료형이 없는 것.
			
			구성요소
			parameter   (들어 가는 값)
			return value(나오는(산출되는) 값)
			
			Application Programming Interface - API			
		*/		
		
		functionName();  // 함수 호출 방법
		
		functionOne(123); // 123 -> argument
		
		String s = functionTwo();
		System.out.println(s);
		
		int arrNum[] = functionThree();
		System.out.println(Arrays.toString(arrNum));	
		
		int num = functionFour(7);
		System.out.println("num = " + num);
		
		String str = "world";		
		boolean b = str.equals("world");
		
		int n = functionFive('e', "hello");
		System.out.println("n = " + n);
		
		char c = 'A';
		System.out.println( c );
		System.out.println( (int)c );
		
		int cNum = 65;
		System.out.println((char)cNum);
		
		char c1 = 'H';
		char rc = lowerCase(c1);
		System.out.println("rc = " + rc);
		
		
		// random(난수, 무작위)
		int rnum = (int)(Math.random() * 3);  // 0 1 2
		System.out.println("rnum = " + rnum);
		
		// 0 ~ 9
		rnum = (int)(Math.random() * 10);
		
		// 10 20 30 40 50   0 1 2 3 4 + 1 -> 1 2 3 4 5
		rnum = ((int)(Math.random() * 5) + 1) * 10;
		
		String str1 = "abc*abc*abc";
		String replaceStr = str1.replace("*", "-");
		System.out.println(replaceStr);
		
		char c2 = 'A';
		String str2 = c2 + "";
		
		int n2 = 123;
		String str3 = n2 + "";
	}
	
	static void functionName(  ) {
		System.out.println("functionName 호출");		
	}
	
	static void functionOne( int n ) {	// n -> parameter  -> 매개변수
		System.out.println("functionOne 호출 n = " + n);
	}
	
	static String functionTwo( ) {
		String str = "hello";
		
		return str;
	}
	
	static int[] functionThree( ) {
		int number[] = { 100, 200, 300 };		
		return number;
	}
	
	static int functionFour(int n) {
		int r;
		r = n * 2;
		
		return r;
	}
	
//	static boolean equals(String str) {		
//	}
	
	static int functionFive(char c, String s) {		
		int r = s.indexOf(c + "");		
		return r;
	}
	
	/*
		알파벳 A, B, C... -> a, b, c
		     65            97  
		대문자를 소문자로 변경해서 돌려주는 함수
	*/	
	static char lowerCase(char c) {
		int n = (int)c;
		int r = n + 32;
		
		return (char)r;
	}
	
//	static String replace(String s1, String s2) {		
//	}
	
}







