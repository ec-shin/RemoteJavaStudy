package quiz.e;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class E05_Encrypt {
	static int key;
	
	
	public int makeRandomKey() {
		key = (int)(Math.random()*25+1);
		return key;
	}
	
	public void encrypt(String filename) {
		
		int randomKey = makeRandomKey();
		System.out.println(randomKey);
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("files/"+filename+".txt"), 2048);
					
			BufferedWriter out = new BufferedWriter(
					new FileWriter("files/"+filename+"_encrypted.txt"), 2048);
			
			int line=-1;
			while((line = in.read()) != -1) {
				if(line>='a' && line<='z'){
					if((line+randomKey)>122) {
						int a = 122-line;
						out.write(96+(randomKey-a));
					}else {
						out.write(line+randomKey);
					}
				}else if(line>='A' && line<='Z') {
					if((line+randomKey)>90) {
						int a = 90-line;
						out.write(64+(randomKey-a));
					}else {
						out.write(line+randomKey);
					}
				}else {
					out.write(line);
				}
			}
			
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new E05_Encrypt().encrypt("frankenstein");
		new E05_Decrypt().decrypt("frankenstein",key);
	}
}









