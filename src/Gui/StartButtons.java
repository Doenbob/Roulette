package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartButtons extends JPanel{
	
	private StartFrame playframe;
	
	public StartButtons(StartFrame frame){
		
		playframe = frame;
		
		// Button - Neues Spiel starten
		JButton btnnewGame;
		btnnewGame = new JButton(new ImageIcon(getClass().getResource("/Resources/NewGame.png")));
		btnnewGame.setAlignmentX(CENTER_ALIGNMENT);
		btnnewGame.setContentAreaFilled(false);
		btnnewGame.setBorder(null);
		btnnewGame.setToolTipText("Neues Spiel starten");

		btnnewGame.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		add(btnnewGame);
		
		// Button - Spiel beenden
		JButton btncloseGame;
		btncloseGame = new JButton(new ImageIcon(getClass().getResource("/Resources/ExitButton.jpg")));
		btncloseGame.setAlignmentX(CENTER_ALIGNMENT);
		btncloseGame.setContentAreaFilled(false);
		btncloseGame.setBorder(null);
		btncloseGame.setToolTipText("Spiel beenden");

		btncloseGame.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				playframe.dispose();
			}
		});
		
		add(btncloseGame);
	}
}
