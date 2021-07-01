package study.c_;

public class C14_AnonymousInnerClass {
	/*
		�͸� ���� Ŭ����
			- Ŭ������ �������ڸ��� �̸��� ���� �ʰ� �ٷ� ����� ���� ������ ���
	 */
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// �͸� ���� Ŭ������ �Ｎ���� �ش� Ŭ������ ����� �����Ѵ�
		// ������ �ڿ� {}�� ��� �Ｎ���� Ŭ������ �����ؼ� ����ϴ� ����� �͸� ���� Ŭ������� �Ѵ�.
		Dragon dragon01 = new Dragon() {
			void attack() { //��ĳ�����̰� ���� ������ �ִ� �޼��带 ��ӹ޾Ƽ� ����ϴ� �����̱⿡ attack�� ��� ����
				System.out.println("�����巡���� ������ �վ �����մϴ�.");
			}
		};
		
		fight(dragon01);
		fight(new SkeletonWarrior(){
			void attack() {
				System.out.println("���̷��� ���к��� ���и� �о �����մϴ�.");
			}
		});
		
		//�ν��Ͻ�ȭ �� �� ���� �߻� Ŭ������ �Ｚ���� ��ӹ޾� ������ �� �ִ�.
		Monster monster01 = new Monster() {
			void attack() {
				System.out.println("���� ��ġ��!");
			}
		};	
		fight(monster01);
	}
	
	private static void fight(Monster monster) {
		monster.attack();
	}
}


abstract class Monster{
	abstract void attack();
}

class Dragon extends Monster{
	@Override
	void attack() {
		System.out.println("�巡���� ���� �վ �����մϴ�.");
		
	}
}

class SkeletonWarrior extends Monster{
	@Override
	void attack() {
		System.out.println("�ذ������ Į�� �ֵѷ��� �����մϴ�.");
		
	}
}