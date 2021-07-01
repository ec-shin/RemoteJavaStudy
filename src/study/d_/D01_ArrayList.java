package study.d_;
import java.util.ArrayList;

public class D01_ArrayList {
	/*
		Java Collections
			- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
			- Collection �������̽��� ������ Ŭ������ List, Set ���� �ִ�
		
		java.util.ArrayList
			- �迭�� ���������� ũ�Ⱑ �ڵ������� �����Ǵ� �ڷᱸ�� �������̽�
			- �迭ó�� �����͸� ���������� �����Ѵ�
			- ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	 */
	public static void main(String[] args) {
		/*
			# Ÿ���� �����ϸ� ArrayList �����ϱ�
				- Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
				- �ش� Ŭ���� ������ ���� �������� ���� Ÿ���� �����ϴ� ����
				- ���׸����� �⺻�� Ÿ���� ����� �� ����
		 */
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		
		//add �ڿ��� ���� �߰�
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("banana");
		
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		chars.add('E');
		
		//add(index, item): ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		numbers.add(0,1);
		numbers.add(0,2);
		numbers.add(0,3);
		numbers.add(0,4);
		numbers.add(0,5);
		
		numbers2.add(0,5);
		numbers2.add(0,6);
		numbers2.add(0,7);
		numbers2.add(0,8);
		numbers2.add(0,9);
		
		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(chars);
		
		numbers.addAll(numbers2);
		
		System.out.println(numbers);
		
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(2));
		System.out.println("���� ���� ����:"+fruits.size());
		
		System.out.println(fruits.remove(0));
		
		System.out.println(numbers.indexOf(10));
		System.out.println(numbers.indexOf(4));
		System.out.println(numbers.contains(10));
		System.out.println(numbers.contains(4));
	}
}



















