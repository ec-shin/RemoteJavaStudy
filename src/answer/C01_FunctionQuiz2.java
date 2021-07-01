package answer;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2
	 	
	 		1. �ִ밪�� �Ű������� ���޹�����
	 		   0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 		   range �Լ��� ��������
	 		   
	 		   ex : range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 		   
	 		2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
	 		   �ּҰ� ���� �ִ밪 �̸��Ǹ�� �������� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
	 		   range �Լ��� ��������
	 		   
	 		   ex : range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 		   
	 		3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
	 		   �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
	 		   range �Լ��� ��������
	 		   
	 		   ex : range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
	 		   		range(40, 45, 5)�� ��� -> [40]
	 */
	public static void main(String[] args) {
		range(7);
		System.out.println();
		range(19,10);
		System.out.println();
		range(1, 99, 3);
		
	}
	
	/*
	 	# �Լ� �����ε�(overloading)
	 		- �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����Ҽ��ִ�.
	 */
	public static int[] range(float num) {
		// println()���� �پ��� Ÿ�Ե��� �����ε��� �����Ѵ�.
		// ����()�ȿ� ���� �ٸ� Ÿ���� ���� �� �ֵ��� �����ε��� �����Ѵ�.
		System.out.println();
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
		
		return null;
	}
	
	public static int[] range(int num) {
		int[] maxNum = new int[num];
		for(int i = 0; i < num; ++i) {
			maxNum[i] = i;
		}
		System.out.println(Arrays.toString(maxNum));
		return maxNum;
	}
	
	public static int[] range(int start, int end) {
		
		int increase = start > end ? -1 : 1;
		int[] midNum = new int[increase < 0 ? start - end : end - start];
		
		for(int value = start, index = 0; value != end; value += increase) {
			midNum[index++] = value;
		}
		System.out.println(Arrays.toString(midNum));
		
		return midNum;
	}
	
	/**
	  	����ȭ �ּ� (�� ��ɿ� ���� ������ �� ���ִ�.)(/** �� �ΰ� ���)
	 
	 	@start : �����ϴ� ���� ��������
	 	@end : ������ ���� ��������
	 	@param increse
	 	@return : �߸��� ���� ������ null�� ������, ����� �����ø� int[]�� ���ɴϴ�.
	 */
	public static int[] range(int start, int end, int increase) {
		if(increase < 0 && start <= end) {
			return null;
		}else if(increase > 0 && start >= end) {
			return null;
		}else if(increase == 0) {
			return null;
		}
		
		int size;
		if(increase > 0) {
			int range = end - start;
			size = start % increase == 0 ? range /increase : range / increase + 1;
		}else {
			int range = start - end;
			size = start % (increase * -1) == 0 ?
					range / (increase * -1) : range / (increase * -1) + 1;
		}
		
		int[] arr = new int[size];
		
		for(int value = start, index = 0; 
				increase > 0 ? value < end : value > end; value += increase) {
		
			arr[index++] = value;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}

}
