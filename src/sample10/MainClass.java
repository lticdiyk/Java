package sample10;

public class MainClass {

	public static void main(String[] args) {
		
		/*
			switch 
				조건 분기 제어문
				값이 명확해야 한다.
				범위를 설정할 수 없다
				소수(실수)값을 사용할 수 없다
				
				형식:
				
				switch( 변수 ){
					case 1:		1 == 값			if(변수 == 1)
						처리1
						break;
					case 2:
						처리2
						break;
						 :
					case n:
						처리n
						break;
						
					default:		== else
						해당되는 값을 없을 시에 실행
						생략이 가능
				}
				
		*/
		
		int choice;
		
		choice = 2;
		
		switch( choice ) {
			case 1:
				System.out.println("처리1 입니다");
				break;
			case 2:
				System.out.println("처리2 입니다");
				break;
			case 3:
				System.out.println("처리3 입니다");
				break;	
			default:
				System.out.println("1 ~ 3이 아닙니다");
		}
		
		/*
		switch( choice ) {
			case choice > 2:
				break;
		}
		*/
		
		/*
		double d = 1.2;		
		switch( d ) {
			
		}
		*/
		
		
		
		

	}

}
