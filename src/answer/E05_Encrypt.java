package answer;

import java.io.*;


public class E05_Encrypt {
	public static void main(String[] args) {
		encryption("files/frankenstein.txt",(int)(Math.random()*24+1));
	}
	
	public static boolean encryption(String path, int key) {
		File file = new File(path);
		
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		
		File dst = new File("files/"+realFileName + "_encrypted.txt");
		
		try (
				FileReader fin = new FileReader(file);	
				BufferedReader in =  new BufferedReader(fin);
				FileWriter fout = new FileWriter(dst);
				BufferedWriter out = new BufferedWriter(fout);
		){
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
				
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)){
						ch = (char)((ch - 'A' + key) % 26 +'A');
					}else if (Character.isLowerCase(ch)) {
						ch = (char)((ch - 'a' + key) % 26 +'a');
					}
					out.append(ch);
				}
				out.append("\n");
			}

					
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.printf("암호화 성공! [키:%d]\n", key);
		return true;
	}
	
}













