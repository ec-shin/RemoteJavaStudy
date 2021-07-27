package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class S05_JLabel extends StudyFrame {
	/*
		# JLabel
			
			- 텍스트를 적는 용도로 사용되는 컴포넌트
		
		# Icon으로 이미지 넣기
	 */
	int cnt;	
	public S05_JLabel() {
		super();		
		
		Icon icons[] = {
				new ImageIcon("./image/penguin.jpg"),
				new ImageIcon("./image/pengsu.jpg"),
				new ImageIcon("./image/flower2.jpg")
		};
		
		
		JButton btn = new JButton();
		JLabel label = new JLabel();
		
		label.setText("Label");
		label.setIcon(icons[cnt]);
		
		btn.setText("Button");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[++cnt % icons.length]);
				
			}
		});
		
		add(btn, "South");
		add(label, "Center");
	}
	
	public static void main(String[] args) {
		S05_JLabel frame = new S05_JLabel();
		frame.setDefaultOptions();
	}
}










