package quiz.b_;

import java.util.Scanner;

public class B01_ScoreToGrade {

	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���>> ");
		score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("�ǹٸ� ���� �Է°��� �ƴմϴ�.");
		}else if(score >=90) {
			System.out.println("����� A��� �Դϴ�");
		}else if(score >=80) {
			System.out.println("����� B��� �Դϴ�");
		}else if(score >=70) {
			System.out.println("����� C��� �Դϴ�");
		}else if(score >=60) {
			System.out.println("����� D��� �Դϴ�");
		}else {
			System.out.println("����� F��� �Դϴ�");
		}
		
	}
}
