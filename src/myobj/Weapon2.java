package myobj;

public class Weapon2 {

	String name;
	int baseAttack;
	int attack;
	int grade;
	int[] upgrade_chance = { 90, 90, 80, 80, 80, 70, 70, 30, 30, 30, 15, 15, 15, 10, 10, 10, 10, 5, 5, 5 };
	int[] attack_increment = { 10, 30, 100, 150, 200, 700, 700, 700, 700, 1000, 1000, 1000, 1000, 1500, 1500, 1500,
			2500, 2500, 3000, 3500 };

	Weapon2() {
		name = "��������";
		baseAttack = 5;
		grade = 0;
	}

	Weapon2(int baseAttack, String name) {
		this.baseAttack = attack;
		this.name = name;
		grade = 0;
	}

	boolean upgrade() {
		int value = (int) (Math.random() * 100);

		if (value < upgrade_chance[grade]) {
			System.out.printf("%s %+d��ȭ�� �����ϼ̽��ϴ�", name, grade);
			grade++;
			return true;
		} else {
			System.out.println("��ȭ����...");
			return false;
		}
	}

	void attack() {
		int damage = attack;
		for(int i=0; i<grade; i++) {
			damage += attack_increment[i];
			
		}
		System.out.printf("$s %+d �� �ֵѷ����ϴ�. [������:%d]\n", name, grade, attack + attack_increment[grade]);
	}
}




















