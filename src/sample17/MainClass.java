package sample17;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			Sorting : 숫자의 크기 순으로 정렬하는 방법
			낮은 숫자부터 정렬 -> 오름차순정렬
			높은 숫자부터 정렬 -> 내림차순정렬
		*/
		
		//int number[] = { 3, 6, 4, 8, 1, 5, 2, 7 };
		/*
						 1, 6, 4, 8, 3, 5, 2, 7						 
						    2, 6, 8, 4, 5, 3, 7		       
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 변수의 선언
		int number[] = null;
		int count;
		int updown;
		
		// 변수의 초기화
		count = 0;
		updown = 0;
		
		
		/////////////////////////////////////////////// input
		// 정렬하고 싶은 숫자의 갯수
		System.out.print("정렬하고 싶은 수의 갯수 = ");
		count = sc.nextInt();
		
		// 배열에 그 갯수에 맞게 할당
		number = new int[count];
		
		// 숫자들을 입력
		for(int i = 0;i < count; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름(1)/내림(2)
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();
		///////////////////////////////////////////////
			
		
		/////////////////////////////////////////////// sorting 처리
		int temp = 0;
		for(int i = 0;i < number.length - 1; i++ ) {
			
			for(int j = i + 1;j < number.length; j++) {
				
				if(updown == 1) {	// 오름
					if(number[i] > number[j]) {					
					//	temp = number[i];
					//	number[i] = number[j];
					//	number[j] = temp;
						swap(number, i, j);
					}
				}else {				// 내림
					if(number[i] < number[j]) {					
					//	temp = number[i];
					//	number[i] = number[j];
					//	number[j] = temp;
						swap(number, i, j);
					}
				}
			}
		}
		
		/////////////////////////////////////////////////////// 결과출력
		if(updown == 1) {
			System.out.println("오름차순정렬입니다");
		}
		else {
			System.out.println("내림차순정렬입니다");
		}
			
		for (int i = 0; i < number.length; i++) {
			System.out.println("number[" + i + "] = " + number[i]);
		}		
	}
	
	static void swap(int number[], int i, int j) {
		int temp;
		
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
}






