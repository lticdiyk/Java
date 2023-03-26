package sample22;

public class MainClass {
	public static void main(String[] args) {
		/*
			OOP - Object Oriented Programming
												API - Application Programming Interface
												JDK - Java Development toolKit
			
			형식: object 설계
			
			class 클래스명{
				변수선언				
				함수(method)			
			}
			
			object 생성(선언)
			클래스명 클래스변수 = new 클래스명();
											Scanner sc = new Scanner(System.in);
											String str = new String();
											int i;
											int array[] = new int[10];
											delete array;
			delete 클래스변수;  -> 가비지 콜렉터
											
			클래스변수 == instance(주체) == object(객체)
			
			memory 영역
			stack		heap	static		system
			클래스변수		실제영역
			i
		*/	
		
		// 클래스명 클래스변수 = new 클래스명();
		//		객체생성
		MyClass mycls = new MyClass();
		
		// System.out.println(mycls);
		
		mycls.x = 1;
		mycls.y = 2;
		mycls.name = "홍길동";
		
		mycls.method();
		
		
		Student stu = new Student();
		stu.name = "홍길동";
		stu.language = 100;
		stu.english = 90;
		stu.math = 95;
		
		//		객체배열
		Student arrStu[] = new Student[3];	// 배열을 동적할당
	//  Student arrStu1, arrStu2, arrStu3;
				
		for (int i = 0; i < arrStu.length; i++) {
			arrStu[i] = new Student();
		}
				
		arrStu[0].language = 100;
		
	}
}

// 클래스 설계(구축)
class MyClass{
	// (멤버)변수
	int x, y;
	String name;
	
	// 메소드(함수)
	void method() {
		System.out.println("MyClass method() 호출");
	}	
}

class Student{
	String name;
	int language;
	int english;
	int math;
	int history;
	
}






