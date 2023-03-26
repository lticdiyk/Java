package sample11;

public class MainClass {
	public static void main(String[] args) {
		/*
		  	for : 루프문, 순환문
		  	
		  	목적 : 원할(조건이 참) 때까지 반복처리하는 제어문
		  	
		  	형식 :
		  			for( 초기화 ; 조건식 ; 연산식 ){
		  				처리
		  			}
		  			
		  			int i;
		  			for( i = 0 ; i < 5 ; i++ ){
		  				처리
		  			}		  
		 */
		
		int i;
		
		for(i = 0 ; i < 5 ; i++) {
			System.out.println("for loop i = " + i);
		}
		
		System.out.println("i = " + 5);
		
		System.out.println("for loop 1");
		System.out.println("for loop 2");
		System.out.println("for loop 3");
		System.out.println("for loop 4");
		System.out.println("for loop 5");
		System.out.println("for loop 6");
		System.out.println("for loop 7");
		System.out.println("for loop 8");
		System.out.println("for loop 9");
		System.out.println("for loop 10");
		
		for(i = 1; i <= 100; i++) {
			System.out.println("for loop " + i);
		}
		
		for(i = 0; i < 10; i = i + 2) {
			System.out.println("for loop " + i);
		}
		
		for(i = 10; i > 0; i--) {
			System.out.println("for loop " + i);
		}
		
		/*
		for(i = 0;   ; i++) {
			System.out.println("for loop " + i);
		}
		*/
		
		for(int j = 0; j < 10; j++) {
			System.out.println("for loop " + j);
		}
		
		// 2중 for
		for(int n = 0;n < 5; n++) {		// n = 0 1 2 3 4
			System.out.println("for n = " + n);
			
			for(int k = 0;k < 3; k++) {	// k = 0 1 2
				System.out.println("\tfor k = " + k);
			}			
		}
		
		// for + if + array
		
		int array[] = { 2, 4, 5, 6, 8 };
		
		for(i = 0;i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(i = 0;i < array.length; i++) {
			if(array[i] == 6) {
				System.out.println("6을 찾았습니다");
			}			
		}
		
		for(i = 0;i < array.length; i++) {
			if(array[i] % 2 == 1) {
				System.out.println("홀수가 있습니다 " + array[i] + "입니다");
			}
		}
		
		
	}
}










