package AddressBookList.main;

import java.util.Scanner;

import AddressBookList.dao.AddressDao;

public class MainClass {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		AddressDao dao = new AddressDao();
		
		boolean end = false;
		
		// menu
		out:while(true) {
			
			System.out.println(" << 주소록 >> ");
			System.out.println("1. 지인추가");
			System.out.println("2. 지인삭제");
			System.out.println("3. 지인검색");
			System.out.println("4. 지인수정");
			System.out.println("5. 모두출력");
			System.out.println("6. 데이터저장");
			System.out.println("7. 종료");
			
			System.out.print(">> ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:
					dao.update();
					break;
				case 5:
					dao.allDataPrint();
					break;
				case 6:	
					dao.filesave();
					break;
				case 7:		
					end = true;					
					//System.exit(0);		// 강제종료
					break out;
				default:
					
			}
					
			/*
			if(end) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			*/
						
		}

	}

}




