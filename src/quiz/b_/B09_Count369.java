package quiz.b_;

import java.util.Scanner;

public class B09_Count369 {

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
		
		String str = ""+num;
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j)=='3' ||str.charAt(j)=='6' ||str.charAt(j)=='9') {
					count++;
				}
			}
		}
		System.out.println("count= "+count);
	}

}
