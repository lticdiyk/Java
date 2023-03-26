package sample25_encapsulation.main;

import sample25_encapsulation.my.MyClass;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass mycls = new MyClass();
		
		// mycls.number = 1;
		mycls.name = "홍길동";
		// mycls.height = 174.1;
		
		mycls.setNumber(123);  // private int number; <- 123
		
		int number = mycls.getNumber();
		System.out.println("number = " + number);
	}

}
