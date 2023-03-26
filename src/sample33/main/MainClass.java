package sample33.main;

import sample33.cal.Calculator;
import sample33.cal.CalculatorImpl;

public class MainClass {
	public static void main(String[] args) {
		/*
			interface : 추상메소드만을 포함하는 class    == 껍데기(통)
						선언, prototype를 확인하는 경우
						다중 상속이 가능하다
						확장성, 클래스에서 포함하는 메소드를 파악하는데 유리하다
		*/
		
		// MyInterface mi = new MyInterface();
		
		MyClass mycls = new MyClass();
		mycls.func();
		
		MyInterface myint = new MyClass();
		myint.func();
		
		MyInterface myif = new MyInterface() {			
			@Override
			public void func() {
				System.out.println("MyInterface func()");				
			}
		};		
		myif.func();
		
		
		Calculator cal = new CalculatorImpl();
		cal.plus();
		cal.minus();
		
		CalculatorImpl cali = new CalculatorImpl();
		
	}
}

interface MyInterface{	
	// 변수
//	private int number;		// 변수선언 불가
	
//	public void method() { } // 메소드 작성 불가
	
	public void func();
}

class MyClass implements MyInterface{

	@Override
	public void func() {
		System.out.println("MyClass func()");
	}
}







