package study.b;

public class B07_InnerLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("===================�ٱ��� �ݺ��� " + i);
			
			for(int j = 0; j <8; j++) {
				System.out.printf("----------------���� �ݺ��� %d-%d\n",i,j);
			
				for(int k=0; k<3; k++) {
					System.out.printf("++++++���� ���� �ݺ��� %d-%d-%d\n",i,j,k);
				}
			}
		}
		
		for(int dan = 2; dan <=9; dan++) {
			
			System.out.printf("###### %d�� ######\n",dan);
			
			for(int gop = 1; gop <=9; gop++) {
				
				System.out.printf("%d x %d = %d\n",dan,gop,dan*gop);
			}
			System.out.println();
		}

	}

}