package study.c_;

public class C09_Area {

	/*
	 * ������ �����ֱ� - ������ �ش� ������ ������ {}�� ����� �״´� - ��Ȯ�ϰ� ��Ī���� ������ �⺻������ ���� ����� ��ġ�� ������
	 * ����Ѵ�
	 */

	// �ν��Ͻ� ���� (instance variable)

	int a = 15;

	void methodA() {
		int a = 10;
		System.out.println(a);
	}

	void methodB() {
		System.out.println(a);
	}

	class Area2 {
		public Area2() {
			System.out.println(a);
		}

		class Area3 {
			public Area3() {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		new C09_Area().new Area2();
	}
}
