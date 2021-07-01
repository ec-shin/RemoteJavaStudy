package study.c_;

public class C05_Inherit {

	public static void main(String[] args) {
		/*
			Ŭ���� ���
				- ������ �̸� ����� �״� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
				- �������� �Ŀ��� �ش� Ŭ������ ������� ���ļ� ����� �� �ִ�.
				- ������ �����ϸ鼭 ���Ӱ� �����غ� �� �ִ� ���� �����̴�
				- ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ����Ŭ����
				- ����ϴ� Ŭ������ �θ� Ŭ���� �Ǵ� ����Ŭ����
			
			����� ��Ģ
				- extends��� Ű������ ���
				- �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
				- �θ� Ŭ������ �ڽ�Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ��쿡�� super�� this�� ������ �� �ִ�
				- super()�� �θ��� ������
				- this()�� �ڽ��� ������
		 */
		
		Person gildong = new Person("��浿",42);
		gildong.sayHi();
		
		Programmer chulsoo = new  Programmer("��ö��",28);
		chulsoo.sayHi();
		chulsoo.program("����");
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("�ȳ� ���̸��� " +name+"�̾�. ���̴� "+age+"�� �̾�.");
	}
}

class Programmer extends Person{

	Programmer(String name, int age) {
		super(name, age);
		
	}
	
	void program(String to_program) {
		System.out.println(name+"���� �̹����� "+to_program+"�� ����� �����߽��ϴ�.");
	}
	
	//override : �ڽ� Ŭ������ �θ�Ŭ������ �޼��带 �����ؼ� ��� ����
	void sayHi() {
		System.out.println("Hello world!");
	}
}
 
class Tree{
	Tree(){
		
	}
		
	Tree(int a){
		
	}
}

class OrangeTree extends Tree{
	OrangeTree(){
		//super(); // �θ�Ŭ������ �⺻�����ڰ� �ִ� ���� super()�� ������ �� �ִ� �⺻�����ڰ� �ƴѰ��� �ڽĿ��� ȣ�� �ؾ���
	}
}














