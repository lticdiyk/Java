package work03;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		// 1 ~ 1000 사이에 수를 전부 합친 값을 출력하라.
		int sum = 0;		
		for(int i = 1;i <= 1000; i++) {
			sum = sum + i;
		}		
		System.out.println("합계:" + sum);
		
		sum = 0;  	// 초기화 initialize(init)
		int n = 0;	// 숫자를 증가 시켜줄 변수
		for(int i = 0;i < 1000; i++) {
			n++;
			sum = sum + n;
		}
		System.out.println("합계:" + sum);
		
		// 하나의 수를 입력 받고 입력 받은 수는 어느 범위에 있는지 출력되는 프로그램을 작성하라. (1 ~ 100)
		int number = 33;
		
		if(number > 0 && number <= 10) {
			System.out.println("number는 0보다 크고 10보다 작거나 같다");
		}else if(number > 10 && number <= 20) {
			System.out.println("number는 10보다 크고 20보다 작거나 같다");
		}else if(number > 20 && number <= 30) {
			System.out.println("number는 20보다 크고 30보다 작거나 같다");
		}else if(number > 30 && number <= 40) {
			System.out.println("number는 30보다 크고 40보다 작거나 같다");
		}else if(number > 40 && number <= 50) {
			System.out.println("number는 40보다 크고 50보다 작거나 같다");
		}else if(number > 50 && number <= 60) {
			System.out.println("number는 50보다 크고 60보다 작거나 같다");
		}else if(number > 60 && number <= 70) {
			System.out.println("number는 60보다 크고 70보다 작거나 같다");
		}else if(number > 70 && number <= 80) {
			System.out.println("number는 70보다 크고 80보다 작거나 같다");
		}else if(number > 80 && number <= 90) {
			System.out.println("number는 80보다 크고 90보다 작거나 같다");
		}else if(number > 90 && number <= 100) {
			System.out.println("number는 90보다 크고 100보다 작거나 같다");
		}
		
		
		int boundNum = 0;  // 0 10 20 30 40 ~ 90		
		for(int i = 0;i < 10; i++) {			
			boundNum = 10 * i;
			
			if(number > boundNum && number <= (boundNum + 10)) {
				System.out.println("number는 " + boundNum + "보다 크고 " + (boundNum + 10) + "보다 작거나 같다");
			}
		}
		
		/*		
		
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****		
		
		*/
		
		for(int i = 0;i < 9; i++) {
			
			for(int j = 0;j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		
		*		0 = i
		**		1
		***		2
		****	3
		*****	4
		****	5
		***		6
		**		7
		*		8	
		
		*/
		
		int t = 0;
		for(int i = 0;i < 9; i++) {
			
			if(i < 5) t++;
			else      t--;
			
			for(int j = 0;j < t; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		for(int i = 1;i < 10; i++) {			
			for(int j = 1;j < 10; j++) {				
				System.out.print(i + " x " + j + " = " + (i * j) + " ");				
			}			
			System.out.println();
		}
		
		System.out.println();
		
		/*
		// 임의 수를 입력 받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력하고 싶은 구구단 = ");
		int num99 = sc.nextInt();
		
		for(int i = 1;i < 10; i++) {
			System.out.println(num99 + " x " + i + " = " + (num99 * i) + " ");
		}
		*/
		
		/*
		  	1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
			1부터 100 사이 짝수의 합은:
			1부터 100 사이 홀수의 합은:
		 */
		int sum1, sum2;
		sum1 = sum2 = 0;		
		for(int i = 1;i <= 100; i++) {
			// 짝수의 합
			if(i % 2 == 0) {				
				sum2 = sum2 + i;
			}			
			// 홀수의 합
			else {
				sum1 = sum1 + i;
			}			
		}
		
		System.out.println("홀수의 합:" + sum1);
		System.out.println("짝수의 합:" + sum2);
		
		
		
	}
}




