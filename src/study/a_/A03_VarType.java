package study.a_;

public class A03_VarType {
	public static void main(String args[]) {
		/*
	 	����Ÿ��
	 		- byte	(1byte) -128 ~ +127
	 			1byte => 8bit
	 			��� 0000 0000(0) ~ 0111 1111(127)
	 			���� 1000 0000(-128) ~ 1111 1111(-1)
	 			
	 		- short	(2byte) -32768 ~ 32767
	 			
	 		
	 		- char	(2byte unsigned) 0 ~ 65535 (��ȣ�� ���� ����) ���� �ڵ� �����
	 		- int	(4byte) 2,147,483,648 ~ 2,147,483,647
	 		- long	(8byte) 9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807	 	
		 */
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000;
		
		//����Ÿ���� ���ͷ��� �⺻������ int
		//int ���� ����� ���� ����ϰ� �ʹٸ� �ڿ� l L�� �ٿ�����
		long _long = 200000000000000L;
		
		/*
		 �Ǽ�Ÿ��
		 	- float		(4byte)
		 	- double	(8byte)
		 	
		 	�Ǽ��� �ַ� �׷��� ���
		 	�ε� �Ҽ��� ����� ���
		 */
		// �Ҽ� ���ͷ��� �⺻������ double
		double _double = 123.1234;
		//�Ҽ� �ڿ� F f �� �����ָ� floatŸ�� ���ͷ��� ǥ��
		float _float = 123.123F;
		
		/*
		 �� ���� Ÿ��
		 	-boolean
		 	�� �� �ִ� ���� tru2/false �ۿ� ����
		 */
		boolean male = true;
		boolean female = true;
		
		/*
		 ������ Ÿ��
		 	������ Ÿ���� �빮�ڷ� ����
		 	�ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ��
		 	
		 	- String : ���ڿ��� ����
		 	- �׿� ��� Ŭ������
		 */
		String message = "hello world!";
		System.out.println(message);
		
		// char Ÿ���� ���� �ڵ带 �����ϴ� ���� Ÿ��
		char ch = 97;
		char ch2 = 'a';
		
		int num1 = 'x';
		System.out.println("ch�� : "+ch);
		System.out.println("ch2�� : "+ch2);
		System.out.println("num1 : "+num1);
	}
}









