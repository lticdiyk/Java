package work10;

public class Circle extends Shape {
	
	double r;
	
	public Circle() {
		r = 3;
	}	

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	double calcArea() {			
		return (r * r * Math.PI);
	}

}
