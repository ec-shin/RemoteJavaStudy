package quiz.d;

import java.time.LocalDate;
import java.util.ArrayList;

import myobj.parking.Car;

public class D11_ParkingSystem {
	private static ArrayList<LocalDate> holidays = new ArrayList<>() {
		private static final long serialVersionUID = 1L;
		{
			this.add(LocalDate.of(2000, 1, 1));
			this.add(LocalDate.of(2000, 3, 1));
			this.add(LocalDate.of(2000, 5, 1));
			this.add(LocalDate.of(2000, 6, 6));
			this.add(LocalDate.of(2000, 8, 15));
			this.add(LocalDate.of(2000, 10, 3));
			this.add(LocalDate.of(2000, 10, 9));
			this.add(LocalDate.of(2000, 12, 25));
		}
	};
	
	private boolean checkHoliday(Car car) {
		LocalDate park_date = car.getPark_date();
		
		for(LocalDate holiday : holidays) {
			if(holiday.getDayOfMonth() == park_date.getDayOfMonth() 
					&&holiday.getMonthValue()==park_date.getMonthValue()) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		D11_ParkingSystem parking = new D11_ParkingSystem();
		
		for(int i=0; i<100; i++) {
			Car car = new Car();
			
			if(parking.checkHoliday(car)) {
				System.out.println(car.getPark_date() + "´Â °øÈÞÀÏÀÔ´Ï´Ù.");
			}else {
				System.out.println(car.getPark_date() + "´Â °øÈÞÀÏÀÌ ¾Æ´Õ´Ï´Ù.");
			}
		}
	}
}
























