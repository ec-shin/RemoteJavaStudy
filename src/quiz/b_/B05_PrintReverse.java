package quiz.b_;

import java.util.Scanner;

public class B05_PrintReverse {

	public static void main(String[] args) {
		String user,userReverse="";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>> ");
		user = scan.nextLine();
		
		for(int i=user.length()-1;i>=0;i--) {
			userReverse += user.charAt(i);
		}

		System.out.printf("�������� ������ %s �Դϴ�",userReverse);
	}

}
