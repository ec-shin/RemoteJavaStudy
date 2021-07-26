package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {
	/*
		# JavaSwing
			
			- javax.swing 패키지에 들어있는 클래스들로 windows GUI 프로그램을 만들 수 있다
			
		# Component
			
			- 버튼, 표, 슬라이더, 메뉴... 등등
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton btn1 = new JButton("This is button");
		btn1.setLocation(100,100);
		btn1.setSize(150,80);
		
		JButton btn2 = new JButton("Button2");
		btn2.setLocation(-10,-10);
		btn2.setSize(150,80);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(new JButton("button3") {
			{
				setLocation(300,30);
				setSize(150,80);
			}
		});
		
		//레이아웃 삭제
		frame.setLayout(null);
		// X버튼 눌렀을 때의 동작을 설정
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// 프레임 크기설정
		frame.setSize(500,500);
		// 설정된 대로 프레임을 보이게 한다.  (화면에 보이는 효과가 있다)
		frame.setVisible(true);

	}

}











