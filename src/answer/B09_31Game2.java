package answer;

import java.util.Scanner;

public class B09_31Game2 {

	public static void main(String[] args) {
		int user, com, turn;
		int num=0;
		Scanner scan = new Scanner(System.in);
		
		turn = (int) (Math.random() * 2 + 1);
		
		if(turn == 0) {
			System.out.println("��ǻ�� ����");
		}else {
			System.out.println("����� ����");
		}
		
		while(num < 31) {
			
			if(turn == 0) {
				com = (int)(Math.random() * 3 + 1);
				num += com;
				System.out.printf("��ǻ�Ͱ� %d�� ������ϴ�. [���� ����:%d]\n",com,num);
			}else {
				user=0;
				while(user < 1 || user> 3 ) {
					System.out.println("1, 2, 3?");
					user = scan.nextInt();
				}
				num += user;
				
				System.out.printf("[���� ����:%d]\n",num);
			}
			turn = (turn  +1 ) % 2;
		}
		
		//System.out.printf("���� ����! %s�� �¸�\n", turn == 0 ? "��ǻ��":"�÷��̾�" ); �ؿ��� ���� ����
		
		if (turn == 0) {
			System.out.println("���� ����! ��ǻ���� �¸�!");
		}else {
			System.out.println("���� ����! �÷��̾��� �¸�!");
		}
	}

}



