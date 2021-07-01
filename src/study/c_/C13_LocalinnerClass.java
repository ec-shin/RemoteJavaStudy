package study.c_;

public class C13_LocalinnerClass {
	/*
		���� ���� Ŭ����
			- Ŭ������ ��� �޼��� ���ο��� ������ �� �ִ�
			- �޼��尡 ������ �ش� Ŭ������ ������ ���Ѵ�
	 */
	public static void main(String[] args) {
		
		class Apple{
			
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
				return "price: " + price + "��\ncolor��: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1); 
		System.out.println(a);
		
		banana();
		Fruitt fruit = banana();
		System.out.println("�ٳ����� ����"+ fruit.check()+ "���Դϴ�.");
		
	}
	
	public static Fruitt banana() {
		class Banana extends Fruitt{
			int bana_count;
			int price;
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}	
		System.out.println(new Banana(11,3000).check()+"��");
		return new Banana(11,3000);
	}
}


abstract class Fruitt{
	abstract double check();
}












