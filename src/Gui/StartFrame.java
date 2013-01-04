package Gui;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class StartFrame extends JFrame{
	
	static public StartFrame _oPlayFrame = null;
	
	public StartFrame()
	{
		super("Roulette");	
		_oPlayFrame = this;
		setSize(500, 500);
		setLayout(null);
		
		// Icon setzen
	    BufferedImage image = null;
		try {
			image = ImageIO.read(this.getClass().getResource("/Resources/")); // Bild einfügen (ICON)
		} catch (IOException e) {
			e.printStackTrace();
		}
	    setIconImage(image);
	    
	    getContentPane().setBackground(Color.white);		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//setExtendedState(this.MAXIMIZED_BOTH);  
		setVisible(true);

		drawElements();		
	}
	
	public void drawElements()
	{
		setMenuBar(new StartMenuBar(this));
		
		StartButtons startButtons = new StartButtons(this);
		
		startButtons.setBounds(0, 0, 500, 400);
		startButtons.setOpaque(false);
		add(startButtons);
		
		this.refreshWindow();
	}
	
	public static void refreshWindow()
	{
		_oPlayFrame.validate();
		_oPlayFrame.repaint();
	}

}
