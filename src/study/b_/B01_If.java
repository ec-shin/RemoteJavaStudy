package study.b_;

public class B01_If {

	public static void main(String[] args) {
		/*
			if��
				- ()���� ���� true�� �� {}���� ������ ����
				- ()���� ���� false�� �� {}���� ������ ����
				- {}�ȿ��� ������ ������ �� �� ���̶�� {]�� ������ �� ����
		 	
		 	else if��
		 		- ���� �ִ� if���� ������� �ʾҴٸ� �ؿ��� if��ó�� ����
		 		- else if�� �ܵ����� ��� �Ұ�
		 		- else if�� ������ ��� ����
		 	
		 	else��
		 		- ���� �մ� ��� if���� else if���� ��� ���� ���� �ʾҴٸ� {}���� ������ ������ ����
		 		- if�� �ٷ� ������ ����� ���� �ִ�
		 	
		 */
		
		char ch='*';
		
		if(ch >='��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ�");
		} else if(ch >= 'a' && ch <='z') {
			System.out.println("ch�� ��� �ִ� ���� �ҹ��� �Դϴ�");
		} else if(ch >= 'A' && ch <='Z') {
			System.out.println("ch�� ��� �ִ� ���� �빮�� �Դϴ�");
		} else {
			System.out.println("ch�� ����ִ� ���ڴ� ���ĺ��� �ƴϰ� �ѱ۵� �ƴմϴ�!");
		}
		
		System.out.println("���α׷� ��");
	}
}
