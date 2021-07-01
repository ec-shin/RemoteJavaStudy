package quiz.d_;

import java.util.Scanner;

public class D09_BruteForce {
	Scanner scan;
	static String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*";

	
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (int)Math.pow(charset.length(),password_size);
		
		for(int i=0; i< all_password; i++) {
			long value = i;
			
			String password="";
			while(value>0) {
				password += arr[(int)value%len];
				value/=len;
			}
			
			if(password.length() < password_size) {
				int gap = password_size - password.length();
				for(int j=0; j < gap;j++){
					password = "a" + password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : " + len);
	}
	
	public static void main(String[] args) {
		bruteforce(10);
	}
}


/*
��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ���

- ���� ��ҹ���
- ����
- Ư������(shift�� ������ �͵�)
ex) 4���� 0000-zzzz
*/