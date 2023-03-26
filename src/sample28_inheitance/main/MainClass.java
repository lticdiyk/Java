package sample28_inheitance.main;

import sample28_inheitance.cls.ChildClass;
import sample28_inheitance.cls.ParentClass;

public class MainClass {
	public static void main(String[] args) {
		/*
			상속성 : 부모클래스에서 자식클래스로 처리(method)들과 특성(property)을 물러받는 것 
		*/ 
		
		ChildClass cc = new ChildClass('A');
		
		cc.parent_method();	
		cc.func();
		cc.name = "홍길동";
		
	//	cc.number = 12;
		
		ParentClass pc = new ParentClass('B');
		pc.parent_method();
		
	//	pc.number = 23;
		
		
	}
}


