package study.c_;

public class C12_InnerClass {
	/*
		Ŭ���� ���ο� Ŭ���� ����ϱ� 
		- Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ� 
		- Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ� 
		- static Ŭ������ �����ϸ� �ν��Ͻ��� ��� ����� �� �ִ�.
	 */
	public static void main(String[] args) {
		//���� �ν��Ͻ� Ŭ������ �ν��Ͻ� ����
		MintChocoLatte drink = new MintChocoLatte(true);
		MintChocoLatte drink2 = new MintChocoLatte(true);
		
		drink.new Chocolate();
		drink2.new Chocolate();
		
		// ���� ����ƽ Ŭ������ �ν��Ͻ� ����
		MintChocoLatte.Mint mint = new MintChocoLatte.Mint();
	}
}

class MintChocoLatte {
	boolean hot;

	public MintChocoLatte(boolean isHot) {
		hot = isHot;
	}
	
	//������ Ŭ������ mintchocolatte�� �ν��Ͻ��� �����ؾ� �Բ� �����Ǵ� ���赵
	//���ο��� ��Ʈ���ڶ��� �ν��Ͻ� ������ ������ �޴� Ŭ������ ������ �� �ִ�.
	class Chocolate{
		
		String msg;
		
		public Chocolate() {
			if(hot) {
				System.out.println("���ݸ��� �� ��ҽ��ϴ�.");
			}else {
				System.out.println("���ݸ��� �� ���� �ʾҽ��ϴ�.");
			}
		}
	}
	
	static class Mint {
		public Mint() {
			System.out.println("��Ʈ�� �µ��� ������ ���� �ʽ��ϴ�.");
		}
	}
}














