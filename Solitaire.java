package Solitaire;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.BoxLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solitaire {

	JFrame frame;
	JPanel mainPanel;
	JPanel topPanel;
	JPanel tablePanel;
	JPanel botPanel;
	private CardPic cardPic;
	
	public Solitaire() {
		cardPic = new CardPic();
		cardPic.LoadPics();
	}
	public void createFrame() {
		frame = new JFrame("Solitaire");
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		
		topPanel = new JPanel(new FlowLayout());
		mainPanel.add(topPanel);
		
		tablePanel = new JPanel();
		tablePanel.add(new Table(cardPic));
		tablePanel.setBackground(Color.darkGray);
		mainPanel.add(tablePanel);
		
		botPanel = new JPanel(new FlowLayout());
		mainPanel.add(botPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainPanel);
		
		frame.pack();
	    frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

