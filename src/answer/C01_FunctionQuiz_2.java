package answer;

public class C01_FunctionQuiz_2 {
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('T'));
		
		System.out.println(isMul3(14));
		
		numCheck(13);
		
		System.out.print("�Է��� ������ ���:");
		for(int i=0; i<divisor(18).length;i++) {
			System.out.printf("%d  ",divisor(18)[i]);
		}		
		System.out.println();
		
		System.out.println(prime(19));
		
		System.out.println(factorial(5));
	}

	//1��
	public static boolean isAlphabet(char alpha) {
		return alpha >='a' && alpha <='z' || alpha >='A' && alpha <='Z';
	} 
	
	//2��	
	 public static boolean isMul3(int num) {
		return num % 3 == 0;			
	 }
	 
	 //3��	 
	 public static String numCheck(int num) {
		 return num % 2 ==0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		//
	 }
	 
	 //4��
	 public static int[] divisor(int num) {
		 int count=0;
		 int divCount=0;
		 
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 
		 int div[] = new int[count];
		 
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 div[divCount]=i;
				 divCount++;
			 }
		 }
		 
		 return div;	
	 }
	 
	 //5��	 
	 public static boolean prime(int num) {
		boolean check = true;
		
		for(int i=2; i<num; i++) {
			 if(num % i == 0) {
				 check = false;
				 break;
			 }
		 }		
		return check;	
	 }
	 
	 //6��	 
	 public static int factorial(int num) {
		 int fac=1;
		 for(int i=num; i>=1; i--) {
			 fac=fac*i;
		 }
		 return fac;	
	 }
	 	
}









