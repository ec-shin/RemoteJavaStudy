package study.d_;
import java.util.ArrayList;
import java.util.Collections;

public class D03_Collections {
	/*
		Collections Ŭ����
			- �÷����� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� Ŭ����
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("�ܹ���");
		foods.add("���");
		foods.add("���θ�");
		foods.add("û����");
		foods.add("ī��ư�");
		foods.add("¥���");
		
		System.out.println(foods);
		
		System.out.println(Collections.max(foods));
		System.out.println(Collections.min(foods));
		
		//����
		Collections.sort(foods);
		System.out.println(foods);
		
		//�ڼ���
		Collections.shuffle(foods);
		System.out.println(foods);
		
		Collections.addAll(foods, "����Ƣ��", "ġ�ƽ", "ġŲ�ʰ�","��¡��Ƣ��", "����Ƣ��");
		System.out.println(foods);
		
		//�ش� ���� �� �� ����ִ����� ���� �˻��� �� �ִ�
		foods.add("ġ�ƽ");
		int a = Collections.frequency(foods, "ġ�ƽ");
		System.out.println(a);
		
		//�÷����� �Ųٷ� �����´�.
		Collections.reverse(foods);
		System.out.println(foods);
		
		//�÷��� ������ ���� ��ġ�� ��ȯ
		Collections.swap(foods, 0, 8);
		System.out.println(foods);
		
		//���������� 5ĭ �̵�
		Collections.rotate(foods, 5);
		System.out.println(foods);
		Collections.rotate(foods, -5);
		System.out.println(foods);
	}
}





















