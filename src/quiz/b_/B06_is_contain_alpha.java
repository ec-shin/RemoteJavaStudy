package quiz.b_;

import java.util.Scanner;

public class B06_is_contain_alpha {

	public static void main(String[] args) {
		String user;
		char word;
		boolean alpha = true;
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ���>> ");
		user = scan.nextLine();

		// 1��
		for (int i = 0; i < user.length(); i++) {
			word = user.charAt(i);
			if (!((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z'))) {
				alpha = false;
				continue;
			} else {
				alpha = true;
				break;
			}
		}
		System.out.println(alpha);

		// 2��
		for (int i = 0; i < user.length(); i++) {
			word = user.charAt(i);
			if ((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z')) {
				alpha = true;
				continue;
			} else {
				alpha = false;
				break;
			}
		}
		System.out.println(alpha);

		// 3��
		if (user.charAt(0) >= '0' && user.charAt(0) <= '9') {
			alpha = false;
		} else {
			for (int i = 0; i < user.length(); i++) {
				word = user.charAt(i);
				if ((word >= 'a' && word <= 'z') || word == '_' || word == '$' || (word >= '0' && word <= '9')) {
					alpha = true;
				} else {
					alpha = false;
					break;
				}
			}
		}
		System.out.println(alpha);
	}

}
