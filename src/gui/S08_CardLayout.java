package gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S08_CardLayout extends StudyFrame {

	public S08_CardLayout() {
		super();
		
		// CardLayout: 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
		
		JPanel card_panel = new JPanel(new CardLayout(10,10));		
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		BufferedImage image;
		
		try {
			image = ImageIO.read(new File("./image/penguin.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			image = null;
		}
		
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		
		icons3.add(new ImageIcon("./image/fruit/apple.jpg"));
		icons3.add(new ImageIcon("./image/fruit/pear.jpg"));
		icons3.add(new ImageIcon("./image/fruit/kiwi.jpg"));
		icons3.add(new ImageIcon("./image/fruit/grape.jpg"));
		icons3.add(new ImageIcon("./image/fruit/melon.jpg"));
		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new ImagePanel(icons3);
		JButton south_btn = new JButton("next card!");
		
		//카드 레이아웃을 사용할 때는 name이 유용하게 사용된다.
		card_panel.add("card1",panel1);
		card_panel.add("card2",panel2);
		card_panel.add("card3",panel3);
		
		add(card_panel, "Center");
		add(south_btn,"South");
		
		/*
		    CardLayout.next() : 다음 카드 보기
		    CardLayout.prevoius() : 이전 카드 보기
			CardLayout.first() : 맨처음 카드 보기
			CardLayout.last() : 마지막 카드 보기
		 */
		south_btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 해당 패널 또는 프레임에 정의 된 레이아웃을 꺼내서 사용할 수 있다
				CardLayout card_layout = ((CardLayout)card_panel.getLayout());
				card_layout.next(card_panel);
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
	}

}
















