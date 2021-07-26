package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyJButton extends JButton{
	
	int value;
	
	public MyJButton() {
		super();
		
		setText("" + value);
		addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("정보1: "+ e.getID());
				System.out.println("정보2: "+ e.getModifiers());
				System.out.println("정보3: "+ e.getWhen());
				System.out.println("정보4: "+ e.getActionCommand());
				System.out.println("정보5: "+ e.getSource());
				
				((MyJButton) e.getSource()).setText(""+ ++value);
			}
		});
	}
}
















