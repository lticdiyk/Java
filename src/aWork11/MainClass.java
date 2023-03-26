package aWork11;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4.
		Unit unit[] = new Unit[3];
		unit[0] = new Dropship();
		unit[1] = new Marine();
		unit[2] = new Tank();
		
		for (int i = 0; i < unit.length; i++) {
			unit[i].move(100, 200);
			unit[i].stop();
			
			if(unit[i] instanceof Marine) {
				Marine m = (Marine)unit[i];
				m.stimPack();
			}
			else if(unit[i] instanceof Tank) {
				Tank t = (Tank)unit[i];
				t.changeMode();
			}
		}
		
		// 5.
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		/*
		Robot arr[] = new Robot[3];
		arr[0] = new DanceRobot();
		arr[1] = new SingRobot();
		arr[2] = new DrawRobot();
		*/
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
	}
	
	static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)robot;
			d.dance();
		}
		else if(robot instanceof SingRobot) {
			SingRobot s = (SingRobot)robot;
			s.sing();
		}
		else if(robot instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)robot;
			d.draw();
		}
	}
}

class Unit{
	int x, y; // 현재 위치
	void move(int x, int y) { 
		/* 지정된 위치로 이동 */ 
	}
	void stop() { 
		/* 현재 위치에 정지 */ 
	}
}
class Marine extends Unit{ // 보병
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}
}
class Tank extends Unit{ // 탱크
	void changeMode() { 
		/* 공격모드를 변환한다. */
	}
}
class Dropship extends Unit{ // 수송선
	void load() { 
		/* 선택된 대상을 태운다.*/ 
	}
	void unload() { 
		/* 선택된 대상을 내린다.*/ 
	}
}


class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}




