package study.a_;
import java.util.Scanner;

public class A09_Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ctrl + shift + o
		
		/*
			�� ������
				- �� ���� ���ϸ� ����
				- �� ������ ����� boolean Ÿ��
				- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ���
		 */
		int a = 10, b = 7;
		
		System.out.println(a>b);
		System.out.println(a<b);
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		/*
			�� ������
				- boolean Ÿ�� ������ �ϴ� ����
				- �񱳿���� �������� �Բ� ������ �� ������ ���� ����Ѵ�
				- && : �� ���� ���� ��� true�� ���� true
				- || : �� ���� �� �� �ϳ��� true���� true
				- ! : true�� false, false�� true
	 */
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c = 53;
		
		System.out.print("c�� ¦��");
		System.out.println(c % 2 == 0);
		
		System.out.print("c�� Ȧ��");
		System.out.println(c % 2 == 1);
		System.out.println(!(c % 2 == 0));
		System.out.println(c % 2 != 0);
		
		System.out.print("c�� ¦���̸鼭 50���� ū��?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.print("c�� ¦���̰ų� 50���� ū��?");
		System.out.println(c % 2 == 0 || c > 50);
		
		//���� x y z �� ��� 3�� ����� �ƴҶ� true
		int x = 5, y = 8, z = 11, k = 12;
		System.out.println(x % 3!=0 && y % 3!=0 && k % 3!=0);
		System.out.println(x % 3!=0 && y % 3!=0 && z % 3!=0);
	}

}







