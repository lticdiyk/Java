package sample25.my;

public class MyClass {
	/*
	  		Encapsulation == 은닉성, 캡슐화
	  		외부접근 제어(차단, 읽기전용)
	  		
	  		접근지정자
	  		private		: 개인적인	
	  		public		: 대중적인(누구나)
	  		protected	: 상속에 관련
	 */
	
	// 멤버변수 90%이상 -> private
	private int number;
	public String name;
	protected double height;
	
	// 메소드 90%이상 -> public
	public void setNumber(int num) {  // method
		number = num;
	}	
	public int getNumber() {
		return number;
	}
	
	
}





