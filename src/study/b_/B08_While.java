package study.b_;

public class B08_While {

	public static void main(String[] args) {
		
		/*
			while
				- for���� ������ �ణ �ٸ� �ݺ���
				- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�.
				- ()���� ������ ���� ����  {}���� ������ �ݺ��Ѵ�
		 		- �������� ��ġ�� ���� ���α׷� ������ �޶��� �� �����Ƿ� ���� 
		 */
		int i = 0;
		
		while(i < 10) {
			++i;
			System.out.println(i);
		}
		
		i = 0;
		
		while(++i < 10) {
			System.out.println(i);
		}
		
		while(true) {
			System.out.println(++i);
			
			if(i == 140) {
				break;
			}
		}
	}

}






