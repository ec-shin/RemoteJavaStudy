package study.d_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import quiz.d_.D06_Student;

public class D07_HashMap {
	/*
		Map
			- �����͸� key�� value �� ������ �����ϴ� ����� �ڷᱸ��
			- key���� ���� value�� ������ �� �ִ�
			- key�� �ߺ��� ������� �ʴ´�
	 */
	public static void main(String[] args) {
		//ù ��° ���׸��� key�� Ÿ���̰� �� ��° ���׸��� value�� Ÿ��
		HashMap<String, String> addr = new HashMap<>();
		/*
			Map.put(key,value) - �ʿ� �����͸� �߰��Ѵ�
			Map.putAll(map) - �ٸ� ���� �����͸� ��� �߰��Ѵ�
			Map.putIfAbsent - �ش� Ű���� ��������� �ְ�, ���� ������ �����´�, ������� null�� �����Ѵ�
		 */
		
		addr.put("��", "����Ư����...");
		addr.put("����1", "�뷮��");
		addr.put("����2", "����");
		
		System.out.println(addr.putIfAbsent("�츮��", "���� �� ����."));
		System.out.println(addr.putIfAbsent("�츮��", "���� �� �ִ�"));
		
		addr.put("����2", "������");
		System.out.println(addr);
		
		System.out.println(addr.get("��"));
		System.out.println(addr.get("����1"));
		System.out.println(addr.get("����2"));
		
		HashMap<Integer, D06_Student> students = new HashMap<>();
		
		students.put(1, new D06_Student());
		students.put(2, new D06_Student());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		//�������� Ÿ���� ����� ���ִ�
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("�̸�", "ȫ�浿");
		info.put("����", 23);
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ� ��", new String[] {"��ȭ","�","�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
	
		ArrayList<String> friends = (ArrayList<String>) info.get("ģ�� ���");
		friends.add("ö��");
		friends.add("����");
		friends.add("�μ�");
		
		((ArrayList<Object>) info.get("ģ�� ���")).add("������");
		((ArrayList<Object>) info.get("ģ�� ���")).add("�̼���");
		((ArrayList<Object>) info.get("ģ�� ���")).add("������");
		
		System.out.println(info.values());
		
		/*
			�ݺ������� MapŸ�� Ȱ���ϱ�
			
			- Map.keySet() : key��� �̷���� Set�� ��ȯ�Ѵ�
			- Map.values() : ����� �̷���� Collections�� ��ȯ�Ѵ�
			- Map.enrtySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		 */
		
		System.out.println(info.keySet());
		
		for(String key : info.keySet()) {
			System.out.println("�ݺ������� ���� ����: "+ info.get(key));
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(info.values());
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for(Object value : info.values()) {
			System.out.println(value);
		}
		
		for(Entry<String, Object> entry : info.entrySet()) {
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
		}
	}
}












