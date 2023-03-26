package AddressBookList.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

public class FileProc {

	// 파일 쓰기, 읽기
	private File file = null;
	
	public FileProc(String filename) {
		file = new File("c:\\tmp\\" + filename + ".txt");
		
		// 실제 파일이 생성되는 부분
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
	
	public String[] read() {	
		
		String datas[] = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 데이터의 총 갯수를 구한다
			int count = 0;
			String str = "";
			while((str = br.readLine()) != null) {
				count++;
			}
			br.close();
			
			// 배열 할당
			datas = new String[count];			
			
			// 파일로부터 배열에 저장
			br = new BufferedReader(new FileReader(file));
			
			int w = 0;
			while((str = br.readLine()) != null) {
				datas[w] = str;
				w++;
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return datas;
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










