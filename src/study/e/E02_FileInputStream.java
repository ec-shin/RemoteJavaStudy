package study.e;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E02_FileInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
				InputStram.read() : �� ���ھ� �о���δ�.
				InputStram.read(byte[]) : ������ �����͸� byte[]�� ũ�⸸ŭ �о���δ�.
				InputStram.read(byte[], start, end) : ...
				
				�� �޼��� ��� �� �̻� ���� ���� ���ٸ� -1�� ��ȯ�Ѵ�
			 */
			
			byte buffer[] = new byte[16];
			
			//line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			int len =-1, count=0;
			while((len = in.read(buffer,6,10)) != -1) {
				buffer[4] = (byte)(count++ + '0');
				
				System.out.println(new String(buffer));
				System.out.println("-----------------------");
				//System.out.printf("-- %d����\n", len);
			}
			
			//int ch = -1;
			//while((ch = in.read()) != -1) {
			//	System.out.println((char)ch);
			//}
			
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
