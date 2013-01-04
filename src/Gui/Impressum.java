package Gui;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Impressum {
	
	JFrame frame;
	JLabel backGroundImage;
	
	public Impressum(){
		// Frameeinstellungen 
		frame = new JFrame ("Impressum");

		frame.setSize(773, 520);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// Hintergrundbild mit Text
		backGroundImage = new JLabel(new ImageIcon(getClass().getResource("/resources/impressumBackground.jpg")));
		backGroundImage.setLayout(null);
		backGroundImage.setOpaque(false);
		frame.getContentPane().add(backGroundImage);
		backGroundImage.setBounds(0,0,773, 520);
	}

}
