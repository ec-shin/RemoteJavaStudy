package answer;

import java.util.Scanner;

public class C17_InputRightPassword {
	static Scanner scan;
	static char[] specialCharacter = {'!','@','#','$','%','^','&','*'};
	
	public static void main(String[] args) {
		try {
	         try {
				test();
			} catch (OnlyOneKindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SpecialCharacterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberLengthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      } catch (NotNumberException e) {

	      }
	}

	public static void test() throws NotNumberException, OnlyOneKindException, SpecialCharacterException, NumberLengthException{
		String pass;
		int count=0;
		int numCount=0;
		int upperCount=0;
		int lowerCount=0;
		int scCount=0;
		
		scan = new Scanner(System.in);
		System.out.print("����Ͻ� ��й�ȣ�� �Է����ּ���:");
		pass = scan.nextLine();
		
		if(pass.length()<8 || pass.length()>24) {
			throw new NumberLengthException();
		}
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i)>='0' && pass.charAt(i)<='9' ) {
				count++;
			}
		}
		if(count==pass.length()) {
			throw new NotNumberException();
		}
		
		for(int i=0; i<pass.length();i++) {
			char ch = pass.charAt(i);
			if(ch >= '0' && ch <='9') {
				numCount++;
			}else if(ch > 'a' && ch <'z') {
				lowerCount++;
			}else if(ch > 'A' && ch <'Z') {
				upperCount++;
			}else {
				boolean sc = false;
				for(int j=0;j<specialCharacter.length;j++) {
					if(ch==specialCharacter[j]) {
						sc = true;
						break;
					}
				}
				if(sc) {
					scCount++;
				}else {
					throw new SpecialCharacterException();
				}
			}
		}
		
		if(numCount==0 || upperCount==0 || lowerCount==0 || scCount==0) {
			throw new OnlyOneKindException();
		}
	}
}

class NotNumberException extends Exception {
	public NotNumberException() {
		super("��� ������ �н������ ����� �� �����ϴ�.");
	}
}

class OnlyOneKindException extends Exception {
	public OnlyOneKindException() {
		super("�빮��, �ҹ���, ����, Ư�����ڰ� ��� �����־�� �մϴ�.");
	}
}

class SpecialCharacterException extends Exception {
	public SpecialCharacterException() {
		super("������ Ư�����ڰ� �ƴմϴ�.");
	}
}

class NumberLengthException extends Exception {
	public NumberLengthException() {
		super("��й�ȣ�� ���̰� �˸��� �ʽ��ϴ�.");
	}
}