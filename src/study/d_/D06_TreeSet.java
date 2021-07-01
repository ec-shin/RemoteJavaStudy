package study.d_;

import java.util.*;


public class D06_TreeSet {
	/*
		TreeSet
			- ������ �ִ� Set
			- ó�� Set�� �����͸� �߰��� �� ���� �����ؼ� �ִ´�
			- �ߺ��� ������� �ʴ´�(Set�� Ư¡, ������ ���� ���� Hash�� Ư¡)
			- �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
			- �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	 */
	private static Random ran = new Random();
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);	
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
				/*
					�ڸ��� �ٲٷ��� �������
					�ڸ��� �ٲٱ� ������ ���� ����
					�� ���� ���� ���̸� 0����
				 */
			}
		}) ;
			
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);		
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		//�̸� ������ ���� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first "+ numbers.first());
		System.out.println("last "+ numbers.last());
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		
		System.out.println(numbers.subSet(30, 70));
		
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list,numbers2.comparator());
		
		System.out.println("list: "+list);
		
		System.out.println(list.containsAll(desc));
		System.out.println(list.containsAll(tail));
		System.out.println(list.containsAll(numbers));
		
	}
}















