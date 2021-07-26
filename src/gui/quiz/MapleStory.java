package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MapleStory extends JFrame {
	/*
	 * 굴리기! 버튼을 누르면 옵션이 랜덤으로 3개 결정되는 프로그램을 만들기
	 * 
	 * 힘 증가 +1 ~ +7 지능 증가 +1 ~ +7 민첩 증가 +1 ~ +7 행운 증가 +1 ~ +7 공격력 증가 +1 ~ +3
	 */
	static ArrayList<String> stats = new ArrayList<>();

	public MapleStory() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		int size = 1;
		for(int i=0; i< 3 ; i++) {
			btns.add(new JButton());
			add(btns.get(i));
			btns.get(i).setText("Hi");
			btns.get(i).setBounds(35 * size, 100, 120, 120);
			size+=4;
		}
		
		btns.add(new JButton());
		add(btns.get(3));
		btns.get(3).setText("굴리기!");
		btns.get(3).setBounds(150, 300, 200, 100);
		btns.get(3).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i=0;i<3;i++) {
					String stats = choiceStats();
					int level = setStatsLevel(stats);
					
					btns.get(i).setText(stats+": "+level);
				}
				
			}
		});
		

		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(500, 500);
		setVisible(true);
	}
	
	public static String choiceStats() {
		stats.add("힘");
		stats.add("민첩");
		stats.add("행운");
		stats.add("지력");
		stats.add("공격력");
		int random = (int)(Math.random()*5+0);

		return stats.get(random);
	}
	
	public static int setStatsLevel(String stats) {
		int level;
		if(stats.equals("공격력")) {
			return level = (int)(Math.random()*3+1);
		}else {
			return level = (int)(Math.random()*7+1);
		}
	}

	public static void main(String[] args) {
		new MapleStory();

	}

}








