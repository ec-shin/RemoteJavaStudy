package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	public S03_JButton() {
		super("How To Make JButton");
		
		setLayout(new BorderLayout());
		
		JButton[] btns = new JButton[5];
		String directions[] = {"East", "West", "South", "North", "Center"};
		
		for(int i=0, len = btns.length; i < len; i++) {
			btns[i] = new JButton("Button"+i);
			add(btns[i], directions[i]);
		}
		// 1. 버튼의 배경색을 바꿀 수 있다.
		btns[2].setBackground(new Color(0x42bdff));
		
		// 2. 버튼의 글꼴을 바꿀 수 있다.
		btns[1].setFont(new Font("궁서체", Font.BOLD, 50));
		
		// 3. 버튼에는 이벤트도 추가할 수 있다
		btns[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int random = (int)Math.random() *10 +2;
				for(int i=1; i< random; i++) {
					System.err.print("왜 눌러? ");
				}
				System.err.println();
				
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500 ,500);
		setLocation(500 ,500);
		setVisible(true);
		
		//4. 버튼 비활성화
		btns[4].setEnabled(false);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}
}















