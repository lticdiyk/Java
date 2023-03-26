package work09;

public class Dice {
	
	int number;
	
	// 주사위를 굴린다
	void setRandom() {
		// 1 ~ 6
		number = (int)(Math.random() * 6) + 1; 
	}
	
	// 주사위 값을 취득
	int getNumber() {
		return number;
	}
	
	
}
