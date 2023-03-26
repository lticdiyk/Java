package sample06;

public class MainClass {
	public static void main(String[] args) {
		
		/*
			Array : 배열. 같은 자료형(변수)의 묶음 <- 변수들
			
			목적 : 데이터를 관리
			
			일반변수 
				자료형 변수명
				int number;
				
			배열(변수)              동적(dynamic)할당
				자료형 배열변수명[] = new 자료형[배열의 총수];
				int array[] = new int[10];   10개의 변수를 (선언)할당				
				array[0] = 1;		index number : 번지  0 ~ 
				array[1] = 2;
				array[2] = 3;
					:
				array[9] = 10;		정적(static)
								
				memory 
				stack 	heap 	static 	system
				array[]	[10]
				
				int number1, number2, ... number10;	
							
				number1 = 1;
		
		*/
		
		String name1, name2, name3;
		
		// int array[] = new int[10]; // 변수를 10개 선언
		// int []array = new int[10]; // 변수를 10개 선언
		int[] array = new int[10]; // 변수를 10개 선언		int arr[10];

		System.out.println(array);
		
		// 배열의 길이(갯수)
		System.out.println(array.length);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;		
		
		
		System.out.println(array[5] + array[3]);
		
		
		int number = 10;
		
		// 배열(변수들)의 초기화
		int array2[] = { 11, 22, 33, 44, 55, 66, 77 };
		/*
		int array2[] = new int[5];
		
		array2[0] = 11;
		array2[1] = 22;
		array2[2] = 33;
		array2[3] = 44;
		array2[4] = 55;
		*/
		
		System.out.println(array2.length);
		
		System.out.println(array2[2]);
		
		String nameArray[] = { "홍길동", "성춘향", "일지매" };
		
		System.out.println(nameArray[1]);
		
		// 배열의 index 범위 0 ~ nameArray.length-1
		
	//	System.out.println(nameArray[3]);
		
		char arrC[] = { 'a', 'b', 'c', 'd', 'e' };
		
		
		int numArr[] = null;	// null == (0x0000)		
		numArr = new int[10];
		
		
		
	}
}







