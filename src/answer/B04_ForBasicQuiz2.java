package answer;

import java.util.Scanner;

public class B04_ForBasicQuiz2 {

	public static void main(String[] args) {
		
		int user;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է����ּ���>> ");
		user = scan.nextInt();
		
		int start, end;
		
		if(user>10) {
			start = 10;
			end = user;
		}else {
			start = user;
			end = 10;
		}
		
		for(int i = start; i <= user; i++ ) {
			sum += i;
		}
		
		System.out.printf("10���� %d������ ������ %d�Դϴ�.",user, sum);
		
		if(user > 1000) {
			for(int i=1000; i<= user; i++) {
				System.out.printf("1000 ���� %d���� ���:%d\n",user,i);
			}
		}else {
			for(int i=1000; i>= user; i--) {
				System.out.printf("1000 ���� %d���� ���:%d\n",user,i);
			}
		}
		
		if(user > 1) {
			for(int i = 1; i <= user; i++) {
				if(i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n",user,i);
				}
			}
		}else {
			for(int i = 1; i >= user; i--) {
				if(i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n",user,i);
				}
			}
		}
		
	}

}










