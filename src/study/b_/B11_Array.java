package study.b_;

public class B11_Array {

	public static void main(String[] args) {
		/*
			�迭
				- �����ʹ� �ٸ��� ������ ���ÿ� �ʱ�ȭ �Ǿ�����
				  (����: 0 �Ǽ�: 0.0 boolean: false ������: null)
				- ũ�Ⱑ �������� ũ�⸦ ������ �� ����
				- ���ȣ�� 0���� ����-1����
		 */
		
		int randomNum[] = new int[100];

		System.out.println("�迭����:"+ randomNum.length);
		System.out.println("������ �ε�����ȣ:"+(randomNum.length -1));
		
		/*
			���� ���� ���
			
				1. Ÿ��[] ������ = new Ÿ��[ũ��];
				2. Ÿ��[] ������ = {��1, ��2, ��3};
				3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3};
		 */
		int[] numbers = new int[10];
		char[] blackList = {'#','@','&','^','\\',65,111};
		
		//�迭�� �ݺ����� ���⿡ ����ȭ �Ǿ�����
		for(int i = 0; i < blackList.length; i++) {
			System.out.println(blackList[i]);
		}
		
		//String�� char[]�� ��ȯ�� �� �ִ�
		char[] hello = "Hello World!".toCharArray();
		for(int i=0; i<hello.length; i++) {
			System.out.println(hello[i]);
		}
	}

}









