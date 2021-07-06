package study.d;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class D10_Calendar {
	
	/*
		# Date, Calendar, Time
		
		-�ڹٷ� �ð��� ��¥�� ���� �ٷ� �� �ִ� Ŭ������
	 */
	public static void main(String[] args) {
		
		// �ý����� ���н� Ÿ���� �������� �޼���
		// ���н�Ÿ�� - 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ �� ��(�и���)
		long currentTime = System.currentTimeMillis();
		System.out.println("����ð�:"+currentTime);
		System.out.println("70/01/01���ķ�.."
				+ currentTime/1000+"�� �귶���ϴ�");
		System.out.println("70/01/01���ķ�.."
				+ currentTime/1000/60+"�� �귶���ϴ�");
		System.out.println("70/01/01���ķ�.."
				+ currentTime/1000/60/60+"�ð� �귶���ϴ�");
		System.out.println("70/01/01���ķ�.."
				+ currentTime/1000/60/60/24+"�� �귶���ϴ�");
		System.out.println("70/01/01���ķ�.."
				+ currentTime/1000/60/60/24/365+"�� �귶���ϴ�");
		
		/*
			# Date
			
			- Date Ŭ������ �޼������ �ֱ� ���������� ���� ������Ʈ�� �ߴܵǾ� �ִ�
			- �ð��� ����� ���� �ٸ� Ŭ�������� ����� ���� ����
			- ������ ������ �ð� �����͸� ��Ƶα⸸ �� ���� Date Ŭ������ ���� ���
		 */
		
		Date now = new Date();
		System.out.println(now);
		
		/*
			# Calendar
			
			- �޷��� ǥ���� Ŭ����
			- ��¥�� ���� ����� �� �ִ� �پ��� ��ɵ��� ���ִ�
			- �����ڸ� ����� �� ���� getInstance()��� ����ƽ �޼��带 Ȱ���Ѵ�
			- getInstance() �޼��忡 �浵���� �����Ͽ� ������ �ð��� �� ���� �ִ�
		 */
		
		Calendar now2 = Calendar.getInstance();
		System.out.println(now2);
		
		//Calendar���� ���ϴ� �ʵ尪�� get() �޼��带 ���� ���� �� �ִ�
		System.out.println(now2.get(Calendar.YEAR));
		
		// �ʵ尪�� month�� 0���� �����Ѵ�
		System.out.println(now2.get(Calendar.MONTH));
		System.out.println(now2.get(Calendar.DATE));
		
		System.out.println("HOUR:"+now2.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY:"+now2.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE:"+now2.get(Calendar.MINUTE));
		System.out.println("SECOND:"+now2.get(Calendar.SECOND));
		
		System.out.println("���ذ� �����ϰ� ���� ��¥:"
						+now2.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("�̹� ���� �����ϰ� ���� ��¥:"+
						now2.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�̹��ְ� �����ϰ� ���� ��¥(�Ͽ����� ���� 1-7):"+
						now2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�̹� ���� �� ��° �ش� �����ΰ�:"+
						now2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		// �ٸ� ���� �ð� �ν��Ͻ� �����ϱ�
		//for (String avail_id : TimeZone.getAvailableIDs()) {
		//	System.out.println(avail_id);
		//}
		
		Calendar us_east=
				Calendar.getInstance(TimeZone.getTimeZone("US/Eastern"));
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d\n",
				us_east.get(Calendar.YEAR),
				us_east.get(Calendar.MONTH) +1 ,
				us_east.get(Calendar.DATE),
				us_east.get(Calendar.HOUR_OF_DAY),
				us_east.get(Calendar.MINUTE),
				us_east.get(Calendar.SECOND));
		/*
		 SimpleDateFormat: �ð� �ν��Ͻ��� ���ϴ� �������� ���ϰ� ����ϱ�
		 
		  # ����� �� �ִ� ���ĵ�
		  
		  	y : ��   M : ��   d : �� D : ��(1 - 365)
		  	H : 24�� h : 12�� m : �� s : ��
		  	E : ���� a : AM/PM
		*/
		
		SimpleDateFormat myDateFormat = 
				new SimpleDateFormat(
						"yyyy/MM/dd HH:mm:ss EEEEEE");
		
		// Calendar �ν��Ͻ��� DateŸ�� �ν��Ͻ��� ������ �� �ִ�
		String text = myDateFormat.format(us_east.getTime());
		System.out.println(text);
		
		// Calendar�� set() �޼��带 ����� ���ϴ� �ʵ带 ���ϴ� ������ ������ �� �ִ�
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("���� ��: " + getCurrentDate(calendar));
		
		calendar.set(Calendar.DATE, 30);
		calendar.set(Calendar.MONTH, 1);
		
		System.out.println("���� ��: " + getCurrentDate(calendar));
	}
	
	public static String getCurrentDate(Calendar calendar) {
		SimpleDateFormat current = new SimpleDateFormat(
				"yyyy�� MM�� dd�� / EEEEEE");
		return current.format(calendar.getTime());
	}
}



















