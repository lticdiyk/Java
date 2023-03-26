package sample29;

public class MainClass {
	public static void main(String[] args) {
		
	//	Child cobj = new Child();
	//	cobj.pMethod();
	//	cobj.name = "";
		
		/*
		Child cobj = new Child();
		// cobj.method();
		cobj.process();
		*/
		
		/*
			부모클래스 부모클래스객체 = new 자식클래스()
		
		*/
		Parent pobj = new Child();
		pobj.method();
		
		
		Child c = new Child();
		
	}
}

class Parent{
	protected String name; // 자식클래스에서만 접근을 허용
	
	public Parent() {
		System.out.println("Parent Parent()");
	}
	public Parent(String name) {
		System.out.println("Parent Parent(String name)");
	}
	
	public void pMethod() {
		System.out.println("Parent pMethod()");
	}
	
	public void method() {
		System.out.println("Parent method()");
	}
}

class Child extends Parent{
	
	public Child() {
		// super();
		super("성춘향");
		System.out.println("Child Child()");
	}
	
	public void func() {
		name = "홍길동";
		pMethod();
	}
	
	// OverRide : 상속받은 함수를 자식클래스에서 고쳐 기입하는 것. 같은 사양(prototype) 
	public void method() {			
		System.out.println("Child method()");
	}
	
	public void process() {
		
		super.method();  // 부모 클래스 메소드		
		this.method(); // 자식 클래스 메소드
	}
}




