package answer;

import java.util.Scanner;

public class B07_Prime2 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);	

		System.out.print("> ");
		num = scan.nextInt();		
		for(;num<0;) {
			System.out.print("�߸��� �����Դϴ� �ٽ� �Է��ϼ���>> ");
			num = scan.nextInt();
		}
		
		for(int chkNum=2; chkNum <=num; chkNum++) {
			
			int count = 0;
			
			for(int divNum = 2; divNum <=chkNum; divNum++) {
				if(chkNum % divNum == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(chkNum);
			}
		}
		
		System.out.println("-------------------------------");		
		
		for(int chkNum=2; chkNum <=num; chkNum++) {
			
			boolean prime = true;
			
			for(int divNum = 2; divNum < chkNum; divNum++) {
				
				if(chkNum % divNum == 0) {
					prime = false;
				}
			}
			
			if(prime) {
				System.out.println(chkNum);
			}
		}
		
		System.out.println("-------------------------------");		
		
		for(int chkNum=3; chkNum <=num; chkNum+=2) {
			
			boolean prime = true;
			
			for(int divNum = 3; divNum <= Math.sqrt(divNum); divNum+=2) {//�����ٱ���
				
				if(chkNum % divNum == 0) {
					prime = false;
				}
			}
			
			if(prime) {
				System.out.println(chkNum);
			}
		}
	}
}



