package Solitaire;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Table extends JComponent{
	private static final long serialVersionUID = 1L;
	
	public static int height = 800;
	public static int width = 1000;
	private CardPic cardPic;
	
	public Table(CardPic cardPic) {
		this.setPreferredSize(new Dimension(width, height));
		this.cardPic = cardPic;
	}
	
	public void paintComponent(Graphics g){	
        super.paintComponent(g); 
        g.drawImage(cardPic.getImage(0,0), 0, 0, 100, 100, null);
	}
}
