package quiz.b_;

import java.util.Scanner;

public class B07_Prime {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);	
		for(;;) {
			System.out.print("���� �ϳ��� �Է��ϼ���>> ");
			num = scan.nextInt();
			if(num<=0) {
				System.out.println("����� �ƴմϴ� �ٽ� �Է����ּ���");
			}else {
				break;
			}
		}
		for(int i=1; i<=num; i++) {
			if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) {
				System.out.printf("�Ҽ�: %d�Դϴ�\n",i);
			}
		}
	}
}
