package sample26_constructor;

public class MyClass {
	public static void main(String[] args) {
		/*
			constructor : 생성자
						  함수(메소드)
						  메소드명은 클래스명과 동일하다.
						  return value이 없다
						  overload가 가능하다
						  class를 생성시에 자동 호출된다. 1번
						  별도의 호출이 불가능하다. (!= 초기화)
						  생략이 가능하다.
						  
			destructor : 소멸자
						 소멸시에 호출되는 함수
		*/
		
		// BaseClass bc = { 1, "홍길동" };
		// BaseClass bc = new BaseClass();
		// BaseClass bc = new BaseClass(3);
		BaseClass bc = new BaseClass(3, "성춘향");
				
		bc.method();
		bc.method(12);
		
	}
}

class BaseClass{
	int number;
	String name;
	
	public BaseClass() {
		System.out.println("BaseClass BaseClass()");		
	}
	public BaseClass(int num) {
		System.out.println("BaseClass BaseClass(int num)");
	}
	public BaseClass(int num, String na) {
		System.out.println("BaseClass BaseClass(int num, String na)");
		number = num;
		name = na;
	}
	
	public void method() {		
	}
	public void method(int n) {
	}
}



