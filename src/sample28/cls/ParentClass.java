package sample28.cls;

/*
	private
	public
	protected : 자식클래스에서 접근허용. 외부에서 접근을 차단

*/
public class ParentClass {

	public String name;
	public char ch;
	protected int number;
	
	/*
	public ParentClass() {
		System.out.println("ParentClass ParentClass()");
	}
	*/
	
	public ParentClass(char ch) {
		System.out.println("ParentClass ParentClass(char ch)");
		this.ch = ch;
	}
	
	public void parent_method() {
		System.out.println("ParentClass parent_method()");
	}
}
