package quiz.a_;

import java.util.Scanner;

public class A06_CelToFahr {

	public static void main(String[] args) {
		double cel,fahr;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է����ּ��� >> ");
		cel = scan.nextDouble();
		fahr = (cel*1.8)+32;
		
		System.out.printf("ȭ�� �µ��� %.1fF �Դϴ�",fahr);
	}

}
