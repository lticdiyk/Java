package work08;

public class MainClass {
	public static void main(String[] args) {
	//  클래스명  instance
		Student s = new Student();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+ s.name);
		System.out.println("총점:"+ s.getTotal(s.kor, s.eng, s.math) );
		System.out.println("평균:"+ s.getAverage() );	
		
		
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		int ch = t.getChannel();
		System.out.println("CH:"+ ch);
		// CH:10
		
		t.setVolume(20);
		System.out.println("VOL:"+ t.getVolume());
		// VOL:20
		
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(int k, int e, int m) {		
		int sum = k + e + m;
		return sum;
	}
	
	double getAverage() {
		int sum = kor + eng + math;
		double d = (double)sum / 3;
		
		return d;
	}	
}

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	void setChannel(int ch) {	// setter
		channel = ch;
	}	
	int getChannel() {			// getter
		return channel;
	}
	void setVolume(int vol) {
		volume = vol;
	}
	int getVolume() {
		return volume;
	}
	
}





