package quiz.b_;

public class B07_Gugudan {

	public static void main(String[] args) {
		//1��		
		for (int dan = 2; dan <= 9; dan++) {

			System.out.printf("%d��\t", dan);

			for (int gop = 1; gop <= 9; gop++) {

				System.out.printf("%d x %d = %d  ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------");
		
		//2��
		for(int dan=2; dan<=9;dan++) {
			System.out.printf("%d�� \t\t",dan);
		}
		System.out.println();
		
		for (int gop = 1; gop <= 9; gop++) {
			
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
			}
			System.out.println();		
		}
	}

}
