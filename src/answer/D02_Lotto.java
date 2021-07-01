package answer;

import java.util.*;

public class D02_Lotto {
	// quiz��Ű���� D02_Lotto�� ������� Ǯ���� ����

	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 3;

	private int bonus = 0;

	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();

		while (lotto.size() != len) {
			int ranNum = (int) (Math.random() * LOTTO_SIZE + 1);
			// System.out.println("Set�� " + ranNum + "�� �������ϴ�.");
			lotto.add(ranNum);

			if (lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}

		return lotto;
	}

	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();

		Set<Integer> win = quiz.generate(7);

		System.out.println("��÷��ȣ�� " + win + "�Դϴ�. �� �� ���ʽ� ��ȣ�� " + quiz.bonus + "�Դϴ�.");

		List<Integer> checkList = new ArrayList<>(7);
		long spent = 0;
		long count = 0;

		while (true) {
			Set<Integer> blackCow = quiz.generate(6);
			count++;

			checkList.addAll(win);
			checkList.removeAll(blackCow);

			if (checkList.size() == 1) {
				spent = count * 1000;
				if (checkList.get(0) == quiz.bonus) {
					System.out.println("1�� ��÷�Դϴ�. ���� ���� " + spent + "�� �Դϴ�.");
				} else {
					System.out.println("2�� ��÷�Դϴ�. ���� ���� " + spent + "�� �Դϴ�.");
				}
				break;
			}
			checkList.clear();
		}
	}
}
