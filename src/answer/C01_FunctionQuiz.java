package answer;

import java.util.Arrays;

public class C01_FunctionQuiz {
	/*
	 	# ���� �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 */
	public static void main(String[] args) {
	/*	# 1�� ����
		String str = "�ѱ� hanguel";
		
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(isAlphabet(ch)) {
				System.out.println(i + "��° ���ڴ� �����Դϴ�.");
			}else {
				System.out.println(i + "��° ���ڴ� ��� �ƴմϴ�.");
			}
		}
	*/
		System.out.println("1�� : " + isAlphabet('A'));
		
		System.out.println("2�� : " + isMul3(4));
		
		System.out.println("3�� : " + oddEven(4));
		
		System.out.println("4�� : " + Arrays.toString(allYaksu(10)));
		
		System.out.println("5�� : " + isPrime(10));
		
		System.out.println("6�� : " + factorial(3));
		
		System.out.println("6-1��(���) : " + recursive_factorial(3));
	}

	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean isAlphabet(char text) {
		return text >= 'a' && text <='z' || text >= 'A' && text <= 'Z';
	}
	
	// 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȭ�ϴ� �Լ�
	public static boolean isMul3(int num) {
		return num % 3 == 0 || num == 0;
	}
	
	// 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�." �Ǵ� "Ȧ���Դϴ�."�� ��ȯ�ϴ� �Լ�
	public static String oddEven(int num) {
		
			return num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
	}
	
	// 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	public static int[] allYaksu(int num) {
		// 50�� ��� booleanŸ�� ���� 50���� ����
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				divided[i -1] = true; // �迭�� ������ ������ ���ڵ��� ǥ�� �س���
				count++;
			}
		}

		int[] yaksu = new int[count];
		int index = 0;
		
		for(int i = 0; i < num; ++i) {
			if(divided[i]) {
				yaksu[index++] = i + 1;
			}
		}

		return yaksu;
	}
	
	// 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}else if(num ==2) {
			return true;
		}else if(num % 2 == 0) {
			return false;
		}
		
		for(int i = 3; i <= Math.sqrt(num); i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//	factorial : (n)*(n-1)*(n-2) *...*3*2*1
	public static int factorial(int num) {
		int factorial = 1;
		for(int i = num; i > 0; --i) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	// � �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ���.
	// (���� ������, �Ѹ�, ���ϴ°� ����)
	public static int recursive_factorial(int num) {
		if(num == 1) {
			// 1���� �����ϸ� �׸� ���ϰ� ������.
			return 1;
		}
		return num * recursive_factorial(num-1);
		
	}
	
}




