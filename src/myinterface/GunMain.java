package myinterface;

public class GunMain {

	public static void main(String[] args) {
		test(new Rifle(), 5);

	}

	public static void test(Gun gun, int max) {

		gun.fullLoad();
		while (true) {
			for (int i = 1; i <= max; i++) {
				System.out.printf("1�� �߻��߽��ϴ�.");
				System.out.println("��" + gun.shot() + "�� ���ҽ��ϴ�");
			}

			for (int i = 1; i <= max; i++) {
				System.out.printf("1�� �����߽��ϴ�.");
				System.out.println("��" + gun.load() + "�� ���� �߽��ϴ�");
			}

			if (gun.broken()) {
				System.out.println("�������� ������ ������ �� �����ϴ�.");
				System.out.println("���ο� ��� ������ �ּ���");
				break;
			}
		}
	}

}
