package Solitaire;

import java.awt.Graphics;
import java.awt.Image;

public class card {
	
	private int suit;
	private int rank;
	private CardPic cardPic;

	public card (CardPic cardPic, int cardRank, int cardSuit) {
		
		this.cardPic = cardPic;
		rank = cardRank;
		suit = cardSuit;

	}
	
	public int suit() {
		return suit;
	}
	
	public int rank() {
		return rank;
	}

	public Image getImage() {
		return cardPic.getImage(suit, rank);
	}

	public void draw(Graphics g) {
        g.drawImage(cardPic.getImage(0,0), 0, 0, 100, 100, null);
	}
}
