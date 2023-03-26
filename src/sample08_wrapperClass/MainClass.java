package sample08_wrapperClass;

public class MainClass {
	public static void main(String[] args) {
		/*
			wrapper class
			일반 자료형(int, char, long)을 class로 만들어 놓은 것
			
			일반 자료형		wrapper class
			boolean			Boolean
			byte			Byte
			short			Short
			int				Integer			--->
			long			Long
			float			Float
			double			Double			--->
			char			Character
			char[]			String			--->
			
			class 사용시에는 동적할당
			
			클래스명 변수(클래스) = new 클래스명();
			클래스명 변수(클래스) = 값;
			String str = "hello";
		*/
		
		char c = 'a';
		char cArr[] = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(cArr);
		
		
//		int i = 123;
//		Integer iobj = 123;
//		Integer iobj2 = new Integer(123);
//		System.out.println("i = " + i);
//		System.out.println("iobj = " + iobj);
//		System.out.println("iobj2 = " + iobj2);
		
		double d = 123.456;
		Double dobj = 123.456;		
		System.out.println("d = " + d);
		System.out.println("dobj = " + dobj);
		
		String str = "hello world";
		str = "I can do it";
		System.out.println("str = " + str);
		
		// Integer
		// 문자열 -> 숫자
		String numStr = "123";
		int number = Integer.parseInt(numStr);
		System.out.println("number = " + number);
						
		// 숫자 -> 문자열		
		Integer oNumber = 12345;
		// String str1 = oNumber.toString();
		String str1 = oNumber + "";
		System.out.println("str1 = " + str1);
		
		// 10진수 -> 2진수(문자열)
		int number1 = 67;
		String str2 = Integer.toBinaryString(number1);
		System.out.println("str2 = " + str2);  //  100 0011
		
		// 10진수 -> 16진수(문자열)
		String str3 = Integer.toHexString(number1);
		System.out.println("str3 = " + str3);
		
		// Integer
		// 2진수 -> 10진수		
		int num2 = Integer.parseInt(str2, 2);
		System.out.println("num2 = " + num2);
		
		// 16진수 -> 10진수
		
		
		// String : 문자열의 저장, 편집, 정보취득
		
		String str4 = ""; 
		System.out.println(str4);
		
		String str5 = new String("hello");
		String str6 = "world";
		
		// 문자열 합하기
		String str7 = str5 + str6;
		System.out.println(str7);
		
		String str8 = str5.concat(str6);
		System.out.println(str8);
		
		// 문자열 비교
		String str9 = "world";
		String str10 = "world";
		
		boolean b = str9.equals(str10);
		System.out.println("b = " + b);
		
		// 문자의 위치
		String str11 = "abcabcabc";
		int n = str11.indexOf("c");
		System.out.println("n = " + n);
		
		int n1 = str11.lastIndexOf("c");
		System.out.println("n1 = " + n1);
		
		// 문자열의 길이
		int len = str11.length();
		System.out.println("len = " + len);
		
		// 문자열을 수정
		String str12 = "A*B*C*D";
		// String str12 = "21일 새벽부터 서울 전역에 눈이 내리면서 출근길에 나선 시민들은 목도리와 장갑 등 방한용품으로 무장을 하고, 몸을 잔뜩 움츠린 채 종종걸음을 했다.";
		String replaceStr = str12.replace("*", "");
		System.out.println(replaceStr);
		
		// 문자열 자르기
		String str13 = "홍길동-24-2001/10/16-서울시";
		
		// 범위
		String subStr = str13.substring(4, 6);
		System.out.println(subStr);
		
		subStr = str13.substring(7);
		System.out.println(subStr);		
		
		// token(=기호)
		String split[] = str13.split("-");
		System.out.println(split.length);
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		// (앞뒤)공백을 제거
		String str14 = "  java java   java     ";
		String trimStr = str14.trim();
		System.out.println(trimStr);
		
		// ?번째인지 숫자는 넣으면 한개의 문자를 돌려준다
		String str15 = "가나다라마";
		char c1 = str15.charAt(2);
		System.out.println("c1 = " + c1);
		
		// 문자열 (비교)탐색
		String str16 = "서울시 강남구 역삼동";
		boolean b1 = str16.contains("강남");
		System.out.println(b1);
		
	}
}












