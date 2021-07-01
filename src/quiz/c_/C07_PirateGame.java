package quiz.c_;

import java.util.Scanner;

public class C07_PirateGame {
	int randomNum;
	int player;
	int holeNum;
	int turnPlayer;
	static int hole[];
	
	C07_PirateGame(){
	}
	
	C07_PirateGame(int holeNum){
		hole = new int[holeNum];
		for(int i=0; i<holeNum; i++) {
			hole[i]=0;
		}
		hole[randomNumChoose(holeNum)] = 99;
	}
	
	int randomNumChoose(int holeNum) {
		int num = (int)(Math.random() * holeNum + 0);
		return num;
	}
	
	void gameStart() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ִ� ���� ������ �������ּ���.");
		holeNum = scan.nextInt();
		C07_PirateGame pg = new C07_PirateGame(holeNum);
		
		System.out.print("������ �� �÷��̾� ���� �Է��� �ּ���.");
		player = scan.nextInt();
		
		while(true) {
			if(player > holeNum || player <0) {
				System.out.print("�߸��� �ο��� �����Դϴ� �ٽ� �Է����ּ���.");
				player = scan.nextInt();
			}else {
				break;
			}
		}
		
		turnPlayer = randomNumChoose(player-1);
		System.out.println("�� �÷��̾ �����մϴ�. ���¹�ȣ�� ������ �ִ� ����� �� �÷��̾� �Դϴ�.");
		System.out.println(turnPlayer+"���� �� �÷��̾� �Դϴ�.\n");
		
		while(true) {
			if(turnPlayer >= player) {
				turnPlayer=0;
			}
			System.out.printf("%d�� �÷��̾��� �����Դϴ�.",turnPlayer);
			
			for(int i=0; i<holeNum; i++) {
				if(i%5==0) {
					System.out.println();
				}
				if(hole[i]==0 || hole[i]==99) {
					System.out.printf("[%d] = O \t",i);
				}else {
					System.out.printf("[%d] = X \t",i);
				}			
			}
			System.out.println();
			
			System.out.print("�Ʒ� ��ȣ���� Oǥ�ð� �ִ� ��ȣ�� �ϳ��� ������ �ּ���");
			int playerChoose = scan.nextInt();
			
			while(true) {
				if(playerChoose >= holeNum ||playerChoose<0) {
					System.out.print("�߸��� ��ȣ�����Դϴ� �ٽ� �Է����ּ���.");
					playerChoose = scan.nextInt();
				}else {
					break;
				}
			}
			
			if(hole[playerChoose]==99) {
				System.out.printf("%d�� �ڸ��� ���� ������ �ڸ��Դϴ�. %d�� �÷��̾��� �й�� ������ �����մϴ�.",playerChoose,turnPlayer);
				break;
			}else if(hole[playerChoose]==1) {
				System.out.println("�̹� ���õ� ��ȣ�Դϴ�.");
				continue;
			}else {
				hole[playerChoose]=1;
				System.out.println();
			}
			turnPlayer++;
		}
	}
	
}
















