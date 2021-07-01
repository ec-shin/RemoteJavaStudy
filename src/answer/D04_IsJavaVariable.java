package answer;

import java.util.Scanner;

public class D04_IsJavaVariable {
	
	public static void main(String[] args) {
		String str = "String";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("java123".toCharArray()));
		
	}
	
	public static boolean check(char[] str) {
		//Character.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
		for(int i=0;i<str.length;i++) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}

}












