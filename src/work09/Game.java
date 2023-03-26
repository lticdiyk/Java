package work09;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	int coin = 20;
	int batting;
	int userNumber;
	
	Dice dice[] = new Dice[2];  // dice1, dice2

	void init() {
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Dice();
			dice[i].setRandom();
			
			System.out.println("주사위" + i + ":" + dice[i].getNumber());
		}		
	}	
	void userInput() {
		// 배팅급액
		System.out.print("금액 = ");
		batting = sc.nextInt();
		
		coin = coin - batting;
		
		// 유저의 주사위 숫자
		while(true) {
			System.out.print("주사위의 합 = ");
			userNumber = sc.nextInt();
			
			if(userNumber != 2 && userNumber != 12) {
				break;
			}
			
			System.out.println("다른 숫자를 입력해 주십시오");
		}
	}	
	void finding() {
		
		int dice1 = dice[0].getNumber();
		int dice2 = dice[1].getNumber();
		
		int diceSum = dice1 + dice2;
		
		if(userNumber == diceSum) {
			if(diceSum == 3 || diceSum == 11) {
				batting = batting * 18;
			}
			else if(diceSum == 4 || diceSum == 10) {
				batting = batting * 12;
			}
			else if(diceSum == 5 || diceSum == 9) {
				batting = batting * 9;
			}
			else if(diceSum == 6 || diceSum == 8) {
				batting = batting * 7;
			}
			else if(diceSum == 7) {
				batting = batting * 6;
			}
			
			System.out.println("축하합니다!!!");
			coin = coin + batting;
			
		}else {
			System.out.println("아쉽습니다. 다시 도전하세요");
		}		
	}
	void result() {
		System.out.println("주사위1:" + dice[0].getNumber());
		System.out.println("주사위2:" + dice[1].getNumber());
				
		System.out.println("합계:" + (dice[0].getNumber() + dice[1].getNumber()));
		System.out.println("당신이 입력 수:" + userNumber);
		System.out.println("현재금액:" + coin);		
	}
	
	void play() {
		
		while(true) {
			init();
			userInput();
			finding();
			result();
			
			System.out.print("replay(y/n)? = ");
			String replay = sc.next();
			
			if(replay.equals("n")) {
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("파이팅입니다!");
		}
	}
}






