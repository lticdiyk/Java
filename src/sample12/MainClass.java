package sample12;

public class MainClass {

	public static void main(String[] args) {
		/*
			while : loop문	
			
			형식:
				초기화				
				while(조건) {				if(조건){				
					처리						처리				
					연산식
				}						}
		*/
		
		int w;
		
		w = 0;		// 초기화
		while(w < 5) {
			System.out.println("while loop " + w);			
			w++;  // 연산식
		}
		
		// 무한루프
	//	while(true) {
	//	}
		
		
		
		for(int i = 0;i < 5; i++) {
			System.out.println("i = " + i);
			for(int j = 0;j < 3; j++) {
				System.out.println("\t j = " + j);
			}			
		}
		
		// 2중 while문
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
		
		
		/*
			do while
			
			형식:			
				do{
					처리
					
					연산식				
				}while(조건);	
		*/
		
		int w3;
		w3 = 0;
		
		do {			
			System.out.println("do while " + w3);
			
			w3++;			
		}while(w3 < 5);
		

	}

}





