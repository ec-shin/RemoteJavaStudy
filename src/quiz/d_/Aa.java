package quiz.d_;

public class Aa {
	public static void main(String[] args) {
		String number = "960520-1��99611";
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			if ((i == 0 || i == 1) && !Character.isDigit(ch)) {
				System.out.println("�Ǿ� ���ڸ��� ���ڰ� �ƴմϴ�.");
				break;
			} else if (i > 6 && !Character.isDigit(ch)) {
				System.out.println("���� 7�ڸ��� ���� ���ڿ����մϴ�.");
				break;
			}else {
				System.out.println("gg");
			}
		}
	}
}
