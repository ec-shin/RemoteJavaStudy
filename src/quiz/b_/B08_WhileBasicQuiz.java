package quiz.b_;

public class B08_WhileBasicQuiz {

	public static void main(String[] args) {
		//1��
		System.out.println("-------1������-------");
		int sum=0;
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("3�� ����� ������:"+sum);
		
		System.out.println("-------2������-------");
		//2��
		i = 355;
		while(i >= 237) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("-------3������-------");
		//3��
		i = 3000;
		while(i <= 5000) {
			if(i % 7 != 0) {
				i++;
				continue;
			}else {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("-------4������-------");
		//4��
		i = 1;
		sum=0;
		while(i <= 200) {
			if(i % 2 !=0 && i % 3 !=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("������:"+sum);
	}

}











