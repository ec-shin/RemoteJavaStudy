package quiz.b_;

import java.util.Scanner;

public class B01_AppleQuiz {

	public static void main(String[] args) {
		int BASKET = 10;
		int appleCount, basketCount;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����ϰ� ���� ����� ������ �Է��ϼ���>> ");
		appleCount = scan.nextInt();
		basketCount = appleCount/BASKET;
		
		if(appleCount/BASKET==0) {
			System.out.println("�ʿ��� �ٱ����� ������ 1�� �Դϴ�");
		} else if(appleCount % BASKET == 0){
			System.out.println("�ʿ��� �ٱ����� ������ "+basketCount+"�� �Դϴ�");
		} else if(appleCount % BASKET != 0) {
			System.out.println("�ʿ��� �ٱ����� ������ "+(basketCount+1)+"�� �Դϴ�");
		}
	}

}
