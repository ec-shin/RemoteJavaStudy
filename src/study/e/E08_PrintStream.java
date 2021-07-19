package study.e;

import java.io.*;
import java.nio.charset.Charset;

public class E08_PrintStream {
	/*
		# PrintWriter, PrintStream
		
			- ��� �����͵��� �� ���ϰ� ��Ʈ������ ������ �� �ִ� Ŭ����
			- printf(), println() ���� �޼������ �����Ǿ� �ִ�
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
			out.println("(  >��)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���� ��!");
	}
}

class MyFile extends File implements AutoCloseable{
	
	// OutputStream���� ���ڸ� �������� ����
	
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










