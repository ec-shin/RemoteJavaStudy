package quiz.b_;

import java.util.Scanner;

public class B02_CheckWord {

	public static void main(String[] args) {
		String str;
		char strFirst, strLast;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��� �ּ���>> ");
		str = scan.nextLine();
		
		strFirst = str.charAt(0);
		strLast = str.charAt(str.length()-1);
		
		if((strFirst >= 'a' && strFirst <= 'z') || (strFirst >= 'A' && strFirst <= 'Z') ) {
			if(strFirst == strLast) {
				System.out.println("OK");
			}else {
				System.out.println("NOT OK");
			}
		}else {
			System.out.println("�Է��Ͻ� ������ ù���ڰ� ��� �ƴմϴ�");
		}

	}

}
