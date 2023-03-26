package work04;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램(?진수변환)		
		while(true) {
		
			// menu
			System.out.println("변환프로그램");
			System.out.println("1. 10진수를 2진수로 변환"); // 숫자
			System.out.println("2. 10진수를 8진수로 변환");
			System.out.println("3. 10진수를 16진수로 변환");
			System.out.println("4. 2진수를 10진수로 변환");	// 문자열
			System.out.println("5. 16진수를 10진수로 변환");
			
			// 유저입력(menu)
			System.out.print("작업번호 >> ");
			int menuNum = sc.nextInt();
			
			// 숫자
			System.out.print("숫자입력 >> ");
			String numStr = sc.next();
			
			// 변환
			String result = ""; // 결과를 저장
			int num10 = 0;
			switch(menuNum) {
				case 1:    // 숫자 10진수를 2진수로
					num10 = Integer.parseInt(numStr);
					result = Integer.toBinaryString(num10);
					break;
				case 2:    // 숫자 10진수를 8진수로
					num10 = Integer.parseInt(numStr);
					result = Integer.toOctalString(num10);
					break;
				case 3:    // 숫자 10진수를 16진수로
					num10 = Integer.parseInt(numStr);
					result = Integer.toHexString(num10);
					break;
				case 4:    // 문자 2진수를 10진수로
					num10 = Integer.parseInt(numStr, 2);
					result = num10 + "";
					break;
				case 5:    // 문자 16진수를 10진수로
					num10 = Integer.parseInt(numStr, 16);
					result = num10 + "";
					break;			
			}			
			
			// 결과출력
			System.out.println("변환결과:" + result);
			System.out.println();
		}

		
	}
}
