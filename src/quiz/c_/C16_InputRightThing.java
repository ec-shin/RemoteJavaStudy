package quiz.c_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("���ڸ� �Է����ּ���.(���ڸ�!!)");
				num = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("�ٸ� ���¸� �Է��ϼ̳׿�. ������ �Է����ּ���!!!!");
				scan = new Scanner(System.in);
			}
		}
		System.out.println("���ڸ� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
	}
}
