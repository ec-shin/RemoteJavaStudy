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
	String ko[] = {"��","��","��","��","��","��","��","��","��","��"};
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
		System.out.println("������ȣ:"+carNum);
		return carNum;
	}
	
	public Calendar insertDate() {
		scan = new Scanner(System.in);
		System.out.print("���Ͻô� ��¥�� �Է��ϼ���(�⵵/��/��):");
		int year = scan.nextInt();
		int month = scan.nextInt()-1;
		int date = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		
		SimpleDateFormat format = new SimpleDateFormat("y�� M�� d�� E����");
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
			System.out.println("���������� ����Ǳ� ���Դϴ�. ������ �����ϴ�.");
			return false;
		}else if(year==2018 && month<9) {
			System.out.println("���������� ����Ǳ� ���Դϴ�. ������ �����ϴ�.");
			return false;
		}else if(holidayList.contains(holidayCheck)) {
			System.out.println("�����Ϸ� ���� ������ �����ϴ�.");
			return false;
		}else if(day_of_week==1 || day_of_week==7) {
			System.out.println("�����Ϸ� ���� ������ �����ϴ�.");
			return false;
		}else {
			return true;
		}		
	}
	
	public void carNumCheck(String car, Calendar cal) {		
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		int lastCarNum = Character.getNumericValue(car.charAt(car.length()-1));
		
		if(day_of_week==2 && (lastCarNum==1 || lastCarNum==6)) {
			System.out.println("�������� ����ȣ�� 1, 6�� ������ ������ ���ѵ˴ϴ�");
		}else if(day_of_week==3 && (lastCarNum==2 || lastCarNum==7)) {
			System.out.println("ȭ������ ����ȣ�� 2, 7�� ������ ������ ���ѵ˴ϴ�");
		}else if(day_of_week==4 && (lastCarNum==3 || lastCarNum==8)) {
			System.out.println("�������� ����ȣ�� 3, 8�� ������ ������ ���ѵ˴ϴ�");
		}else if(day_of_week==5 && (lastCarNum==4 || lastCarNum==9)) {
			System.out.println("������� ����ȣ�� 4, 9�� ������ ������ ���ѵ˴ϴ�");
		}else if(day_of_week==6 && (lastCarNum==5 || lastCarNum==0)) {
			System.out.println("�ݿ����� ����ȣ�� 5, 0�� ������ ������ ���ѵ˴ϴ�");
		}else {
			System.out.println("���� ������ ��¥�Դϴ�");
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
	}//������ üũ�ϴ� ��츦 �����帮�� ���� 5�� ���Ƿ� �����ؼ� ���Ƚ��ϴ�!
}













