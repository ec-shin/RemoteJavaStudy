package quiz.d_;

import java.util.Scanner;

public class D04_IsJavaVariable {
	static boolean check = true;
	
	static void checkVariable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �������� �Է��� �ּ���");
		String var = scan.nextLine();
		
		if(var.charAt(0)>='0' && var.charAt(0)<='9');{
			check = false;
			System.out.println("ó���� ���ڴ� �� �� �����ϴ�.");
		}
		for(int i=0;i<var.length();i++) {
			char varCheck = var.charAt(i);
			if(varCheck==' ') {
				check = false;
				System.out.println("������ ����� �� �����ϴ�.");
				break;
			}else if(varCheck>='��' && varCheck <='�R') {
				check = false;
				System.out.println("�ѱ��� ����� �� �����ϴ�.");
				break;
			}
			if((varCheck >= 'a' && varCheck <= 'z') || varCheck == '_' || varCheck == '$' || (varCheck >= '0' && varCheck <= '9')){
				
			}else {
				check = false;
				System.out.println("���� Ư�����ڰ� �ƴմϴ�");
			}
		}
	}
	public static void main(String[] args) {
		checkVariable();
	}
}












