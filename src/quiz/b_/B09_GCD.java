package quiz.b_;

import java.util.Scanner;

public class B09_GCD {

	public static void main(String[] args) {
		//�ִ����� 
		
		int num1, num2, max; 
		int gcd=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� 2���� �Է��ϼ���>> ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 >= num2) {
			max = num1;
		}else {
			max = num2;
		}
		//int max = Math.max(num1, num2); �ִ밪���ϴ� �Լ�
		//int min = Math.min(num1, num2); �ּҰ����ϴ� �Լ�
		
		for(int i=1; i<=max; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�",num1,num2,gcd);
	}

}
