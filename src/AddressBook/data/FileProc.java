package AddressBook.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProc {

	// 파일 쓰기, 읽기
	private File file = null;
	
	public FileProc(String filename) {
		file = new File("c:\\tmp\\" + filename + ".txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("기존의 파일이 있습니다");
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	public void read() {
		
	}
	
	public void write(String datas[]) {
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
			}
			
			pw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
		System.out.println("파일에 저장되었습니다");
	}
	
	
}










