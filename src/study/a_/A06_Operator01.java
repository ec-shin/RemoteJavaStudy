package study.a_;

public class A06_Operator01 {

	public static void main(String[] args) {
		/*
		 	������
		 		- ����� �� ���
		 		- +,-,*,/...
		 */
		//��� ������
		int a = 10, b = 7;
		double c = 7.0;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//���� ������ ������ ����� �� ����
		//��Ȯ�� ������ ����� ���ϸ� �����⿡ �Ǽ� Ÿ���� ���ԵǾ� �־����
		System.out.println("a / b:"+a/b);
		System.out.println("a / c:"+a/c);
		System.out.println("a / b:"+a/(double)b);
		
		System.out.println("a / b:"+a/b);
		
		//������ ����
		System.out.println("a % b = "+a%b);
		System.out.println("b % a = "+b%a);
		
		//^�� ������ �ƴ�
		System.out.println(10^2);
		System.out.println(10^3);
		System.out.println(10^4);
		
		//Math.pow(a, b) : a�� b������ ����Ͽ� ��ȯ���ִ� �Լ�
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(10, 4));
	}

}









