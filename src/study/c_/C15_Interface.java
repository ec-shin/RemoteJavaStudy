package study.c_;

public class C15_Interface {
	/*
		�������̽�
			- abstract class�� ����� ������ ���� �� ���ٴ� ���� �����Ѱ�
			- �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�
			- �������̽� ������ ������ �ڵ����� final static�� �ȴ�
	 */
	public static void main(String[] args) {
		kick(new AppleTree());
		kick(new Ball());
		kick(new CanKick() {
			public void kick() {
				System.out.println("�빮�� �߷� á���ϴ�.");
			}
		});
		
		click(new AppleTree());
		//click(new Ball()); CanClick�� implements���� �ʾƼ�
	}
	public static void kick(CanKick to_kick) {
		to_kick.kick();
	}
	
	public static void click(CanClick to_click) {
		to_click.click();
	}
}
//�������̽����� �� �����⸸ ����� ���´�
interface CanKick{
	public abstract void kick();
}

interface CanClick{
	public abstract void click();
}

//�� �����⿡ �Ұ��� �������̽��� ��� ������ Ŭ������� ���� ����Ѵ�
class AppleTree implements CanKick, CanClick{
	public void kick() {
		System.out.println("��������� �߷� á���� ���������� ����� ���������ϴ�.");
	}
	public void click() {
		System.out.println("��������� Ŭ���ؼ� ����� ��Ȯ�߽��ϴ�.");
	}
}

class Ball implements CanKick{
	public void kick() {
		System.out.println("���� �߷� á���ϴ�.");
	}
	//public void click() {
	//	System.out.println("���� Ŭ���߽��ϴ�.");
	//}
}





