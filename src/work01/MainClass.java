package work01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("====================================================================");
		System.out.println("\\\tname\tage\tman\tphone\t\theight\taddress\t  \\");
		System.out.println("====================================================================");
		System.out.println("\\\t\"홍길동\"\t20\ttrue\t010-111-2222\t175.12\t\"경기도\"\t  \\");
		System.out.println("\\\t\"일지매\"\t18\ttrue\t02-123-4567\t180.01\t\"서울\"\t  \\");
		System.out.println("====================================================================");
		
		System.out.println();
		
		String name;
		int age;
		boolean lady;
		String phone;
		double height;
		String address;
		
		name = "홍길동";
		age = 20;
		lady = false;
		phone = "010-111-2222";
		height = 175.12;
		address = "경기도";
		
		System.out.println("====================================================================");
		System.out.println("\\\tname\tage\tman\tphone\t\theight\taddress\t  \\");
		System.out.println("====================================================================");
		System.out.println("\\\t\"" + name + "\"\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t\"" + address + "\"\t  \\");
		
		name = "일지매";
		age = 18;
		lady = false;
		phone = "02-123-4567";
		height = 180.01;
		address = "서울";
		
		System.out.println("\\\t\"" + name + "\"\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t\"" + address + "\"\t  \\");
		
		name = "장옥정";
		age = 14;
		lady = true;
		phone = "02-345-6789";
		height = 155.78;
		address = "부산";
		
		System.out.println("\\\t\"" + name + "\"\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t\"" + address + "\"\t  \\");
				
		System.out.println("====================================================================");
		
		System.out.println();
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name >>");
		name = sc.next();
		
		System.out.print("age >>");
		age = sc.nextInt();
		
		System.out.print("lady(true/false) >>");
		lady = sc.nextBoolean();
		
		System.out.print("phone >>");
		phone = sc.next();
		
		System.out.print("height >>");
		height = sc.nextDouble();
		
		System.out.print("address >>");
		address = sc.next();
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("여성:" + lady);
		System.out.println("전화번호:" + phone);
		System.out.println("키:" + height);
		System.out.println("주소:" + address);
		
		System.out.println();
		*/
		
		int x, y;		
		
		x = 11;
		y = 22;
		
	//	System.out.println("x = " + y + " y = " + x);
		
		int temp;
		
		// 두 변수의 값의 교환(swap)
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + " y = " + y);
		
		
	}
}












