package myobj;

public class Barrack {

	final int MAX_QUEUE_SIZE = 5;
	
	Unit[] queue;
	int queue_index;
	
	public Barrack() {
		queue  = new Unit[MAX_QUEUE_SIZE];
	}
	
	boolean checkQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}
	void createSheep() {
		
		if(checkQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�.");
			return;  
			// void Ÿ�� �Լ��� return�� �Ҽ��ִ�.
			// ȣ���� ���� ���� ���������� �ʰ� �Լ��� �����Ѵ�.
		}
		queue[queue_index++] = new Unit("��", 5);
	}
	
	void createCow() {
		
		if(checkQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�.");
			return;  
		}
		queue[queue_index++] = new Unit("��", 7);
	}
	
}
