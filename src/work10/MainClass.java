package work10;

public class MainClass {
	public static void main(String[] args) {
		
		// 1.
		Circle circle = new Circle(3.0);
		System.out.println( circle.calcArea() );

		Rectangle rect = new Rectangle(3, 3);
		System.out.println( rect.calcArea() );
		System.out.println("정사각형 = " + rect.isSquare());
		
				
		Shape shapeOne = new Circle(6);
		System.out.println(shapeOne.calcArea());
		
		Shape shapeTwo = new Rectangle(5, 6);
		System.out.println(shapeTwo.calcArea());
		
		Rectangle r = (Rectangle)shapeTwo;
		System.out.println("정사각형 = " + r.isSquare());
		
		
		Object obj = new Circle(6);
		Object obj1 = new Rectangle(6, 6);
		
		// 2.
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	
		
		System.out.println("p1==p2?"+(p1.toString().equals( p2.toString() ) ));
		
		
		// 3.
		Child c = new Child();
		System.out.println("x=" + c.getX());		
	}
}

class Parent {
	int x = 100;
	
	Parent() {
		this(200);
	}
	Parent(int x) {
		this.x = x; // -> 200
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
	 // super();	
		this(1000);
	}
	Child(int x) {
		this.x = x;
	}
}












