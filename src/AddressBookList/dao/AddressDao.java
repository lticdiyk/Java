package AddressBookList.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AddressBookList.data.FileProc;
import AddressBookList.dto.HumanDto;

// Data Access Object
// 데이터를 접근하고 편집하는 object
// 추가, 삭제, 검색, 수정
public class AddressDao {
	
	Scanner sc = new Scanner(System.in);

	// 변수를 100개 생성 (변수들을 생성)
//	private HumanDto humanArr[] = new HumanDto[100];
	private List<HumanDto> list = new ArrayList<HumanDto>();
	
	private int count;
	
	private FileProc fileProc = null;  // composition(합성)
	
	public AddressDao() {
		// 변수들에 객체를 생성
		/*
		for (int i = 0; i < humanArr.length; i++) {
			humanArr[i] = new HumanDto();
		}
		*/
		
		fileProc = new FileProc("address");
		
		fileload();
		/*
		humanArr[0] = new HumanDto("홍길동", 24, "123-4567", "서울시", "절친");
		humanArr[1] = new HumanDto("성춘향", 16, "234-5678", "남원시", "여사친");
		humanArr[2] = new HumanDto("일지매", 22, "345-6789", "부산시", "동호회");
		humanArr[3] = new HumanDto("홍길동", 20, "555-5555", "춘천시", "친구");
		*/
		
		
		// 데이터를 새로 읽었을 때 배열의 할당되지 않는 공간을 검색
		/*
		int nextcount = 0;
		for (int i = 0; i < humanArr.length; i++) {
			// 생성된 객체를 검사          삭제한 데이터 검사 
			if(humanArr[i] != null) {
				nextcount++;
			}
		}
		
		count = nextcount;
		*/
	}
		
	public void insert() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("지인을 추가합니다");
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		System.out.print("주소 = ");
		String address = "";
		try {
			address = br.readLine(); 
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		System.out.print("메모 = ");
		String memo = sc.next();
				
		
		/*
		humanArr[0].setName(name);
		humanArr[0].setAge(age);
		humanArr[0].setPhone(phone);
		humanArr[0].setAddress(address);
		humanArr[0].setMemo(memo);
		*/
		
	//	humanArr[count] = new HumanDto(name, age, phone, address, memo);
	//	count++;
		
		HumanDto dto = new HumanDto(name, age, phone, address, memo);
		list.add(dto);
	}
	
	public void delete() {
				
		System.out.print("삭제할 지인의 이름 = ");
		String name = sc.next();
		
		// 검색
		int index = search(name);
		/*
		int index = -1;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				index = i;
				break;
			}
		}
		*/
		
		if(index == -1) {
			System.out.println("지인의 정보를 찾을 수 없습니다");
		}
		else {			
			// 삭제
			/*
			humanArr[index].setName("");
			humanArr[index].setAge(0);
			humanArr[index].setPhone("");
			humanArr[index].setAddress("");
			humanArr[index].setMemo("");
			*/
			list.remove(index);
			
			System.out.println("지정한 지인을 삭제하였습니다");
		}
	}
	
	public void select() { // 동명이인을 찾는다
		// 검색
		System.out.print("검색할 지인의 이름 = ");
		String name = sc.next();
		
		/*
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				System.out.println(humanArr[i].toString());
			}
		}
		*/
		
		// 찾을 사람이 몇명인지?
		/*
		int count = 0;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				count++;
			}
		}
		
		if(count < 1) {
			System.out.println("검색한 지인은 찾을 수 없습니다");
			return;
		}
		
		// 찾은 데이터를 보관용 배열
		HumanDto hdto[] = new HumanDto[count]; // 2
		
		int n = 0;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				hdto[n] = humanArr[i];
				n++;  // -> 1
			}
		}
		
		// 찾은 데이터의 배열
		for (int i = 0; i < hdto.length; i++) {
			System.out.println(hdto[i].toString());
		}
		*/
		
		for (HumanDto h : list) {
			if(name.equals(h.getName())) {
				System.out.println(h.toString());
			}
		}		
	}
	
	public void update() {
		System.out.print("수정할 지인의 이름 = ");
		String name = sc.next();
		// 검색
		int index = search(name);		
		if(index == -1) {
			System.out.println("지인의 정보를 찾을 수 없습니다");
			return;
		}
		
		// 수정
		// phone
		// address
		System.out.println("데이터를 찾았습니다");
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		System.out.print("주소 = ");
		String address = sc.next();
		
		//humanArr[index].setPhone(phone);
		//humanArr[index].setAddress(address);
		
		list.get(index).setPhone(phone);
		list.get(index).setAddress(address);
		/*
		HumanDto h = list.get(index);
		h.setAddress(address);
		h.setPhone(phone);
		*/
		System.out.println("정상적으로 수정되었습니다");
	}
	
	
	public int search(String name) {
	/*	int index = -1;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				index = i;
				break;
			}
		}*/
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			HumanDto h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
		
	public void allDataPrint() {
		/*
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& humanArr[i].getName().equals("") == false) {
				System.out.println(humanArr[i].toString());
			}			
		}*/
		
		for (HumanDto humanDto : list) {
			System.out.println(humanDto.toString());
		}
		
	}	
	
	
	public void filesave() {
		// 실제 배열에 들어 있는 데이터
		/*
		int count = 0;
		for (int i = 0; i < humanArr.length; i++) {
			// 생성된 객체를 검사          삭제한 데이터 검사 
			if(humanArr[i] != null && !humanArr[i].getName().equals("")) {
				count++;
			}
		}
		*/
		
		// String dataArr[] = new String[count];
		String dataArr[] = new String[list.size()];
		
		/*
			이름나이전화번호주소메모
			홍길동24123-4567서울시친구
			홍길동*24*123-4567*서울시*친구
		*/
		
		/*
		count = 0;
		for (int i = 0; i < humanArr.length; i++) {
			
			if(humanArr[i] != null && !humanArr[i].getName().equals("")) {
				//      0 1 2             0 1 3
				dataArr[count] = humanArr[i].toString();
				count++;
			}
		}*/
		for (int i = 0; i < list.size(); i++) {
		//	HumanDto h = list.get(i);
		//	dataArr[i] = h.toString();
			
			dataArr[i] = list.get(i).toString();
		}		
		
		fileProc.write(dataArr);
		
	}
	
	public void fileload() {
		
		String datas[] = fileProc.read();
		/*
		for (String s : datas) {
			System.out.println(s);
		}
		*/
		
		for (int i = 0; i < datas.length; i++) {
		
			String split[] = datas[i].split(":");
			//split[0] -> 이름
			//split[1] -> 나이
			/*
			humanArr[i] = new HumanDto(	split[0], 
										Integer.parseInt(split[1]), 
										split[2], 
										split[3], 
										split[4] );*/
			
			HumanDto h = new HumanDto(	split[0], 
										Integer.parseInt(split[1]), 
										split[2], 		
										split[3], 
										split[4] );			
			list.add(h);
		}
	}
}












