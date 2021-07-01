package quiz.d_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class D07_PhoneBook {
	Scanner scan;
	HashMap<String, HashMap<String, D07_Info>> phoneBook;
	
	D07_PhoneBook(){
		scan = new Scanner(System.in);
		phoneBook = new HashMap<>();
		phoneBook.put("����", new HashMap());
		phoneBook.put("����", new HashMap());
		phoneBook.put("ģ��", new HashMap());
		
		
	}
	
	void makeGroup() {
		String group=null;
		scan = new Scanner(System.in);
		System.out.println("�߰��Ͻ� �׷���� �Է��� �ּ���");
		System.out.println("���� �׷�:"+phoneBook.keySet());
		while(true) {
			group = scan.nextLine();
			if(phoneBook.keySet().contains(group)) {
				System.out.println("�̹� �����ϴ� �׷���Դϴ�. �ٽ� �Է����ּ���.");
			}else {
				break;
			}
			
		}
		phoneBook.put(group, new HashMap());
	}
	
	void addFriend() {
		HashMap<String, D07_Info> info = phoneBook.get("ģ��");
		info.put("010-1234-7584", new D07_Info("ȫ�浿",30,"��"));
		info.put("010-2345-1384", new D07_Info("������",20,"��"));
		info.put("010-5678-4971", new D07_Info("����",17,"��"));
		
		info = phoneBook.get("����");
		info.put("010-1593-1358", new D07_Info("�ϴ�",3,"��"));
		info.put("010-7814-9841", new D07_Info("������",12,"��"));
		info.put("010-3581-3215", new D07_Info("����",7,"��"));
		
		info = phoneBook.get("����");
		info.put("010-1470-4593", new D07_Info("����",4,"��"));
		info.put("010-6574-6491", new D07_Info("�ϳ�",42,"��"));
		info.put("010-1585-9981", new D07_Info("ö��",33,"��"));
	}
	
	void addPhoneNumber() {
		scan = new Scanner(System.in);
		HashMap<String, D07_Info> info;
		
		System.out.println("��ȣ�� �߰��Ͻ� �׷���� �Է��� �ּ���:");
		System.out.println("���� �׷�:"+phoneBook.keySet());
		String group = scan.nextLine();
		info = phoneBook.get(group);
		
		System.out.println("�߰��Ͻ� ��ȣ�� �Է����ּ���");
		String phone = scan.nextLine(); 
		
		System.out.println("�߰� ������ �Է��� �ּ���(�̸�/ ����/ ����)");
		String name = scan.nextLine();
		int age = scan.nextInt();
		String gender = scan.next();
		
		info.put(phone, new D07_Info(name,age,gender));
	}
	
	void phoneView() {
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
		}
	}
	

	void sortPhone() {
		System.out.println("���ı����� �Է����ּ���:(����,�̸�,����)");
		new D07_Info().sort = scan.next();
		System.out.println("���ϴ� ������ �Է����ּ���:(������,������)");
		new D07_Info().sortWay = scan.next();
		
		HashMap<String, D07_Info> info = new HashMap<>();

		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info.putAll(entry.getValue());			
		}
		
		ArrayList<Map.Entry<String, D07_Info>> entryList = new ArrayList<>(info.entrySet());
		entryList.sort(Map.Entry.comparingByValue());	
		for(Map.Entry<String, D07_Info> entry2 : entryList) {
			System.out.println(entry2.getValue()+" ��ȣ: "+entry2.getKey() );

		}
	}
	
	void selectPhoneView() {		
		System.out.println("�˻��ϰ� ���� �̸��� �Ϻθ� �Է��� �ּ���:");
		String name = scan.next();
		
		HashMap<String, D07_Info> info;
		ArrayList<String> number;
		ArrayList<D07_Info> list;
		
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info = entry.getValue();
			number = new ArrayList<>(info.keySet());
			list = new ArrayList<>(info.values());
			for(int i=0; i<list.size();i++) {
				if(list.get(i).name.contains(name)) {
					System.out.print("�׷�:"+entry.getKey());
					System.out.print(list.get(i));
					System.out.println(" ��ȣ:"+number.get(i));
				}
			}
		}
	}	
	
	void searchNum() {
		System.out.println("�˻��ϰ� ���� ��ȣ�� �Ϻθ� �Է��� �ּ���:");
		String search = scan.next();
		
		HashMap<String, D07_Info> info;
		ArrayList<String> number;
		ArrayList<D07_Info> list;
		
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info = entry.getValue();			
			list = new ArrayList<>(info.values());
			number = new ArrayList<>(info.keySet());
			for(int i=0; i<list.size();i++) {
				if(number.get(i).contains(search)) {
					System.out.print("�׷�:"+entry.getKey()+" ");
					System.out.print(list.get(i));
					System.out.println(" ��ȣ:"+number.get(i));
				}
			}
		}
	}
	
	void startAddPhone() {
		addFriend();
		while(true) {
			System.out.println("�׷��� �߰��Ͻ÷��� 1�� ��ȣ�� �����Ͻ÷��� 2�� ���� ����� ��ȣ�� ���÷��� 3�� �׸��Ͻ÷��� 0���� �Է����ּ���.");
			int num = scan.nextInt();
			if(num==1) {
				makeGroup();
			}else if(num==2) {
				addPhoneNumber();
			}else if(num==3) {
				System.out.println("���ĵ� ����� ���÷��� 1�� �̸��� �Ϻκи� �Է��Ϸ��� 2�� ��ȭ��ȣ�� �Ϻθ� �Է��Ϸ��� 3���� �Է����ּ���.");
				int select = scan.nextInt();
				if(select==1) {
					sortPhone();
				}else if(select==2) {
					selectPhoneView();
				}else if(select==3) {
					searchNum();
				}
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook pb = new D07_PhoneBook();
		pb.startAddPhone();

	}
}








