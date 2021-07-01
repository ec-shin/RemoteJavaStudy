package study.c_;

public class C07_Abstract {

	public static void main(String[] args) {
		/*
		 * �߻� Ŭ���� - ���¸� ����� ���� �ϼ��� �ڽ�Ŭ���� - ���ο� �߻� �޼��带 �����ϰ� �ִ� Ŭ����
		 * 
		 * �߻� �޼��� - ������ ���� �޼��� - abstract�� ���� �޼���� ���� ������ �� ���� �󺹹��� Ŭ�������� �����ؾ� �Ѵ�
		 */
		
		Poketmon p = new Pikachu();		
		p.skill1();
		p.skill2();
		
		testPoketmon(new Pikachu());
		testPoketmon(new LongStone());
	}
	
	//Poketmon Ŭ������ ��ӹ��� ��� �ν��Ͻ��� �Ű������� ���� �� �ִ� �޼���
	public static void testPoketmon(Poketmon p) {
		p.skill1();
		p.skill2();
	}
/*	�̷������� �߰��ϸ� ���ϸ� �Ѹ������� �޼��尡 �߰��Ǿ� ��ȿ���� ���� ���ó�� �θ�Ŭ������ ����ϴ� ���� ȿ����
	public static void testPoketmon(Pikachu p) {
		p.skill1();
		p.skill2();
	}
	
	public static void testPoketmon(LongStone stone) {
		stone.skill1();
		stone.skill2();
	}
*/
}

abstract class Poketmon {

	abstract void skill1();

	abstract void skill2();


}

class Pikachu extends Poketmon{

	@Override
	void skill1() {
		System.out.println("�����ġ��");
	}

	@Override
	void skill2() {
		System.out.println("�鸸��Ʈ");
	}
	
}

class LongStone extends Poketmon{

	@Override
	void skill1() {
		System.out.println("���ı�");
	}

	@Override
	void skill2() {
		System.out.println("��ġ��");
	}
	
}












