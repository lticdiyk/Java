package work10;

public class Point3D {
	int x,y,z;
	
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Point3D() {
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {  // = p2
		/*
		(1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.
		*/
		Point3D p2 = (Point3D)obj;
		if(x == p2.x && y == p2.y && z == p2.z ) {
			return true;
		}
		
		return false;
	}
	
	
	@Override  // annotation
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
		
	
}
