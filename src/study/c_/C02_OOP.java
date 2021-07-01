package study.c_;

public class C02_OOP {
	/*
	 	# ��ü���� ���α׷�(OOP : Object Oriented Programming)
	 	
	 		- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 		- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
	 		  ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���.
	 		- ��ü (Object) :���� �����ϴ� ��� �� (�繰, ����, .. ���)
	 		
	 		ex : ���
	 			- ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ���... 
	 			- ����� �Լ� : 
	 				�Դ´�. (ũ�Ⱑ �پ��鼭 Į�θ���ŭ �Դ� ����� Į�θ� ����)
	 				���� ���Ѵ�.
	 				��������� �پ���.
	 				������. (ũ�⸸ŭ�� �������� ������.)
	 				����� �����Ѵ�. (��������� ������ �����Ѵ�.)
	 		
	 		* Ŭ������ �����ִ� �Լ����� �޼����� �θ���. (JAVA���� �޼���ۿ� ����.)
	 		
	 	# Ŭ���� (Class)
	 	
	 		- ��ü�� ���α׷��� ���� ǥ���� ��
	 		- Ŭ������ �ش� ��ü�� ���赵��. (������ ���������� ��ü�� ����.)
	 		- ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���.
	 		- Ŭ������ ������ ���� Ÿ���̴�.
	 		
	 */
	
	// main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�.
	// (���� �̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�.
	public static void main(String[] args) {
		
		// new�� ���� �ν��Ͻ� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size = 15;
		a1.color = "������";
		
		a2.size = 13;
		a2.color = "�����";
		
		a3.size = 25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("�Ա��� a3�� ũ�� : " + a3.size);
		System.out.println("�Ա��� a3�� Į�θ� : " + a3.calorie);
		
		a3.eat();
		
		System.out.println("���� �� a3�� ũ�� : " + a3.size);
		System.out.println("���� �� a3�� Į�θ� : " + a3.calorie);
		
		System.out.println("****��������****");
		Payback p1 = new Payback();
		
		p1.name = "���ѳ�";
		p1.pay = 10000000;
		p1.tax = 3.5;
		p1.lateCount = 3;
		p1.money();
		p1.late();
		
		System.out.println("����� �̸��� " + p1.name);
		System.out.println("����� ������ " + p1.salary + "�� �Դϴ�.");
		System.out.println("����� �������� ���� ���� ������ " + p1.lateFine + "�� �Դϴ�.");
		
		Window window1 = new Window();
		window1.open();
		window1.lock();
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("������ ���� ���ڿ��� ��� : " + status);
	}
}

class Apple{
	/*
	 	# �ν��Ͻ� ����
	 	
	 		- �ν��Ͻ� ���� ������ ������ ������ �ִ� ������
	 		- aka. �ʵ�, �Ӽ�, ��� ����, ���, ���� ...
	*/
	int size;
	double sweet;
	String color;
	int calorie;
	/*
	 	# �ν��Ͻ� �޼���
	 	
	 		- �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 		
	 */
	void eat() {
		size --;
		calorie -=10;
	}
}

/*
 	�������� : ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
 	
 	�� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
 	
 */
class Payback{
	String name;
	int pay;
	double tax;
	int salary;
	int lateCount;
	int lateFine;
	
	void money() {
		salary = (int)(pay * tax);
	}
	
	void late() {
		lateFine = (10000 * lateCount);
		salary -= lateFine; 
	}
	
}

class Window{
	
	boolean open;
	boolean lock;
	double width;
	double height;
	
	void open()	{
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() {
		lock = true;
	}
	void unlock() {
		lock = false;
	}
	void status() {
		System.out.printf("�� â���� %s. [%s]\n",
				open ? "�����ֽ��ϴ�." : "�����ֽ��ϴ�..",
				lock ? "����ֽ��ϴ�." : "������������Դϴ�.");
	}
	
	String getStatus() {
		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�.
		
		return String.format("�� â���� %s. [%s]\n",
				open ? "�����ֽ��ϴ�." : "�����ֽ��ϴ�.",
				lock ? "����ֽ��ϴ�." : "������������Դϴ�.");
	}
	
	
}
