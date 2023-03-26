package sample19;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass {
	public static void main(String[] args) {
		/*
			Calendar : 일정관리, 회원관리, 인사관리			
			Date -> 구글에서 검색
		*/
		
		// Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		
		// 오늘 날짜 취득 (getter)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int day = cal.get(Calendar.DATE);
	//	int hour = cal.get(Calendar.HOUR);
		
		System.out.println(year + "/" + month + "/" + day);
		
		// 날짜 셋팅 (setter)
		/*
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 3 - 1);
		cal.set(Calendar.DATE, 16);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		System.out.println(year + "/" + month + "/" + day);
		*/
		// 오전/오후
		String ampm = cal.get(Calendar.AM_PM) == 0 ? "오전":"오후";
		System.out.println(ampm);
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 일(1) ~ 토(7)
		System.out.println(weekday);					
		
		switch(weekday) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;
			case 7:
				System.out.println("토요일");
				break;		
		}
		
		// cal.set(Calendar.YEAR, 2023);
		// cal.set(Calendar.MONTH, 1 - 1);
		
		// 지정 달의 마지막날(28, 29, 30, 31)
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
		
		// 위의 빈칸
		//cal.set(Calendar.MONTH, 10 - 1);
		cal.set(Calendar.DATE, 1);			// 12/01	
		
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int upEmpty = (weekday - 1) % 7;
		System.out.println("위의 빈칸의 수:" + upEmpty);
		
		// 밑의 빈칸
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, lastday);	// 12/31
		
		// 요일
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		int downEmpty = 7 - weekday;
		System.out.println("밑의 빈칸의 수:" + downEmpty);
		
		/*
		// 달력만들기
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 12 - 1);
		cal.set(Calendar.DATE, 1);
				
		int startDay = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		
		System.out.println(year + "년 " + month + "월");
		System.out.println("=======================================================");
		
		String week_day = "일월화수목금토";
		
	//	System.out.print("\t");
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		
		System.out.println("=======================================================");
		
		// 위쪽빈칸
		for(int i = 1;i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜
		int _day = 1;
		for(int i = 0; i < lastDay; i++) {
			System.out.print(_day + "\t");
			
			if((_day + startDay - 1) % 7 == 0) {
				System.out.println();
			}			
			_day++;
		}
		
		// 밑쪽 빈칸
		for(int i = 0;i < (7 - (startDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		
		System.out.println("=======================================================");	
		
		 */
		
		calendarPrint(2022, 12);	
		
	}	
	
	static void calendarPrint(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		
		int startDay = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		
		System.out.println(year + "년 " + month + "월");
		System.out.println("=======================================================");
		
		String week_day = "일월화수목금토";
		
	//	System.out.print("\t");
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		
		System.out.println("=======================================================");
		
		// 위쪽빈칸
		for(int i = 1;i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜
		int _day = 1;
		for(int i = 0; i < lastDay; i++) {
			System.out.print(_day + "\t");
			
			if((_day + startDay - 1) % 7 == 0) {
				System.out.println();
			}			
			_day++;
		}
		
		// 밑쪽 빈칸
		for(int i = 0;i < (7 - (startDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		
		System.out.println("=======================================================");	
	}
}











