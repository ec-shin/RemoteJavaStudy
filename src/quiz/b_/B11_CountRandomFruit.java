package quiz.b_;

import java.util.Scanner;

public class B11_CountRandomFruit {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		int randomFruit[];
		int fruitCount[] = new int[6];
		String fruit[] = new String[] {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		
		System.out.print("���� �ϳ��� �Է��ϼ���>> ");
		num = scan.nextInt();
		randomFruit = new int[num];
		
		for(int i=0; i<randomFruit.length; i++) {
			randomFruit[i]=(int)(Math.random() * 6 + 1);
		}
		
		for(int i=0; i<fruit.length; i++) {
			for(int j=0; j<randomFruit.length; j++) {
				if((randomFruit[j]-1)==i) {
					fruitCount[i]++;
				}
			}
			System.out.printf("%s�� %d�� ���Խ��ϴ�\n",fruit[i],fruitCount[i]);
		}
	}

}
