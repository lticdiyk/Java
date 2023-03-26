package sample31.cls;

public class Pitcher extends Human{
	private int win;
	private int lose;
	
	public Pitcher() {
	}
	public Pitcher(String name, int age, int win, int lose) {
		super(name, age);
		this.win = win;
		this.lose = lose;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	@Override
	public String toString() {
		return "Pitcher [" + super.toString() + ", win=" + win + ", lose=" + lose + "]";
	}
	
	
}
