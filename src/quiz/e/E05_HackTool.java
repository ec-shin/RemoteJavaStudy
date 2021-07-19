package quiz.e;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_HackTool {
	public static void main(String[] args) {
		for(int i=1; i<26; i++) {
			System.out.println("--------------"+i+"번째--------------");
			decryption("files/frankenstein_encrypted.txt",i);
		}
	}	
	
	public static boolean decryption(String path, int key) {
		File file = new File(path);
		int count=0;
		
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		
		File dst = new File("files/"+realFileName + "_decrypted.txt");
		
		try (
				FileReader fin = new FileReader(file);	
				BufferedReader in =  new BufferedReader(fin);
				FileWriter fout = new FileWriter(dst,true);
				BufferedWriter out = new BufferedWriter(fout);
		){
			String line;
			out.write(key+"번째\n");
			while((line = in.readLine()) != null) {
				if(count==10) {
					break;
				}
				System.out.println(line);
				
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)){
						ch = (char)('Z'-('Z' - ch + key) % 26);
					}else if (Character.isLowerCase(ch)) {
						ch = (char)('z'-('z' - ch + key) % 26);
					}
					out.append(ch);
				}
				out.append("\n");
				count++;
			}

					
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return true;
	}
	
}
