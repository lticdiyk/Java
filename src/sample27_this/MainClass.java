package sample27_this;

public class MainClass {
	public static void main(String[] args) {
		
		/*
			this 키워드(pointer) : 그 객체의 주소(참조)			
		 */
		/*
		MyClass clsOne = new MyClass();
		System.out.println(clsOne);
		
		System.out.println(clsOne.getThis());
		
		clsOne.method();
		*/
	//	MyClass clsTwo = new MyClass();
	//	System.out.println(clsTwo);
		
		
		//MyClass cls = new MyClass("tom");
		MyClass cls = new MyClass();
	}
}

class MyClass{
	
	String name;
	
	public MyClass() {		
		this("john");
		func();
		System.out.println("MyClass MyClass()");
	}
	
	public MyClass(String name) {
	//	this(); // 기본 생성자 호출
		System.out.println("MyClass MyClass(String name)");
		this.name = name;
	}	
	
	public void func() {
		
	}
	
	
	MyClass getThis() { // 0번째 매개변수로 모든 메소드에 추가되어 있다
		return this;
	}
	
	void method() {
		System.out.println( this );		
		name = "일지매";
		getThis();
	}
	
	void setName( String name ) {
		this.name = name;
	}
	
	void setNameMethod() {
		String name = "홍길동";  // local(지역) 변수
		
		this.name = name;
	}
}




