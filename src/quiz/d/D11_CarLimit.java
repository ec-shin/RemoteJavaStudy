package quiz.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class D11_CarLimit {
	Scanner scan;
	boolean resume = true;
	ArrayList<String> holidayList;
	String ko[] = {"가","나","도","허","수","라","차","바","사","자"};
	String holday[] = {"31","55","66","815","103","109","1225"};
	
	public String makeRandomCar() {
		String carNum="";
		for(int i=0; i<7; i++) {
			if(i==2) {
				carNum += ko[(int)(Math.random()*10 + 0)];
				continue;
			}
			carNum += (int)(Math.random()*10 + 0);
		}
		System.out.println("차량번호:"+carNum);
		return carNum;
	}
	
	public Calendar insertDate() {
		scan = new Scanner(System.in);
		System.out.print("원하시는 날짜를 입력하세요(년도/월/일):");
		int year = scan.nextInt();
		int month = scan.nextInt()-1;
		int date = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		
		SimpleDateFormat format = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(format.format(cal.getTime()));
		
		return cal;
	}
	
	public boolean holidayCheck(Calendar cal) {		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		holidayList = new ArrayList<>(Arrays.asList(holday));
		String holidayCheck = ""+month+date;
		
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		
		if(year<2018) {
			System.out.println("출입제한이 시행되기 전입니다. 제한이 없습니다.");
			return false;
		}else if(year==2018 && month<9) {
			System.out.println("출입제한이 시행되기 전입니다. 제한이 없습니다.");
			return false;
		}else if(holidayList.contains(holidayCheck)) {
			System.out.println("공휴일로 출입 제한이 없습니다.");
			return false;
		}else if(day_of_week==1 || day_of_week==7) {
			System.out.println("공휴일로 출입 제한이 없습니다.");
			return false;
		}else {
			return true;
		}		
	}
	
	public void carNumCheck(String car, Calendar cal) {		
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		int lastCarNum = Character.getNumericValue(car.charAt(car.length()-1));
		
		if(day_of_week==2 && (lastCarNum==1 || lastCarNum==6)) {
			System.out.println("월요일은 끝번호가 1, 6인 차량은 출입이 제한됩니다");
		}else if(day_of_week==3 && (lastCarNum==2 || lastCarNum==7)) {
			System.out.println("화요일은 끝번호가 2, 7인 차량은 출입이 제한됩니다");
		}else if(day_of_week==4 && (lastCarNum==3 || lastCarNum==8)) {
			System.out.println("수요일은 끝번호가 3, 8인 차량은 출입이 제한됩니다");
		}else if(day_of_week==5 && (lastCarNum==4 || lastCarNum==9)) {
			System.out.println("목요일은 끝번호가 4, 9인 차량은 출입이 제한됩니다");
		}else if(day_of_week==6 && (lastCarNum==5 || lastCarNum==0)) {
			System.out.println("금요일은 끝번호가 5, 0인 차량은 출입이 제한됩니다");
		}else {
			System.out.println("출입 가능한 날짜입니다");
		}
	}
	
	public void checkStart() {
		String car = makeRandomCar();
		Calendar day = insertDate();
		
		if(holidayCheck(day)) {
			carNumCheck(car,day);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			new D11_CarLimit().checkStart();
		}
	}//여러번 체크하는 경우를 보여드리기 위해 5번 임의로 설정해서 돌렸습니다!
}













