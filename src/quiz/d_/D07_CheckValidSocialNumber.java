package quiz.d_;

import java.util.Scanner;

public class D07_CheckValidSocialNumber {
	Scanner scan;
	boolean check = true;

	boolean checkRule(String number) {
		if (number.length() != 14) {
			System.out.println("�ֹε�Ϲ�ȣ 14�ڸ��� �ƴմϴ�.");
		} else if (number.charAt(6) != '-') {
			System.out.println("�ֹε�Ϲ�ȣ �߰��� -�� �����ϴ�.");
		} else if (number.charAt(2) > '1') {
			System.out.println("�¾ ���� ���ڸ��� 2�� �� �� �����ϴ�.");
		} else if (number.charAt(2) == '0' && number.charAt(3) == '0') {
			System.out.println("00���� �¾ �� �����ϴ�.");
		} else if (number.charAt(2) == '1' && number.charAt(3) > '2') {
			System.out.println("12�� �̻��� ���� �����ϴ�.");
		} else {
			for (int i = 0; i < number.length(); i++) {
				char ch = number.charAt(i);
				if ((i == 0 || i == 1) && !Character.isDigit(ch)) {
					System.out.println("�Ǿ� ���ڸ��� �ϳ��� ���ڰ� �ƴմϴ�.");
					return true;
				} else if (i > 6 && !Character.isDigit(ch)) {
					System.out.println("���� 7�ڸ��� ���� ���ڿ����մϴ�.");
					return true;
				}
			}
			return false;
		}
		return true;
	}

	void monthCheck(String number) {
		int year = Integer.parseInt(number.substring(0, 2));
		int month = Integer.parseInt(number.substring(2, 4));
		int day = Integer.parseInt(number.substring(4, 6));

		if (month==2 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			if (day > 29) {
				System.out.println("���⿡�� 29�� �ʰ��� �� �����ϴ�.");
			}else {
				check = false;
			}
		} else if (month==2 && (year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			if (day > 28) {
				System.out.println("2���� 28�� �ʰ��� �� �����ϴ�.");
			}else {
				check = false;
			}
		} else if (month < 8 && month % 2 != 0 && day > 31) {
			System.out.println("�ش� ���� �� ���� 31���� �ѱ� �� �����ϴ�.");
		} else if (month < 8 && month % 2 == 0 && day > 30) {
			System.out.println("�ش� ���� �� ���� 30���� �ѱ� �� �����ϴ�.");
		} else if (month >= 8 && month % 2 == 0 && day > 31) {
			System.out.println("�ش� ���� �� ���� 31���� �ѱ� �� �����ϴ�.");
		} else if (month >= 8 && month % 2 != 0 && day > 30) {
			System.out.println("�ش� ���� �� ���� 30���� �ѱ� �� �����ϴ�.");
		} else {
			check = false;
		}

	}

	void checkStart() {
		String number = null;
		while (check) {
			scan = new Scanner(System.in);
			System.out.println("�ֹε�Ϲ�ȣ�� �Է��� �ּ���.");
			number = scan.nextLine();
			if(checkRule(number)) {
				continue;
			}
			monthCheck(number);
		}
		System.out.println("�ֹε�Ϲ�ȣ: " +number+"�� �Է¹޾ҽ��ϴ�.");
	}

	public static void main(String[] args) {
		new D07_CheckValidSocialNumber().checkStart();
	}
}
