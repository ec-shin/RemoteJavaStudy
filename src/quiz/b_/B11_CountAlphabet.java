package quiz.b_;

import java.util.Scanner;

public class B11_CountAlphabet {

	public static void main(String[] args) {
		String str;
		char a = 65;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ���>> ");
		str = scan.nextLine();
		
		char alpha[] = new char[52];
		int alphaCount[] = new int[52];
		for(int i=0; i<52; i++) {
			if(a >= 91 && a <= 96) {
				a++;
				i--;
				continue;
			}
			alpha[i]=a;	
			a++;
		}
		
		for(int i=0; i<str.length(); i++) {
			char strCh = str.charAt(i);
			for(int j=0; j<alpha.length; j++) {
				if(strCh==alpha[j]) {
					alphaCount[j]++;
					break;
				}
			}
		}
		
		for(int i=0; i<alphaCount.length; i++) {
			System.out.printf("�Է��Ͻ� ���忡�� %c�� ������ %d�� �Դϴ�\n",alpha[i],alphaCount[i]);
		}
		
	}
}





