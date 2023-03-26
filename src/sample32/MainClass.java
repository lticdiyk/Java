package sample32;

public class MainClass {
	public static void main(String[] args) {
		/*
			abstract class : 추상 클래스
							 추상 메소드를 하나이상 포함하고 있는 클래스
			추상 메소드 : 내용(소스코드)은 없고 선언만 되어 있는 함수
			
			일반 메소드
			public void method(int n){
				처리(코드)
			}
			
			public abstarct void method(int n);			 
		*/
		
		// AbstractClass acls = new AbstractClass();
		
		Child ch = new Child();
		ch.normalMethod();
		ch.abstractMethod();
		
		AbstractClass acls = new Child();
		acls.normalMethod();
		acls.abstractMethod();
		
		AbstractClass bcls = new AbstractClass() {			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
			}
		};
		bcls.normalMethod();
		bcls.abstractMethod();
	}
}

abstract class AbstractClass{
	
	private String name;
	
	// 일반 메소드
	public void normalMethod() {	
		System.out.println("AbstractClass normalMethod()");
	}
	
	// 추상메소드
	public abstract void abstractMethod();	
}

class Child extends AbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("Child abstractMethod()");
	}	
}










