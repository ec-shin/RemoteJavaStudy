package quiz.b_;

import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		int user, com, sequence;
		int gameNum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �÷��̾ ���ϰڽ��ϴ�(1-user, 2- com)");
		sequence = (int) (Math.random() * 2 + 1);
		
		if(sequence == 1) {
			System.out.printf("%d: user�� �����Դϴ�.\n",sequence);
			while(true) {
				System.out.print("user�� �����Դϴ�. ���ڸ� �Է����ּ���>>");
				user = scan.nextInt();
				if(user < 0 || user > 3) {
					System.out.println("������ ������ϴ�.");
					continue;
				}
				gameNum+=user;
				System.out.println("�������:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("user�� �й��Դϴ�.");
					break;
				}
				System.out.print("com�� �����Դϴ�");
				com = (int) (Math.random() * 3 + 1);
				System.out.println(com);
				gameNum+=com;
				System.out.println("�������:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("com�� �й��Դϴ�.");
					break;
				}
			}
			
		}else {
			System.out.printf("%d: com�� �����Դϴ�.\n",sequence);
			while(true) {
				System.out.print("com�� �����Դϴ�>> ");
				com = (int) (Math.random() * 3 + 1);
				System.out.println(com);
				gameNum+=com;
				System.out.println("�������:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("com�� �й��Դϴ�.");
					break;
				}
				
				System.out.print("user�� �����Դϴ�. ���ڸ� �Է����ּ���>>");
				while(true) {
					user = scan.nextInt();
					if(user < 0 || user > 3) {
						System.out.println("������ ������ϴ�");
						System.out.print("�ٽ� �Է����ּ���>> ");
						continue;
					}else {
						break;
					}
				}
				gameNum+=user;
				System.out.println("�������:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("user�� �й��Դϴ�.");
					break;
				}
			}
		}
	}

}
