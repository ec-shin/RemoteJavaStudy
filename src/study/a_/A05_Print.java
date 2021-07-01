package study.a_;

public class A05_Print {

	public static void main(String[] args) {
		
		/*
		 	�ܼ� ��� �Լ�
		 		1. print()
		 			���� �ڵ����� �ٲ����� ����
		 		
		 		2. println()
		 			���� �ڵ����� �ٲ���
		 			()�� ������ ������ �� �ڿ� \n�� �߰��Ͽ� ���
		 			()�� �ƹ��͵� �������� ������ \n�� ���
		 	
		 */
		
		int apple = 15;
		
		System.out.print("Hello");
		System.out.print("Hello");
		System.out.println();
		System.out.print("Hello\n");
		
		System.out.print("���: ");
		System.out.println(apple+"��");
		
		/*
		 	printf()
		 		������ �̿��� ���ϴ� ���¸� ���� ����� ����ϴ� �Լ�
		 		����� ���¸� �̸� ����� ���� ���� �ڸ��� ���� ������� ä���� ���
		 		���ڿ��� +�� �̾���̴� ��ĺ��� ���� ��쿡 ���
		 		���� �ڵ��� �ٲ����� ����(\n�ʿ�)
		 		
		 		���Ĺ��� ����
		 			%d : �ش� �ڸ��� ������ �������� 10������ ���
		 			%x : �ش� �ڸ��� ������ �������� 16������ ���
		 			%o : �ش� �ڸ��� ������ �������� 8������  ���
		 			%s : ���ڿ�
		 			%c : ����
		 			%f : �Ǽ�
		 */
		int year = 2021, month = 5, day = 10,
				hour = 15, minute = 50, second = 30;
		System.out.printf("%d�� %d�� %d�� \t %d:%d:%d\n",
							year, month, day, hour, minute, second);
		
		/*
		 	���Ĺ��� �ɼ�
		 		%����d, %����s
		 			- �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 �����������Ͽ� ���
		 		
		 		%-d
		 			- �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���������Ͽ� ���
		 			
		 		%0����d
		 			- �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ���
		 			
		 		%+d
		 			- ��� �տ��� ��ȣ�� �ٿ��� ���
		 		
		 		%.����f
		 			- �Ҽ��� �ڸ����� ����(�ݿø��� ����)
		 */
		System.out.printf("%20d\n", 2000);
		System.out.printf("%-10s : %d\n","price",15000);
		System.out.printf("%-10s : %d\n","income",200);
		System.out.printf("%-10s : %d\n","calorie",7000);
		System.out.printf("%-10s : %d\n","tax",685);
		
		System.out.println();
		
		System.out.printf("%-10s : %7d\n","price",15000);
		System.out.printf("%-10s : %7d\n","income",200);
		System.out.printf("%-10s : %7d\n","calorie",7000);
		System.out.printf("%-10s : %7d\n","tax",685);
		
		System.out.println();
		
		System.out.printf("%02d\n" ,1);
		System.out.printf("%02d\n" ,2);
		System.out.printf("%02d\n" ,11);
		System.out.printf("%02d\n" ,15);
		
		System.out.println("-------------------------------------");
		
		System.out.printf("%+d\n",-10);
		System.out.printf("%+d\n",10);
	
		System.out.printf("%.5f\n",123.1234567);
		System.out.printf("%.4f\n",123.1234567);
		System.out.printf("%.3f\n",123.1234567);
		System.out.printf("%.2f\n",123.1234567);
		System.out.printf("%.1f\n",123.1234567);
		System.out.printf("%.0f\n",123.1234567);
	}

}















