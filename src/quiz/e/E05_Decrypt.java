package quiz.e;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_Decrypt {
	public void decrypt(String filename, int key) {
		
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("files/"+filename+"_encrypted.txt"), 2048);
					
			BufferedWriter out = new BufferedWriter(
					new FileWriter("files/"+filename+"_decrypted.txt"), 2048);
			
			int line=-1;
			while((line = in.read()) != -1) {
				if(line>='a' && line<='z'){
					if((line-key)<97) {
						int a = line-97;
						out.write(123-(key-a));
					}else {
						out.write(line-key);
					}
				}else if(line>='A' && line<='Z') {
					if((line-key)<65) {
						int a = line-65;
						out.write(91-(key-a));
					}else {
						out.write(line-key);
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
}
