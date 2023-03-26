package work10;

public class Rectangle extends Shape{

	int width, height;
	
	public Rectangle() {
	}	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {		
		return width * height;
	}
	
	public boolean isSquare() {
		if(width == height) return true;
		else 				return false;		
	}
	
}










