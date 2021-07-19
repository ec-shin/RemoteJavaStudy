package answer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E05_HackTool {
	public static void main(String[] args) {
		bruteforce("files/frankenstein_encrypted.txt");
	}
	
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		File target = new File(path);
		
		try(
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
		){
			String line;
			for(int i=0 ; i < 10 && (line = in.readLine())!=null;i++) {
				
				if(line.trim().equals("") || line.length() < 5) {
					i--;
				}else {
					lines.add(line);	
				}
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Scanner scan =  new Scanner(System.in);
		
		for(int key = 1; key < 26; key++) {
			System.out.printf("---------key: %d---------\n",key);
			for(String line : lines) {
				
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)) {
						ch = (char)(ch-key < 'A' ? ch - key + 26 : ch - key);
					}else if (Character.isLowerCase(ch)) {
						ch = (char)(ch-key < 'a' ? ch - key + 26 : ch - key);
					}
					System.out.print(ch);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Press 'Enter' to continue...");
			String cmd = scan.nextLine();
			
			if(cmd.toLowerCase().equals("d")) {
				System.out.println("전체 파일 복호화를 진행합니다");
				break;
			}
		}
		
		System.out.println("프로그램 끝");
	}
	
}

















