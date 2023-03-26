package sample35;

public class MainClass {
	public static void main(String[] args) {
		/*
			static : 정적 != 동적(dynamic) 
			         memory 공간이 확보. 유지
			         
			memory
			stack 							heap				static				system
			지역(local)변수, 매개(method)변수	멤버(class)변수		정적(static)변수

			변수 : 지역(local)변수, 멤버(class)변수, 매개(method)변수, 정적(static)변수 == 전역(global)변수
			
		*/
		
		int localvar;	// 지역(local)변수 (auto)	
		
		/*
		MyClass my = new MyClass();
		my.membervar = 12;
		
		my.method('A');
		*/
		
		MyClass.st_number = 11;
		
		MyClass.st_method();
	}
	
	static void func() {		
		int localvar;	// 지역(local)변수
	}
}

class MyClass {	
	private int membervar = 1; // 멤버(class)변수
	
	static int st_number;
	
	public void method(char c) {  // 매개(method)변수
		int localvar;	// 지역(local)변수		
	}
	
	public void func() {
		// static int stnumber = 1;
		this.membervar = 12;
		
		MyClass.st_method();
	}
	
	public static void st_method() {	
		int num;
		System.out.println("MyClass st_method()");
	}
	
}






