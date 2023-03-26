package sample28.cls;

public class ChildClass extends ParentClass{
	
	/*
		this : 자기참조(heap 영역의 주소)
		super : 부모참조(heap 영역의 주소) keyword
		
		OverRide
	*/
	public ChildClass() {
		super('A');
		System.out.println("ChildClass ChildClass()");
	}
	
	public ChildClass(char c) {
		super(c);
		System.out.println("ChildClass ChildClass(char c)");		
	}
	
	public void func() {
		
		number = 123;
		
		System.out.println("ChildClass func()");
	}
}







