package work07;

import java.util.Arrays;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		
		// 학생성적 관리
		String name[] = { "홍길동", "성춘향", "일지매" };
		// String subject[] = { "국어", "영어", "수학" };
		int language[] = { 90, 100, 95 };
		int math[] = { 95, 95, 80 };
		int english[] = { 100, 90, 85 };
		
		// 지정과목의 총점(함수)
		int sum = subjectSum(english);
		System.out.println("영어점수의 합계는 " +  sum + "입니다");
		
		// 지정과목의 평균
		double avg = subjectAvg(math);
		System.out.println("수학점수의 평균은 " + avg + "입니다");
				
		// 한명의 학생의 총점과 평균출력
		studentSumAndAvg("성춘향", name, language, math, english);
				
		// 지정과목의 1등은 누구?
		subjectNumberOne("영어", name, english);
		
	}	
	
	static int subjectSum(int subject[]) {		
		int sum = 0;		
		for (int i = 0; i < subject.length; i++) {
			sum = sum + subject[i];
		}		
		return sum;
	}
	
	static double subjectAvg(int subject[]) {
		int sum = subjectSum(subject);
		double avg = sum / subject.length;		
		return avg;
	}
	
	static void studentSumAndAvg(String student, String name[], int lang[], int math[], int eng[]) {
		// 검색
		int index = -1;
		for (int i = 0; i < name.length; i++) {
			if(student.equals(name[i])) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("학생정보를 찾을 수 없습니다");
			return;
		}
		
		// 합계
		int sum = lang[index] + math[index] + eng[index];
		
		// 평균
		double avg = sum / 3;
		
		System.out.println(student + "학생의 총점은 " + sum + "이고 평균은 " + avg + "입니다");		
	}
	
	static void subjectNumberOne(String title, String name[], int subject[]) {
		int numberOne = 0;
		int max = subject[0];
		for (int i = 0; i < subject.length; i++) {
			if(max < subject[i]) {
				max = subject[i];
				numberOne = i;
			}
		}
	
		System.out.println(title + "과목의 1등은 " 
							+ name[numberOne] + "학생이며 점수는 " + subject[numberOne] + "점입니다");
	}
	
}














