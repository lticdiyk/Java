package study02;

public class MainClass {

	public static void main(String[] args) {
		
		// 제어문
		/*
		 	조건문:
		 		if		 		
		 		if else		 		
		 		if else if else if (else)
		 	
		 		switch		 	
		 	
		 	반복(loop)문:
		 		for
		 		
		 		while
		  
		  		do while		
		 */
		
		double number = 12.345;		
		if(number > 10.0) {
			System.out.println("number는 10.0보다 크다");
		}
		
		boolean b = false;		
		if(b == false) {
			System.out.println("b == false");
		}
		if(!b) {
			System.out.println("b != true");
		}
		
		String name = "성춘향";		
		if(name.equals("홍길동")) {
			System.out.println("이름은 홍길동입니다");
		}
		else {
			System.out.println("이름은 홍길동이 아닙니다");
		}
		
		int count = 88;
		
		if(count == 100) {
			System.out.println("A+입니다");
		}else if(count >= 90) {
			System.out.println("A입니다");
		}else if(count >= 80) {
			System.out.println("B입니다");
		}else if(count >= 70) {
			System.out.println("C입니다");
		}else if(count >= 60) {
			System.out.println("D입니다");
		}else {
			System.out.println("재시험입니다");
		}
		
		if(count >= 60 && count < 70) {
			System.out.println("D입니다");
		}else if(count >= 70 && count < 80) {
			System.out.println("C입니다");
		}else if(count >= 80  && count < 90) {
			System.out.println("B입니다");
		}else if(count >= 90  && count < 100) {
			System.out.println("A입니다");
		}else if(count == 100) {
			System.out.println("A+입니다");
		}else{
			System.out.println("재시험입니다");
		}
		
		char c = 'B';
		
		switch( c ) {
			case 'A':
				System.out.println("A입니다");
				break;
			case 'B':
				System.out.println("B입니다");
				break;
			case 'C':
				System.out.println("C입니다");
				break;
			default:
				System.out.println("A,B,C가 아닙니다");
		}
		
		String car = "bmw";
		
		switch (car) {
			case "benz":	// car == "benz"
				System.out.println("벤츠입니다");
				break;
			case "bmw":
				System.out.println("bmw입니다");
				break;				
		}
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("for " + i);
		}
		
		int []array = { 11, 22, 33, 44, 55 };
		
		for(int i = 0;i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		// foreach
		for(int num : array) {
			System.out.println(num);
		}
		
		
		int w;
		w = 0; // 초기화
		while(w < 10) { // (루프를 끝내기 위한)조건
			
			System.out.println("while " + w);
			
			w++; // 연산식
		}
		
		for(int i = 0;i < 5; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0;j < 3; j++) {
				System.out.println("\t j = " + j);
			}			
		}
		
		int w1, w2;
		
		w1 = 0;		
		while(w1 < 5) {
			System.out.println("w1 = " + w1);
			
			w2 = 0;
			while(w2 < 3) {
				System.out.println("\t w2 = " + w2);
				
				w2++;
			}
			w1++;
		}	
		
		
		
	}

}




