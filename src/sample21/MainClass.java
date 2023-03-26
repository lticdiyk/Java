package sample21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		/*
			file : 	저장매체 ==> 기능
					Database
					기록(쓰기) - 추가, 불러오기(읽기) - 검색
			
			*.txt	-> 	dll, lib, jar
			
						dynamic link library(dll) -> 동적
						library(lib) -> 정적 		
		*/
		
		File file = new File("c:\\");
		
		/*
		// 파일을 조사
		String filelist[] = file.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		// 파일과 폴더를 구분해서 조사
		File filelist[] = file.listFiles();
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());
			}
			else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
		
		// 파일을 생성
		File newfile = new File("c:\\tmp\\newfile.txt");		
		try {
			if(newfile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 파일의 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		// 읽기전용
		newfile.setReadOnly();
				
		// 삭제
		newfile.delete();
		
		
		// (문자열)쓰기
		File f = new File("c:\\tmp\\iofile.txt");
		
		
		try {
			// 파일이 없으면 생성한다
			
			// 쓰기
			/*
			FileWriter fwriter = new FileWriter(f);
			fwriter.write("안녕하세요");
			fwriter.write("Hello");
			fwriter.close();
			*/
			
			// 추가쓰기
			/*
			FileWriter fwriter = new FileWriter(f, true);
			fwriter.write("반갑습니다");			
			fwriter.close();
			*/
			
			
			/*
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			pw.println("hi");
			pw.print("헬로우");
			pw.println("world");
			pw.close();
			*/
			
			// (문자열)읽기
			// 한글자씩 읽기
			/*
			FileReader fr = new FileReader(f);
			int ch = fr.read();
			while(ch != -1) {
				System.out.print((char)ch);
				ch = fr.read();
			}
			*/
			
			// 문장으로 읽기
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			br.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}




