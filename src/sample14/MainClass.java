package sample14;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			continue : skip(생략)
			
			loop문과 같이 사용

			while(조건){
			
				처리1
				
				if(조건){
					continue;
				}
				
				처리2
			
				연산식
			}			
		*/
		
		for(int i = 0;i < 10; i++) {
			System.out.println("i = " + i);
			
			System.out.println("for 처리1");
			
			if(i > 5) {
				continue;
			}			
			
			System.out.println("for 처리2");
		}
		
		int array[] = { 2, -6, 3, -4, 5 };
		
		for(int i = 0;i < array.length; i++) {
			
			if(array[i] <= 0) { // 음수였을 때
				continue;
			}
			
			System.out.println("array[" + i + "] = " + array[i]);			
		}
		
		Scanner sc = new Scanner(System.in);
		
		int number;		
		/*
		for(int i = 0;i < 3; i++) {
			System.out.print("number " + i + " = ");
			number = sc.nextInt();
			
			if(number <= 0) {
				continue;
			}
			
			System.out.println("number:" + number);
		}
		*/
		
		/*
		int w = 0;
		while(w < 3) {
			System.out.print("number " + w + " = ");
			number = sc.nextInt();
			
			if(number <= 0) {
				continue;
			}
			
			System.out.println("number:" + number);
			w++;
		}
		*/
		
		System.out.println();
		
		// 양수로 된 숫자 5개(입력) -> 배열에 저장해서 출력
		
		// 입력받을 배열준비
		int numArr[] = new int[5];
		
		// loop로 입력
		int w = 0;
		while(w < numArr.length) {
			System.out.print((w + 1) + "번째 수 = ");
			int num = sc.nextInt();
			
			// 제어(continue)
			if(num <= 0) {
				System.out.println("양수를 입력해 주십시오");
				continue;
			}
						
			numArr[w] = num;
			
			w++;
		}		
		
		System.out.println( Arrays.toString(numArr) );
		
		
	}
}








