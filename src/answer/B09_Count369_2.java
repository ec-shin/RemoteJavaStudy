package answer;

import java.util.Scanner;

public class B09_Count369_2 {

	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹��� �� �ش���ڱ��� 369������ �ϸ� �ڼ��� �� �� �� �ľ��ϴ°� 33�̸� 2�� 333�̸� 3��
		int num, count=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ���>> ");
		while(true) {
			num = scan.nextInt();
			if(num <= 0) {
				System.out.print("�����ƴ� ���ڸ� �Է����ּ���>> ");
				continue;
			}
			break;
		}
		
		for(int i = 1; i <= num; i++) {			
			int checkNum = i;
			
			System.out.printf("[%d]\t:", checkNum);
			
			while(checkNum != 0) {
				int digit = checkNum % 10;
				
				if(digit != 0 && digit % 3 == 0) {
					System.out.println("¦");
					count++;
				}
				
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n",count);
	}

}
