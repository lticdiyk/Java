package sample13_break;

public class MainClass {
	public static void main(String[] args) {
		/*
			break : loop 정지 -> escape
			
			loop문과 같이 사용한다(for, while, do while, switch)
			
			switch(변수){
				case 값1:
					처리1
					break;
				case 값2:
					처리2
					break;
			}
			
			형식:
				for(int i = 0;i < 10; i++){
					처리1
					if(조건){
						break;
					}
					처리2
				}
				
				w = 0;
				while(w < 10){
					처리1
					if(조건){
						break;
					}
					처리2
					w++;
				}
		*/
		
		for(int i = 0;i < 10; i++) {
			System.out.println("for loop " + i);
			
			if(i == 5) {
				System.out.println("i == 5입니다");
				break;
			}
		}
		
		int number[] = { 13, 45, 27, -36, 78 };
		
		for(int i = 0;i < number.length; i++) {
			System.out.println("number[" + i + "] = " + number[i]);
			
			if(number[i] < 0) {
				break;
			}
		}
		
		// 2중 for
		for(int i = 0;i < 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0;j < 8; j++) {
				System.out.println("\t j = " + j);
				
				if(i == 5 && j == 4) {
					break;
				}
			}			
		}
		
		// 1. loop문 수에 맞춰서 break를 설정한다
		boolean b = false;
		
		for(int i = 0;i < 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0;j < 8; j++) {
				System.out.println("\t j = " + j);
				
				if(i == 5 && j == 4) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}	
			if(b == true) {
				break;
			}
		}
		
		// 2. break 설정
		loopout:for(int i = 0;i < 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0;j < 8; j++) {
				System.out.println("\t j = " + j);
				
				if(i == 5 && j == 4) {
					break loopout;
				}
			}			
		}
		
	}
}








