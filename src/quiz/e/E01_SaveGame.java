package quiz.e;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E01_SaveGame {
	String user, com;
	String result;
	
	public String computerRSP() {
		Random ran = new Random();
		ArrayList<String> rsp = new ArrayList<>();
		rsp.add("scissors");
		rsp.add("paper");
		rsp.add("rock");
		
		return rsp.get(ran.nextInt(3));
	}
	
	public void winCheck(String user, String com) {
		System.out.println("user:"+user+"\tcom:"+com);
		
		if(user.equals(com)) {
			System.out.println("비겼습니다.");
			result = "draw";
		}else if(user.equals("scissors") && com.equals("rock")) {
			System.out.println("졌습니다.");
			result = "lose";
		}else if(user.equals("scissors") && com.equals("paper")) {
			System.out.println("이겼습니다.");
			result = "win";
		}else if(user.equals("rock") && com.equals("scissors")) {
			System.out.println("이겼습니다.");
			result = "win";
		}else if(user.equals("rock") && com.equals("paper")) {
			System.out.println("졌습니다.");
			result = "lose";
		}else if(user.equals("paper") && com.equals("rock")) {
			System.out.println("이겼습니다.");
			result = "win";
		}else if(user.equals("paper") && com.equals("scissors")) {
			System.out.println("졌습니다.");
			result = "lose";
		}				
	}
	
	public void writeResult() {
		try {
			FileOutputStream out = 
					new FileOutputStream("src/quiz/e/result.txt", true);			
			out.write(("user:"+user+" ").getBytes());
			out.write(("com:"+com+" ").getBytes());
			out.write(("result:"+result+"\n").getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("결과를 입력했습니다.");
	}
	
	public void gameStart() {
		Scanner scan = new Scanner(System.in);		
		System.out.print("가위바위보중 하나를 입력해주세요:(rock/scissors/paper)");
		user = scan.next();
		com = computerRSP();
		winCheck(user, com);
		writeResult();
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5;i++) {
			new E01_SaveGame().gameStart();
		}		
	}
}





