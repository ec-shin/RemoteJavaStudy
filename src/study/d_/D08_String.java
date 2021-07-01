package study.d_;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {
	public static void main(String[] args) {
		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		//String.split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ
		
		String splitted[] = fruits.split("/");
		
		for(int i=0; i< splitted.length; i++) {
			System.out.println(i+": "+splitted[i]);
		}
		
		//String.join(delim, �̾���� ��) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�.
		String after = String.join(",", splitted);
		System.out.println(after);
		System.out.println(String.join("-", "����","���","�췰","����"));
		
		printRabbitWithMessage("Ŀ��", "����", "�ֽ�", "���", "�Ǹ�");
		printRabbitWithMessage("����", "����");
		
		//substring(start): ���ڿ��� start���� ���������� �ڸ� �ν��Ͻ��� ��ȯ
		//substring(start,end): ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ		
		String year= "991234-1234567".substring(0,2);
		System.out.println(year);
		
		//contains(seq): ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�
		String ph = "010-1234-4321";
		System.out.println(ph.contains("1234"));
		System.out.println(ph.contains("5678"));
		
		//startWith(seq): ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻�
		System.out.println(ph.startsWith("010"));
		
		//endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻�
		System.out.println(ph.endsWith("4"));
		
		//replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("����: "+ ph + "���: "+result);
		
		//getByte() : ���ڿ��� byte[]�� ��ȯ�Ѵ�
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes()));
		
		//byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		//byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		//System.out.println(new String(message));
		
		//� ��Ģ�� ����� byte[]�� ��ȯ���� ������ �� �ִ�.
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�.".getBytes("UTF-8")));
			System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�.".getBytes("UTF-16")));
			System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�.".getBytes("EUC-KR")));
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(new String(message));
		
		//trim() : ���ڿ� �ٱ����� ������ �������ش�
		String userInput = "  java";
		String answer = "java";
		
		System.out.println(userInput.trim().equals(answer));
		
		//toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ
		//toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		
		// indexOf(seq): ���ϴ� ���ڿ��� �ε����� ��ȯ
		// indexOf(seq, start): ���ϴ� ���ڿ��� �ε����� ��ȯ, ������ġ�� ���� �� ����
		String languages = "Java, Python, C, C++, C#, Kotlin, JavaScript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java",1));
		
		int lanIndex=0;
		ArrayList<Integer> index = new ArrayList<>();
		while(lanIndex!=-1) {
			for(int i=lanIndex; i<languages.length();i++) {				
				if(lanIndex!=0) {
					lanIndex = languages.indexOf(i);
					index.add(i);
				}
			}	
		}
		System.out.println(index);
	}
	
	// TYPE...: ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	// �׻� �����ΰ��� �޼����� �������� �����ؾ��Ѵ�.
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��)");
		System.out.println(Arrays.toString(msgs));
	}
}















