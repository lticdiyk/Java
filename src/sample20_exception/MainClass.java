package sample20_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
			Exception : 예외 != 에러
			
			1 ~ 9 -> 'A' == 65
			
			예)
				number -> string
				array -> index out bounds  [0 ~ 4] -> [5]
				class -> 없을 때
				file -> 없을 때
				
				형식:
					
					try{
						// exception이 발생할 가능성이 있는 코드
						  
					}catch(예외클래스1 e){
						메시지 출력
					}catch(예외클래스2 e){
						메시지 출력
					}catch(예외클래스3 e){
						메시지 출력
					}finally{
						무조건 실행
						(복구 코드) - undo/rollback 
					}
					
					static void func() throws 예외클래스 {
						exception이 발생할 가능성이 있는 함수
					}				
		*/
		
		int array[] = { 1, 2, 3 };
		
		System.out.println("start ---");
		
		try {
			
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
			
			System.out.println("process ---");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과");
			// e.printStackTrace();
			// System.out.println( e.getMessage() );
			
			// return;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally +++");
		}
		
		System.out.println("end ---");		
		
		// func();
		
		
		// NullPointerException
		String str = null;		// <- 비어 있다		
		try {
			System.out.println( str.length() );
		}catch (NullPointerException e) {
			System.out.println("str이 null입니다");
		}
		
		// ArrayIndexOutOfBoundsException
		int arr[] = { 1, 2, 3 };		
		try {
			arr[3] = 4;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}
		
		// FileNotFoundException
		File f = new File("d:\\xxx");
		FileInputStream is;		
		try {
			is = new FileInputStream(f);
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다"); 
		}		
		
		// StringIndexOutOfBoundsException
		String str1 = "java";
		try {
			str1.charAt(4);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("글자가 없는 공간입니다");
		}
		
		// NumberFormatException
		try {
			int i = Integer.parseInt("12a3");
		}catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 글자가 있습니다");
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int number = 0;		
		while(true) {
		
			System.out.print("숫자입력 = ");
			String strNum = sc.next();
			
			try {
				number = Integer.parseInt(strNum);
			}catch (Exception e) {
				System.out.println("숫자가 아닌 글자가 있습니다");
				continue;
			}
		
			break;
		}
		
		System.out.println("number = " + number);
		
		sc.close();
	}
	
	static void func() throws Exception {
		int num[] = { 1, 2, 3 };
		
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
	}

}










