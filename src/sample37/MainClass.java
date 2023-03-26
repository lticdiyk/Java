package sample37;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		/*
			Collection : 수집(데이터, Object)
			
			List : 목록
			 	ArrayList
			 		배열처럼 사용할 수 있는 리스트 == 유동적배열
			 		선형구조
			 		배열처럼 index로 접근하고 관리한다.	0 1 2 3 4	
			 		검색속도가 빠르다
			 	
			 	LinkedList		
			 		추가/삭제 속도 빠르다
			
			Map : 사전
				HashMap				
				TreeMap
		*/
		
	//	ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
		ArrayList<String> arrlist = new ArrayList<String>();
		
		// 추가
		String str = new String("Tigers");
		arrlist.add(str);
		
		arrlist.add("Eagles");
		arrlist.add("Bears");
		
		// 리스트의 크기(길이)
		System.out.println(arrlist.size());
		
		for(int i = 0;i < arrlist.size(); i++) {
			System.out.println(i + ":" + arrlist.get(i));    // == arrlist[i]
		}
		System.out.println();
		
		
		arrlist.add("Lions");  // 맨뒤에 추가	
		
		for(int i = 0;i < arrlist.size(); i++) {
			System.out.println(i + ":" + arrlist.get(i));    // == arrlist[i]
		}
		System.out.println();
		
		
		arrlist.add(2, "Giants");
		
		for(int i = 0;i < arrlist.size(); i++) {
			System.out.println(i + ":" + arrlist.get(i));    // == arrlist[i]
		}
		System.out.println();
		
		// 삭제
		arrlist.remove(1);	// 삭제하고 싶은 index
		
		for(int i = 0;i < arrlist.size(); i++) {
			System.out.println(i + ":" + arrlist.get(i));    // == arrlist[i]
		}
		System.out.println();
		
		// 검색
		int index = arrlist.indexOf("Giants");
		System.out.println("데이터가 있습니다 " + index);
		
		for(int i = 0;i < arrlist.size(); i++) {
			String s = arrlist.get(i);
			if("Giants".equals(s)) {
				index = i;
				break;
			}			
		}
		
		System.out.println("데이터가 있습니다 " + index);
		System.out.println();
		
		// 수정
		String updateStr = "Twins";
		
		arrlist.set(2, updateStr);
		for(int i = 0;i < arrlist.size(); i++) {
			System.out.println(i + ":" + arrlist.get(i));    // == arrlist[i]
		}
		System.out.println();
		
		
		
	//	ArrayList<Human> list = new ArrayList<Human>();
		List<Human> list = new ArrayList<Human>();
		
		// 추가 -> 3명
		Human hman = new Human("홍길동", 24);
		list.add(hman);
		
		hman = new Human("성춘향", 16);
		list.add(hman);
		
		list.add(new Human("일지매", 22));
		/*
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			System.out.println(h.toString());
		}*/
		
		for(Human h : list) {
			System.out.println(h.toString());
		}
		System.out.println();
		
		hman = new Human("홍두께", 23);
		list.add(1, hman);
		
		for(Human h : list) {
			System.out.println(h.toString());
		}
		System.out.println();
				
		// 삭제 -> 1명
		String name = "일지매";
		
		int findindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				findindex = i;
				break;
			}
		}
		list.remove(findindex);
		
		for(Human h : list) {
			System.out.println(h.toString());
		}
		System.out.println();
		
		// 검색 -> 이름
		name = "성춘향";		
		findindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				findindex = i;
				break;
			}
		}
		if(findindex != -1) {
			System.out.println(list.get(findindex).toString());
		}else {
			System.out.println("데이터가 없습니다");
		}
		System.out.println();
				
		// 수정 -> 1명
		Human updateHman = new Human("이몽룡", 17);		
		list.set(1, updateHman);
		
		for(Human h : list) {
			System.out.println(h.toString());
		}
				
		System.out.println();
		
		System.out.println(list.toString());
		// Arrays.toString()
	}
}





