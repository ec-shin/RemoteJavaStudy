package quiz.a_;

import java.util.Scanner;

public class A06_GeussAge {

	public static void main(String[] args) {
		int userYear;
		int nowYear;
		int userAge;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է����ּ��� >>");
		userYear = scan.nextInt();
		System.out.print("���� �⵵�� �Է����ּ��� >>");
		nowYear = scan.nextInt();
		
		userAge = nowYear-userYear+1;
		System.out.println("����� ���̴� "+userAge+"�Դϴ�");
	}

}
