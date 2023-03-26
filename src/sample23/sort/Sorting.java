package sample23.sort;

import java.util.Iterator;
import java.util.Scanner;

public class Sorting {

	int number[];
	int updown;
	
	public void init() {
		number = null;
		updown = 0;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정렬할 숫자의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print( (i + 1) + "번째 수 = " );
			number[i] = sc.nextInt();
		}
		
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();		
	}
	
	public void sorting() {
		
		int temp;
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown == 1) {
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				else {
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}				
			}
		}
	}
	
	public void result() {
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
	}
}






