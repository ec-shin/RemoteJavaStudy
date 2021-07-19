package study.e;

import java.io.*;
import java.nio.charset.Charset;

public class E08_PrintStream {
	/*
		# PrintWriter, PrintStream
		
			- 모든 데이터들을 더 편리하게 스트림으로 내보낼 수 있는 클래스
			- printf(), println() 등의 메서드들이 구현되어 있다
	 */
	public static void main(String[] args) {
		//MyFile f = new MyFile("files/myfile.txt");
		
		File f = new File("files/myfile.txt");
		try(
			FileOutputStream fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			PrintStream out = new PrintStream(bout);
		){
			out.println("Hello, world!");
			out.println(" /)/)");
			out.println("(  ..)");
			out.println("(  >♡)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("쓰기 끝!");
	}
}

class MyFile extends File implements AutoCloseable{
	
	// OutputStream으로 문자를 내보내는 역할
	
	FileOutputStream fout;
	OutputStreamWriter oout;
	BufferedOutputStream bout;
	PrintStream out;

	public MyFile(String pathname) throws FileNotFoundException {
		super(pathname);
		
		fout = new FileOutputStream(this);
		bout = new BufferedOutputStream(fout);
		out = new PrintStream(bout, true, Charset.forName("UTF-8"));
	}		
	
	public void close() throws Exception{
		out.close();
		bout.close();
		fout.close();
	}
}










