package study.a_;

import java.util.Scanner;

public class A08_Scanner {
	public static void main(String args[]) {
		/*
		 	Scanner Ŭ����
		 		- ���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� �ִ� Ŭ����
		 		- ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
				- System.in ���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� �����Ѵ�
		 		- �� �� Scanner Ÿ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
		 */

		Scanner sc = new Scanner(System.in);
		
		//������
		System.out.print("������ �Է��غ�����>");
		int num = sc.nextInt();		
		System.out.println("�Է��� ���� "+num+"�Դϴ�");
		
		//�Ǽ���
		System.out.print("�Ǽ��� �Է��ϼ���>");
		double d =sc.nextDouble();
		System.out.printf("�Է��� �Ҽ��� %.5f�Դϴ�.",d);	
		
		//���ڿ�(next()�� ������ �������� �Է¹ް�, nextLine()�� \n�� �������� �Է�)
		System.out.print("���ڿ��� �Է��ϼ���>> ");
		String str = sc.next();
		System.out.println("��� : "+str);
		
		System.out.print("���ڿ��� �Է��ϼ���>> ");
		String str2 = sc.nextLine();
		System.out.println("��� : "+str2);
	}
}










