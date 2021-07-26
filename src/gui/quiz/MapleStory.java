package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MapleStory extends JFrame {
	/*
	 * ������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� �����
	 * 
	 * �� ���� +1 ~ +7 ���� ���� +1 ~ +7 ��ø ���� +1 ~ +7 ��� ���� +1 ~ +7 ���ݷ� ���� +1 ~ +3
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
		btns.get(3).setText("������!");
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
		stats.add("��");
		stats.add("��ø");
		stats.add("���");
		stats.add("����");
		stats.add("���ݷ�");
		int random = (int)(Math.random()*5+0);

		return stats.get(random);
	}
	
	public static int setStatsLevel(String stats) {
		int level;
		if(stats.equals("���ݷ�")) {
			return level = (int)(Math.random()*3+1);
		}else {
			return level = (int)(Math.random()*7+1);
		}
	}

	public static void main(String[] args) {
		new MapleStory();

	}

}








