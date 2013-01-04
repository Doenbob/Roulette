package Gui;

import Gui.StartFrame;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenuBar extends MenuBar{
	
	private StartFrame playFrame;
	
	public StartMenuBar(StartFrame frame){
		
		Menu menu;
		playFrame = frame;
		playFrame.getContentPane().setBackground(Color.white);
		
		// Datei
		menu = new Menu("Datei");
		
		// Datei - Beenden
		MenuItem beenden = new MenuItem("Beenden");
		beenden.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {	
				playFrame.dispose();
			}
			
		});
		
		// Schaltfläche Datei hinzufügen
		menu.add(beenden);
		add(menu);
		
		// Info
		menu = new Menu("Info");
		
		// Info - Impressum
		MenuItem impressum = new MenuItem("Impressum");
		impressum.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
								
			}
			
		});
		
		// Schaltfläche Datei hinzufügen
		menu.add(impressum);
		add(menu);
		
	}

}
