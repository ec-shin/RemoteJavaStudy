package myobj.item;

public class Paints extends Item {
	public Paints(String name, int price) {
		super(name, price);
	}

	public void use() {
		System.out.printf("%s�� �׸��� ��ĥ�߽��ϴ�. \n", name);
	}
}