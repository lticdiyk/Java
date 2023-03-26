package work02;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			편의점 프로그램
			지불금액 : 3,210원
			본인금액 : 10,000원
			
			거스름돈 -> ?
			
			5000원 -> ?장
			1000원 -> ?장
			500원 -> ?개
			100원 -> ?개
			50원 -> ?개
			10원 -> ?개
		*/
		
		Scanner sc = new Scanner(System.in);	
		
		// 지불할 금액
		//int price = 3210;
		System.out.print("지불할 금액 >> ");
		int price = sc.nextInt();
		
		// 내돈
		//int myMoney = 10000;
		System.out.print("내돈 >> ");
		int myMoney = sc.nextInt();
		
		// 거스름돈
		int changeMoney = myMoney - price;
		
		// 5000
		int m5000 = changeMoney / 5000;		// 6790 / 5000 -> 1
		
		// 1000
		int m1000 = (changeMoney % 5000) / 1000;
		
		// 500
		int m500 = (changeMoney % 1000) / 500;
		
		// 100
		int m100 = (changeMoney % 500) / 100;
		
		// 50
		int m50 = (changeMoney % 100) / 50;
		
		// 10
		int m10 = (changeMoney % 50) / 10;
		
		System.out.println("총 거스름돈:" + changeMoney);
		System.out.println("5000원권: " + m5000 + " 장");
		System.out.println("1000원권: " + m1000 + " 장");
		System.out.println("500원권: " + m500 + " 개");
		System.out.println("100원권: " + m100 + " 개");
		System.out.println("50원권: " + m50 + " 개");
		System.out.println("10원권: " + m10 + " 개");
		
		
	}
}






