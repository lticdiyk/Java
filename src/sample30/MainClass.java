package sample30;

public class MainClass {
	public static void main(String[] args) {
		
		ChildOne pitcher[] = new ChildOne[10];  // child101, child102, child103 
		ChildTwo batter[] = new ChildTwo[10];
		
		// 추가 -> 입력
		// 어느쪽 클래스를 추가?		
		
		// logic		
		
		Parent parent[] = new Parent[5];
		
		parent[0] = new ChildOne();
		parent[1] = new ChildTwo();
		parent[2] = new ChildTwo();
		parent[3] = new ChildTwo();
		parent[4] = new ChildOne();
		
		for (int i = 0; i < parent.length; i++) {
			parent[i].method();
		}
		
		ChildOne one = (ChildOne)parent[0];		
		one.func();
		
		// instanceof -> keyword
		if(parent[0] instanceof ChildOne) {
			System.out.println("parent[0]는 ChildOne으로 생성되었습니다");
		}
		
		for (int i = 0; i < parent.length; i++) {
			if(parent[i] instanceof ChildOne) {
				System.out.println("parent[" + i + "]는 ChildOne으로 생성되었습니다");
			}
			else if(parent[i] instanceof ChildTwo) {
				System.out.println("parent[" + i + "]는 ChildTwo으로 생성되었습니다");
			}
		}		
		
	}
}

class Parent{	
	
	public void method() {
		System.out.println("Parent method()");
	}
}

class ChildOne extends Parent{	
	public void method() {
		System.out.println("ChildOne method()");
	}
	
	public void func() {
		System.out.println("ChildOne func()");
	}
}

class ChildTwo extends Parent{
	public void method() {
		System.out.println("ChildTwo method()");
	}
	
	public void process() {
		System.out.println("ChildOne process()");
	}
}






