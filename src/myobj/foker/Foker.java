package myobj.foker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Foker {
	static int playerNum;
	static int battingMoney[];
	final private int MAXBETTING = 500;
	static int gameMoney = 0;
	static boolean progress = true;

	Card card;
	Player player;
	Rule rule;

	Foker() {
		card = new Card();
		player = new Player();
		rule = new Rule();
	}

	void gameStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*******Foker Game�� �����մϴ�*******");
		Foker foker = new Foker();

		System.out.print("������ �÷����� �ο� ���� �Է��� �ּ��� (�ִ� 5��): ");
		playerNum = player.playerChoice();
		player.makePlayer(playerNum);
		rule.makeCheckList(playerNum);
		battingMoney = new int[playerNum];

		System.out.println("ī�� �й踦 �����ϰڽ��ϴ�. ó�� 4���� ī�带 �й��մϴ�.\n");
		card.giveCardAllUsers(playerNum, 4);

		for (int i = 1; i <= playerNum; i++) {
			player.printCard(i);
			System.out.printf("������ ���� ī���� ��ȣ�� ������ �ּ��� [1 - %d]: \n", (player.users.get(i - 1).size()));
			int num = scan.nextInt();
			player.deleteCard(i - 1, num - 1);
			player.printCard(i);
			System.out.printf("�����ϰ� ���� ī���� ��ȣ�� ������ �ּ��� [1 - %d]: \n", (player.users.get(i - 1).size()));
			num = scan.nextInt();
			player.hideCard(i - 1, num - 1);
		}
		player.printAllPlayer();

		System.out.println("ī�� 2���� �� �й��ϰڽ��ϴ�.");
		card.giveCardAllUsers(playerNum, 2);

		player.printAllPlayer();

		int gameCount = 0;
		while (progress) {
			for (int i = 0; i < playerNum; i++) {
				if (player.engage.get(i)) {
					System.out.print(i + 1 + "�� Player�� ������ ���� ���θ� �˷��ּ��� (����: yes / ����: no)");
					String choice = scan.next();
					if (choice.equals("yes")) {
						player.engage.set(i, false);
					} else {
						System.out.print("������ �ݾ��� �Է��� �ּ���");
						while (true) {
							int money = scan.nextInt();
							if (money > MAXBETTING) {
								System.out.println("���ѵ� �ݾ��� �Ѿ����ϴ� �ٽ� �������ּ���");
							} else {
								int curMoney = player.userMoney.get(i);
								player.userMoney.set(i, curMoney - money);
								gameMoney += money;
								break;
							}
						}
					}
				}
				System.out.println();
				if (Collections.frequency(player.engage, true) == 1) {
					int winPlayer = player.engage.indexOf(true);
					System.out.println("�����մϴ�!" + (winPlayer + 1) + "��° Player�� �¸��߽��ϴ�.");
					progress = false;
					break;
				}
			}
			if (gameCount == 2) {
				progress = false;
				break;
			}
			System.out.println("ī�� 1���� �� �й��ϰڽ��ϴ�.");
			card.giveCardAllUsers(playerNum, 1);
			gameCount++;
			if (gameCount == 2) {
				for (int i = 0; i < playerNum; i++) {
					for (int j = 0; j < player.users.get(i).size(); j++) {
						if (j == 6) {
							String hidden = (String) (player.users.get(i)).get(j);
							player.hiddenCard.get(i).add(hidden);
							player.users.get(i).set(j, "H");
						}
					}
				}
			}

			player.printAllPlayer();

			if (gameCount == 2) {

			}

		}

		for (int i = 0; i < playerNum; i++) {
			int num = 0;
			for (int j = 0; j < player.users.get(i).size(); j++) {
				if (player.users.get(i).get(j).equals("H")) {
					player.users.get(i).set(j, player.hiddenCard.get(i).get(num));
					num++;
				}
			}
		}

		for (int i = 0; i < playerNum; i++) {
			int playerSequence = player.users.get(i).size();
			for (int j = 0; j < playerSequence; j++) {
				String card = (String) player.users.get(i).get(j);
				rule.checkCardCount(i, card);
			}
			player.printCard(i + 1);
			if (new Player().engage.get(i)) {
				rule.checkCard(i);
			}
		}

		rule.winnerCheck();
		player.printPlayerMoney();

	}

	public static void main(String[] args) {
		new Foker().gameStart();
	}
}
