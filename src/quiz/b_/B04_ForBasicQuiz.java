package quiz.b_;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	public static void main(String[] args) {
		
		int num, q1=10, q2=1000;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է����ּ���>> ");
		num = scan.nextInt();
		
		if(num>=q1) {
			for(int i = q1; i <= num;i++) {
				sum += i;		
			}
		}else {
			for(int i = num; i <= q1;i++) {
				sum += i;		
			}
		}		
		System.out.printf("�Է��� ���ڱ����� ���� %d�Դϴ�.\n",sum);
		
		
		
		if(num>=q2) {
			for(int i = q2; i <= num;i++) {
				System.out.println("i�� ����:"+i);	
			}
		}else {
			for(int i = num; i <= q2;i++) {
				System.out.println("i�� ����:"+i);			
			}
		}
		
		
		if(num<1) {
			System.out.println("����� ���� �����Դϴ�");
		}
		for(int i = 1; i <= num;i++) {
			if(i%5==0) {
				System.out.printf("5�ǹ�� %d �Դϴ� \n",i);
			}
		}
		
	}

}
