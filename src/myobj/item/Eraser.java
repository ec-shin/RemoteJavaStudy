package myobj.item;

public class Eraser extends Item {
	public Eraser(String name, int price) {
		super(name, price);
	}

	public void use() {
		System.out.printf("%s�� �׸��� �������ϴ�. \n", name);
	}
}