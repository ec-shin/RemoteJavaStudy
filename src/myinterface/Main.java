package myinterface;

public class Main {

	public static void main(String[] args) {
		test(new SchoolBus());

	}
	
	public static void test(Vehicle vehicle) {
		
		for(int i=0; i<100; i++) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("����ӵ��� "+ vehicle.acceleration()+ "km/h �Դϴ�");
		}

		System.out.println("�ӵ��� �����մϴ�");
		for(int i=0; i<30; i++) {
			System.out.println("����ӵ��� "+ vehicle.deceleration()+ "km/h �Դϴ�");
		}
		
		for(int i=0; i<16; i++) {
			if(!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�");
			}else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
}