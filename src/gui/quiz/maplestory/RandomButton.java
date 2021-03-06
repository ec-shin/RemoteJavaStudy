package gui.quiz.maplestory;

import java.util.Random;

import javax.swing.JButton;

public class RandomButton extends JButton {
		
	Random ran;
	static String stat_Labels[] = {"??","??ø","????","????","???ݷ?"};
	static int max_stats[] = {7,7,7,7,3};
	
	public RandomButton() {
		super("none");
		ran = new Random();
	}
	
	void roll() {
		int value = ran.nextInt(stat_Labels.length);
		setText(stat_Labels[value] + " " + ran.nextInt(max_stats[value])+1);
	}
}
