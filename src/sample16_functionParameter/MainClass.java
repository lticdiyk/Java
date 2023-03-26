package sample16_functionParameter;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		  	함수의 매개변수로 넘겨주는 경우
		  	static void func1( int num )     -> value를 넘겨준다
		  	
		  	static void func2( int array[] ) -> address를 넘겨준다
		   
		 */		
		
		// 실제로 사용(호출)
		int num = 3;
		funcOne(num);
		System.out.println("main함수 num = " + num);
		
		int arr[] = new int[1];
		arr[0] = 3;
		funcTwo(arr);		
		System.out.println("arr[0] = " + arr[0]);
		
		
		int arrNum[] = { 1, 2, 3, 4, 5 };
		
		funcThree(arrNum);
		
		System.out.println( Arrays.toString(arrNum) );
				
	}
	
	static void funcOne(int num) {  // 함수의 정의
		num = num * 2;
		System.out.println("함수안 num = " + num);
	}
	
	static void funcTwo(int array[]) { // 함수의 정의
		array[0] = array[0] * 2;
		System.out.println("array[0] = " + array[0]);
	}
	
	static void funcThree(int arrNum[]) {
		for(int i = 0;i < arrNum.length; i++) {
			arrNum[i] = arrNum[i] * 2;
		}
	}

}





