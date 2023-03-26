package sample31.cls;

public class Batter extends Human{
	int batCount;
	int hit;
	
	public Batter() {
	}
	public Batter(String name, int age, int batCount, int hit) {
		super(name, age);
		this.batCount = batCount;
		this.hit = hit;
	}
	public int getBatCount() {
		return batCount;
	}
	public void setBatCount(int batCount) {
		this.batCount = batCount;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "Batter [" + super.toString() + ", batCount=" + batCount + ", hit=" + hit + "]";
	}	
}
