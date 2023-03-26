package work06;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
				
		// 1.
		double d = getDistance(1,1, 2,2);
		System.out.println(d);
		
		
		// 2.
		int original[] = { 1,2,3,4,5,6,7,8,9 };
		System.out.println(Arrays.toString(original));
		
		int result[] = shuffle(original);
		System.out.println(Arrays.toString(result));
		
		System.out.println(Arrays.toString(original));
		
		
		// 3.
	//	int[] data = { 3,2,9,4,7 };
		int[] data = { -3,-2,-9,-4,-7 };
		int m = max(data);
		System.out.println("최대값:" + m);
		
		int emptyArray[] = null;
		int m1 = max(emptyArray);
		System.out.println("m1 = " + m1);
		
		
		// 4.
		// 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
		// String str = "123o9";
		// String str = "123o9";
		//isNumber(str);
		
		String str = "123";
		boolean b = isNumber(str);
		System.out.println(str + "는 숫자입니까? "+ b);
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? "+ isNumber(str));
		
		
		// 5.
		int num1[] = {1, 2, 3, 4, 5};
		getDouble(num1);
		System.out.println(Arrays.toString(num1));
		
		
		// 6.
		int number1, number2;
		int res, tag[];  // res = 몫, tag = 나머지
		
		number1 = 29;
		number2 = 4;
		tag = new int[1];
		
		res = getResult(number1, number2, tag);
		System.out.println("몫:" + res + " 나머지:" + tag[0]);
	}	
	
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	// TODO: 1번문제
	static double getDistance(int x, int y, int x1, int y1) {
		// 승수를 구하는 함수  			Math.pow -> power
		// root(평방근)를 구하는 함수 	Math.sqrt
		
		double y_val = Math.pow(y1 - y, 2);
		double x_val = Math.pow(x1 - x, 2);
		
		double result = Math.sqrt(y_val + x_val); 
		
		return result;		
	}
	
	// TODO: 2번문제
	static int[] shuffle(int original[]) {
		int temp;
		
		for(int i = 0;i < 5000; i++) {	
			
			int x = (int)(Math.random() * 9);  // 0 ~ 8 
			int y = (int)(Math.random() * 9);  // 0 ~ 8
			
			// swap
			temp = original[x];
			original[x] = original[y];
			original[y] = temp;			
		}
		
		return original;		
	}
	
	// TODO: 3번문제
	static int max(int data[]) {
		
		// 배열의 이상이 있는 경우
		if(data == null || data.length == 0) {
			return -999999;
		}
		
		int m = data[0];
		
		// 3,2,9,4,7
		for(int i = 0;i < data.length; i++) {
			if(m < data[i]) {
				m = data[i];
			}			
		}
		return m;
	}
	
	// ASCII 코드를 사용    123a4
	static boolean isNumber(String str) {
		boolean b = true;
		
		for(int i = 0;i < str.length(); i++) {
			char c = str.charAt(i);
			// System.out.println(c);
			int n = (int)c;
			if(n < 48 || n > 57) {
				b = false;				
			}
		}
		
		return b;
	}
	
	// *2를 하는 함수
	static void getDouble(int num1[]) {
		for(int i = 0;i < num1.length; i++) {
			num1[i] = num1[i] * 2;
		}
	}
	//     몫                                         나머지
	static int getResult(int number1, int number2, int tag[]) {
		// 몫
		int res = number1 / number2;
		// 나머지
		tag[0] = number1 % number2;
		
		return res;		
	}
	
	
}







