package jdbc.model;

//프로그램을 운영하기 위한 데이터를 보관하기 위한 클래스
public class Coffee {
	private int id;
	private String name;
	private int price;
	
	
	public Coffee(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		price = price;
	}
	
	
	public String toString() {
		return String.format("%d/%s/%d", id, name, price);
	}
}
















