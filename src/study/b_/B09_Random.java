package study.b_;

public class B09_Random {

	public static void main(String[] args) {
		/*
			������ ����
				- Math.Random();
					0 <= x < 1 double Ÿ�� ���� �Ҽ�
					
					1. ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ� (10-100)
					2. ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
					3. �Ҽ��� ���� (int)
				- Random Ŭ���� ���

		System.out.println(Math.random());
		for(int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 91 + 10));
		}
		 */		
		
		//��������
		for(int i = 0; i < 7; i++) {
			System.out.println((int) (Math.random() * 45 + 1));
		}
	}

}
