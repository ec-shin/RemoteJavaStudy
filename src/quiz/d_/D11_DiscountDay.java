package quiz.d_;

import java.time.*;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startYear=0;

		System.out.print("원하시는 년도를 입력하세요:");
		int setYear = scan.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, setYear);
		cal.set(Calendar.MONTH, startYear);
		cal.set(Calendar.DAY_OF_MONTH, 1);

		for(int i=1; i<366;i++) {
			cal.add(Calendar.DATE, 1);
			
			int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
			int week_of_month = cal.get(Calendar.WEEK_OF_MONTH);
			
			if(day_of_week==5 && week_of_month % 2 == 0) {
				System.out.print(cal.get(Calendar.YEAR)+" ");
				System.out.print(cal.get(Calendar.MONTH)+1+" ");
				System.out.println(cal.get(Calendar.DATE));
			}
		}
	}
}
