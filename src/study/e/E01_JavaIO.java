package study.e;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	/*
		# Java I/0
			- �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��
			- ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ���
			- ���α׷����� ���Ǿ� ������ �����͵��� Ǯ���̶�� �θ���
			
		# Stream
			- �����͵��� ������ ���
			- �����͵��� ���������� ���α׷����� ������ ��θ� InputStream �̶�� �θ���
			- �����͵��� ��µǴ� ������ �������� ��θ� OutputStream �̶�� �θ���
			- �����Ͱ� Stream�� ���� �̵��ϱ� ���ؼ��� �����͸� byteŸ������ ��ȯ���Ѿ� �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		try {
			// FileOutputStream: ���Ϸ� ������ �� �ִ� ��θ� �����Ѵ�.
			FileOutputStream out = new FileOutputStream("a.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			
			out.write("\n Hello World \n".getBytes());
			
			// �� �� ��δ� �ݵ�� �ݾ���� �Ѵ�.
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}












