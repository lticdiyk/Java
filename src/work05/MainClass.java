package work05;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// calculator(계산기)
		int number1, number2, result = 0;
		String operator;
		
		while(true) {
		
			// 1. 숫자입력
			number1 = numberInput("첫번째");
			//System.out.print("첫번째 숫자 >> ");
			//number1 = sc.nextInt();
			
			// 2. 연산기호(+,-,*,/)
			System.out.print("연산자(+, -, *, /) >> ");
			operator = sc.next();
			
			// 3. 숫자입력
			number2 = numberInput("두번째");
			//System.out.print("두번째 숫자 >> ");
			//number2 = sc.nextInt();
			
			// 4. 연산
			result = calculator(number1, number2, operator);
			/*
			if(operator.equals("+")) {
				result = number1 + number2;
			}
			else if(operator.equals("-")) {
				result = number1 - number2;
			}
			else if(operator.equals("*")) {
				result = number1 * number2;
			}
			else if(operator.equals("/")) {
				result = number1 / number2;
			}
			*/
					
			// 5. 결과출력
			System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
			
			// 6. replay 
			System.out.print("다시 시작하시겠습니까?(y/n) = ");
			String replay = sc.next();
			
			if(replay.equals("y")) {
				System.out.println("다시 시작합니다");
			}else {
				break;
			}
		}				
	}
	
	static int numberInput(String n) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(n + " 숫자 >> ");
		int number = sc.nextInt();
		
		return number;
	}
	
	static int calculator(int number1, int number2, String operator) {
		int result = 0;
		
		if(operator.equals("+")) {
			result = number1 + number2;
		}
		else if(operator.equals("-")) {
			result = number1 - number2;
		}
		else if(operator.equals("*")) {
			result = number1 * number2;
		}
		else if(operator.equals("/")) {
			result = number1 / number2;
		}
		
		return result;
	}
	
	
}







