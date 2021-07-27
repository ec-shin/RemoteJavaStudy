package gui.myhandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar  implements ActionListener{
	ArrayList<JButton> btns;
	JLabel label;
	String image[];
	int index;
	public MenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu();
		label = new JLabel();
		
		String image[] = {"./image/fruit/apple.jpg",
				"./image/fruit/pear.jpg",
				"./image/fruit/grape.jpg",
				"./image/fruit/melon.jpg",
				"./image/fruit/kiwi.jpg"};	
	}
	
	public void change() {
		label.setIcon(new ImageIcon(image[index = ++index % image.length]));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		change();
	}

}










