package sample03_Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args)throws Exception {
		
		// input(입력) - console
		Scanner sc = new Scanner(System.in);
		
		// boolean
		/*
		boolean b;	// 입력한 데이터를 보관할 변수
		System.out.print("b = ");	// 입력할 데이터를 명시
		b = sc.nextBoolean();
		System.out.println("b:" + b);	// 입력한 결과 출력
		*/
		
		// integer
		/*
		int number;
		System.out.print("number = ");
		number = sc.nextInt();
		System.out.println("number:" + number);
		*/
		
		// double
		/*
		double d;
		System.out.print("d = ");
		d = sc.nextDouble();
		System.out.println("d:" + d);
		*/
		
		// string
		/*
		String str;
		System.out.print("str = ");
		str = sc.next();
		System.out.println("str:" + str);
		*/
		
		// file, network
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.print("str = ");
		str = br.readLine();
		System.out.println("str:" + str);
		
	}
}





