package quiz.b_;

import java.util.Scanner;

public class B09_ConvertSecond {

	public static void main(String[] args) {
		int num, div;
		int year, day, hour, minute, second;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ���>> ");
		num = scan.nextInt();
		
		year = num / (60*60*24*365);
		div = num % (60*60*24*365);
		if(year>0) {
			System.out.printf("%d��  ",year);
		}
		
		day = div / (60*60*24);
		div = div % (60*60*24);
		if(day>0 || year>0) {
			System.out.printf("%d��  ",day);
		}
		
		hour = div / (60*60);
		div = div % (60*60);
		if(hour>0 || day>0 || year>0) {
			System.out.printf("%d�ð�  ",hour);
		}
		
		minute = div / 60;
		second = div % 60;
		if(minute>0 || hour>0 || day>0 || year>0) {
			System.out.printf("%d��  ",minute);
		}
		
		if(second>0 || minute>0 || hour>0 || day>0 || year>0) {
			System.out.printf("%d��",second);
		}
		
	}

}
