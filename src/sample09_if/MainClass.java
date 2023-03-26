package sample09_if;

public class MainClass {
	
	public static void main(String[] args) {
		
		// if
		/*
		  	> < >= <= == !=	 대소비교, 값을 비교
		  	&& || !			 논리 연산자와 같이 사용하는 경우가 있다
		  	
		  	형식:
		  		if( 조건 ) {	// -> 논리(true/false)
		  		
		  			처리
		  		} 		  	
		 */
		
		int number = 7;
		
		if(number > 0) {
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number == 7) {
			System.out.println("number는 7입니다");
		}
		
		if(number < 6) {
			System.out.println("number는 6보다 작습니다");
		}
		
		if(number > 0 && number <= 10) {  // 1 ~ 10
			System.out.println("number는 0보다 크고 10보다 작거나 같습니다");
		}
		
		//   true           false 
		if(number > 0 || number <= 5) {
			System.out.println("number는 0보다 크거나 5보다 작거나 같습니다");
		}
		
		if(true) {
		}
		
		/*
			if( 조건 ) {
				처리1
			}
			else {
				처리2
			}		
		*/
		
		int count = 8;
		
		if(count < 6) {
			System.out.println("number는 6보다 작습니다");
		}
		else {
			System.out.println("number는 6보다 크거나 같습니다");
		}
		
		char c = 'A';
		
		if(c == 'a') {
			System.out.println("c = 'a'입니다");
		}
		else {
			System.out.println("c = 'a'가 아닙니다");
		}
		
		// 삼항연산자
		String str = ( c == 'a' ) ? "c = 'a'입니다":"c = 'a'가 아닙니다";
		System.out.println(str);
		
		
		// else if
		count = 65;
		
		if(count >= 90) {
			System.out.println("A 학점입니다");
		}
		else if(count >= 80) {
			System.out.println("B 학점입니다");
		}
		else if(count >= 70) {
			System.out.println("C 학점입니다");
		}
		else {
			System.out.println("재시험입니다");
		}
		
		boolean b;
		
		b = true;
		
		if(b == true) {
			System.out.println("b == true 입니다");
		}
		
		if(b) {
			System.out.println("b == true 입니다");
		}
		
		b = false;
		
		if(b == false) {
			System.out.println("b == false 입니다");
		}
		
		if(!b) {
			System.out.println("b == false 입니다");
		}
		
		String str1 = "worl";
		
		str1 = str1 + "d";
		System.out.println("str1 = " + str1);
		
		if(str1 == "world") {
			System.out.println("str1 은 world 입니다");
		}
		
		// equals
		if(str1.equals("world")) {
			System.out.println("equals str1 은 world 입니다");
		}
		
		
		// if안에 if문
		count = 95;	
		
		if(count >= 90) {			
			if(count >= 95) {
				System.out.println("A+입니다");
			}
			else {
				System.out.println("A입니다");
			}			
		}	
		
		if(count >= 95 && count <= 100) {
			System.out.println("A+입니다");
		}
		else if(count >= 90 && count < 95) {
			System.out.println("A입니다");
		}
		
		
	}
}








