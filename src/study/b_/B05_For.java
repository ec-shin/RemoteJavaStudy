package study.b_;

public class B05_For {

	public static void main(String[] args) {
		
		/*
			for(�ʱⰪ; �ݺ�����; ������){
				����� �ִ� �ݺ������� true�� ���� �ݺ��� ��ɾ���� ���� ��
			}
		 */
		/*
			���� �⺻���� ������ for��
				- �ʱⰪ���� 0���ְ� ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�
				- ������ 1�� �Ѵ�
				- ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		 */
		for(int i = 5; i <= 22; ++i) {
			System.out.println("Hello World! "+i);
		}
		
		/*
			�ʱⰪ ������ ������ ������� ������ �� �ִ�			
		 */
		for (int i = 100; i > 0; --i) {
			System.out.println("Hello World! "+i);
		}
		
		/*
			�ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�
		 */
		int a = 123;
		for(; a<234;) {
			a += 5;
			System.out.println("Hello! "+a);
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		for (int month = 1; month <= 12; ++month) {
			String season;
			
			
		}
	}

}




