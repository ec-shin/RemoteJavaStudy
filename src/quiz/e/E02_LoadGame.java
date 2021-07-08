package quiz.e;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class E02_LoadGame {
	ArrayList<String> resultList = new ArrayList<>();
	int count[] = new int[3];
	String result;
	String ment;
	
	public void loadResult() {
		try {
			FileInputStream in = new FileInputStream("src/quiz/e/result.txt");
			
			result = "";
			int ch = -1;
			while((ch = in.read()) != -1) {
				if((char)ch=='\n') {
					resultList.add(result);
					result="";
					continue;
				}
				result += (char)ch;
			}
			
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void writeRecord() {		
		for(int i=0;i<resultList.size();i++) {
			if(resultList.get(i).contains("win")) {
				count[0]++;
			}else if(resultList.get(i).contains("draw")) {
				count[1]++;
			}else {
				count[2]++;
			}
		}		
		ment = "user의 전적 = 승:"+count[0]+" 무:"+count[1]+" 패:"+count[2]+"\n";
		System.out.println(ment);
		
		try {
			FileOutputStream out = 
					new FileOutputStream("src/quiz/e/record.txt", true);			
			out.write(ment.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("결과를 입력했습니다.");
	}
	
	public static void main(String[] args) {
		E02_LoadGame lg = new E02_LoadGame();
		
		for(int i=0; i<5;i++) {
			new E01_SaveGame().gameStart();
		}
		lg.loadResult();
		lg.writeRecord();
	}
	
}


















