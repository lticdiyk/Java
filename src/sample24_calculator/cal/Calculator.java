package sample24_calculator.cal;

import java.util.Scanner;

public class Calculator {
	
	int number1, number2, result;
	String operator;	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("첫번째 숫자 = ");
		number1 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /) = ");
		operator = sc.next();
		
		System.out.print("두번째 숫자 = ");
		number2 = sc.nextInt();
	}
	
	public void process() {
		
		switch(operator) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;		
		}
		
	}
	
	public void result() {
		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
	}
	
	public void loop() {
		while(true) {
			input();
			process();
			result();
		}
	}

}





