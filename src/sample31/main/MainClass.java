package sample31.main;

import sample31.cls.Batter;
import sample31.cls.Human;
import sample31.cls.Pitcher;

public class MainClass {
	public static void main(String[] args) {
		
	//	Pitcher pitArr[] = new Pitcher[10];
	//	Batter batArr[] = new Batter[10];
		
		Human humanArr[] = new Human[5];
		
		humanArr[0] = new Pitcher("성춘향", 16, 10, 2);
		humanArr[1] = new Pitcher("일지매", 22, 6, 3);
		humanArr[2] = new Batter("홍두께", 24, 13, 4);
		humanArr[3] = new Batter("홍길동", 25, 21, 6);
		humanArr[4] = new Pitcher("이몽룡", 17, 9, 1);

		for (int i = 0; i < humanArr.length; i++) {
			System.out.println(humanArr[i].toString());
		}
		
		for (int i = 0; i < humanArr.length; i++) {
			
			if(humanArr[i] instanceof Pitcher) {
				Pitcher p = (Pitcher)humanArr[i];
				System.out.println(p.getWin() + "승 " + p.getLose() + "패");
			}
			else if(humanArr[i] instanceof Batter) {
				Batter b = (Batter)humanArr[i];			
				System.out.println(b.getBatCount() + "타수 " + b.getHit() + "안타");
			}
		}
		
	}
}






