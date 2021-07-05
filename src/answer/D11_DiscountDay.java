package answer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay {
	public static void main(String[] args) {
	      int inputYear=2021;

	      printEventOfYear(inputYear);
	   }
	   
	   public static Calendar getFirstEventDay(int inputYear) {
	      Calendar event = Calendar.getInstance();
	      
	      event.set(inputYear, 0, 1);
	      event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
	      
//	      while(event.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
//	         event.add(Calendar.DATE, 1);
//	      }
	      
	      if(event.get(Calendar.YEAR) != inputYear) {
	         event.add(Calendar.DATE, 7);
	      }
	      
	      return event;
	   }
	   
	   public static void printEventOfYear(int inputYear) {
	      
	      SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y년 이벤트] M월 d일 E요일");
	      Calendar event = getFirstEventDay(inputYear);
	      
	      int count = 0;
	      
	      while(event.get(Calendar.YEAR) == inputYear) {
	         
	         event.add(Calendar.DATE, 7);
	         
	         if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
	            System.out.println(eventDateFormat.format(event.getTime()));
	            count++;
	         }
	      }
	      System.out.println("올해의 이벤트는 총  " + count + "회 입니다.");
	   }
	   
	}   

















