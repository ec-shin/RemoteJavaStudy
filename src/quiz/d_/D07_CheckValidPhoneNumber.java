package quiz.d_;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	Scanner scan;

	void checkPhone() {
		String phone;
		while (true) {
			int checkCount=0;
			scan = new Scanner(System.in);
			System.out.print("�ڵ��� ��ȣ�� �Է����ּ���:");
			phone = scan.nextLine();
			if (phone.charAt(3) != '-' || phone.charAt(8) != '-') {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���.");
			}else {
				for(int i=0;i<phone.length();i++) {
					char ch = phone.charAt(i);
					if(i==3 || i==8) {
						continue;
					}else if(ch<'0'||ch>'9') {
						System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���. ");
						break;
					}else {
						checkCount++;
					}
				}
			}
			if(checkCount==11) {
				break;
			}
		}
		System.out.println("�Է��Ͻ� ��ȣ:"+phone+"�� �ԷµǾ����ϴ�.");
	}
	
	public static void main(String[] args) {
		new D07_CheckValidPhoneNumber().checkPhone();
	}
}
