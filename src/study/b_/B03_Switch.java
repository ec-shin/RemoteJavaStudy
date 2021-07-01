package study.b_;

public class B03_Switch {

	public static void main(String[] args) {
		/*
			switch - case
				- ()���� ���� ����� ���� ������ �ڵ带 ����
				- ()boolean Ÿ���� �� �� ����
				- if������ �Ϻ��ϰ� ��ü ����
				- default�� if���� else����
				- break�� �� ���� break�� ���� ������ �������鼭 ��� case�� ����
		 */
		
		int a = 10;
		
		switch(a % 2){
		case 1:
			System.out.println("case1 ����");
			System.out.println("a�� Ȧ��");
			break;
		case 0:
			System.out.println("case0 ����");
			System.out.println("a�� ¦��");
			break;
		default:
			System.out.println("default ����");
			System.out.println("�ش��ϴ� case�� �����ϴ�");
			break;
		}
		char cmd = 'q';
		
		switch (cmd) {
		case 'w':
			System.out.println("move forward");
		case 's':
			System.out.println("move backward");
		case 'a':
			System.out.println("move left");
			break;
		case 'd':
			System.out.println("move right");
			break;
		case 'p':
			System.out.println("move pause");
			break;
		case 'q':
			System.out.println("move quit");
			break;
		default:
			System.out.println("�ش��ϴ� case�� �����ϴ�");
			break;
		}
		
	}

}








