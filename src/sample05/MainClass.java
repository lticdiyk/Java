package sample05;

public class MainClass {

	public static void main(String[] args) {
		/*
			연산자(operator) : + - * / %
		*/
		
		int num1, num2;
		num1 = 7;
		num2 = 2;
		
		int result;
		
		result = num1 + num2;
		System.out.println( num1 + " + " + num2 + " = " + result );
		
		result = num1 * num2;
		System.out.println( num1 + " * " + num2 + " = " + result );
		
		result = num1 / num2;
		System.out.println( num1 + " / " + num2 + " = " + result );
		
		// 7 / 2 -> 나머지
		result = num1 % num2;
		System.out.println( num1 + " % " + num2 + " = " + result );
		
		int money = 13500;
		int m = money % 1000;
		System.out.println("m = " + m);
		
		// increment(++) decrement(--)
		
		int number1;
		number1 = 0;		
		
	//	number1 = number1 + 1; 
	//	number1++;
		++number1;		
		System.out.println("number1:" + number1);
		
		/*
		number1 = number1 - 1; 
		number1--;
		--number1;
		*/
		
		int number2;
		number2 = 0;
	//	number2++;
		
		int number3;
	//	number3 = number2;
		
	//	number3 = number2++;		// number3 = 0  number2 = 1
		number3 = ++number2;		// number3 = 2  number2 = 2
				
		System.out.println("number3:" + number3);
		
		
		// 논리(true/false) 연산자
		// &&	and		0 0 : 0  0 1 : 0  1 0 : 0  1 1 : 1
		// ||	or		0 0 : 0  0 1 : 1  1 0 : 1  1 1 : 1
		// !	not		0 -> 1  1 -> 0
		// < > <= >=
		// number == 10
		
		int number4 = 5;
		
		System.out.println( number4 < 10 );
		
		System.out.println( number4 < 0 && number4 < 10);
		
		System.out.println( number4 < 0 || number4 < 10);
		
		System.out.println( !(number4 < 10) );	// number4 >= 10
		
		System.out.println( number4 != 0 );
		
		
		// 삼항 연산자
		//	변수 = (조건) ? 값1 : 값2 ;  -> lambda
		
		int n;
		n = (number4 > 0) ? 11:22;
		System.out.println("n = " + n);
		
		char c;
		c = (number4 > 10) ? 'Y':'N';
		System.out.println("c = " + c);
		
		String s;
		s = (number4 > 4) ? "4보다 큽니다":"4보다 작습니다";
		System.out.println("s = " + s);
		
	}

}




