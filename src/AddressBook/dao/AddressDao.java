package AddressBook.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import AddressBook.data.FileProc;
import AddressBook.dto.HumanDto;

//import static sun.font.ScriptRunData.data;

// Data Access Object
// 데이터를 접근하고 편집하는 object
// 추가, 삭제, 검색, 수정
public class AddressDao {
	
	Scanner sc = new Scanner(System.in);

	// 변수를 100개 생성 (변수들을 생성)
	private HumanDto humanArr[] = new HumanDto[100];
	private int count;
	
	private FileProc fp = null;
	
	public AddressDao() {
		// 변수들에 객체를 생성
		/*
		for (int i = 0; i < humanArr.length; i++) {
			humanArr[i] = new HumanDto();
		}
		*/
		
		fp = new FileProc("address");
		
		humanArr[0] = new HumanDto("홍길동", 24, "123-4567", "서울시", "절친");
		humanArr[1] = new HumanDto("성춘향", 16, "234-5678", "남원시", "여사친");
		humanArr[2] = new HumanDto("일지매", 22, "345-6789", "부산시", "동호회");
		humanArr[3] = new HumanDto("홍길동", 20, "555-5555", "춘천시", "친구");
		
		count = 0;
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
		
		humanArr[count] = new HumanDto(name, age, phone, address, memo);
		count++;
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
			humanArr[index].setName("");
			humanArr[index].setAge(0);
			humanArr[index].setPhone("");
			humanArr[index].setAddress("");
			humanArr[index].setMemo("");
			
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
		
		HumanDto hdto[] = new HumanDto[count];
		
		int n = 0;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				hdto[n] = humanArr[i];
				n++;
			}
		}
		
		// 찾은 데이터의 배열
		for (int i = 0; i < hdto.length; i++) {
			System.out.println(hdto[i].toString());
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
		
		humanArr[index].setPhone(phone);
		humanArr[index].setAddress(address);
		
		System.out.println("정상적으로 수정되었습니다");
	}
	
	public int search(String name) {
		int index = -1;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& name.equals(humanArr[i].getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void allDataPrint() {
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null 
					&& humanArr[i].getName().equals("") == false) {
				System.out.println(humanArr[i].toString());
			}			
		}
	}	
	
	public void filesave() {
		// 실제 배열에 들어 있는 데이터
		int count = 0;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null && !humanArr[i].getName().equals("")) {
				count++;
			}
		}
		
		String dataArr[] = new String[count];
		/*
			이름나이전화번호주소메모
			홍길동24123-4567서울시친구
			홍길동*24*123-4567*서울시*친구
		*/
		
		count = 0;
		for (int i = 0; i < humanArr.length; i++) {
			if(humanArr[i] != null && 
				!humanArr[i].getName().equals("")) {
				
				dataArr[count] = humanArr[i].toString();
				count++;
			}
		}
		
		fp.write(dataArr);
		
	}
}












