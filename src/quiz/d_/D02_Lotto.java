package quiz.d_;

import java.util.ArrayList;
import java.util.Random;

public class D02_Lotto {
	static boolean win = false;
	static int count=0;
	static double useMoney = 0;
	private int specialNum;

	Random random;
	
	ArrayList<Integer> lotto = new ArrayList<>();
	ArrayList<Integer> user = new ArrayList<>();
	ArrayList<Integer> matchNum = new ArrayList<>();

	void winNumChoice() {
		for (int i = 0; i < 6; i++) {
			int num;
			while (true) {
				num = (int) (Math.random() * 45 + 1);
				if (!lotto.contains(num)) {
					lotto.add(num);
					break;
				}
			}
		}
		while (true) {
			int num;
			num = (int) (Math.random() * 45 + 1);
			if (!lotto.contains(num)) {
				specialNum = num;
				break;
			}
		}
	}

	void userChoice() {
		count++;
		useMoney += 1000;
		for (int i = 0; i < 6; i++) {
			int num;
			while (true) {
				num = (int) (Math.random() * 45 + 1);
				if (!user.contains(num)) {
					user.add(num);
					break;
				}
			}
			if (lotto.contains(user.get(i))) {
				matchNum.add(user.get(i));
			}
		}
	}

	void clear() {
		user.clear();
		matchNum.clear();
	}

	void winCheck() {
		if (matchNum.size() == 6) {
			System.out.println("�����մϴ� 1� ��÷�Ǽ̽��ϴ�!");
			System.out.println("������ȣ: " + matchNum);
			System.out.println("�ζǹ�ȣ: " + lotto);
			System.out.println("���ù�ȣ: " + user);
			System.out.printf("�� �õ� Ƚ���� %d���̰� ����Ͻ� �ݾ��� %.0f�� �Դϴ�.",count,useMoney);
			win = true;
		} else if (matchNum.size() == 5) {
			if (user.contains(specialNum)) {
				matchNum.add(specialNum);
				System.out.println("�����մϴ� 2� ��÷�Ǽ̽��ϴ�!!");
				System.out.println("��÷��ȣ: " + matchNum + " ����ȹ�ȣ: " + specialNum);
				System.out.println("�ζǹ�ȣ: " + lotto);
				System.out.println("���ù�ȣ: " + user);
				System.out.printf("�� �õ� Ƚ���� %d���̰� ����Ͻ� �ݾ��� %.0f�� �Դϴ�.",count,useMoney);
				win = true;
			}
		}
	}
}
