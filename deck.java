package Solitaire;

import java.util.List;
import java.util.ArrayList;

public class deck {

	private List<card> cards;
	private int size;
	
	public deck(int[] ranks, int[] suits {
		cards = new ArrayList<card>();
		size = 0;
		
		for (int rankpos = 0; rankpos < ranks.length; rankpos++) {
			for (int suitpos = 0; suitpos < suits.length; suitpos++) {
				card card = new card(ranks[rankpos], suit,);
				cards.add(card);
				size++;
			}
		}
	}
	
	public void readDeck() {
		for (int cardNum = size - 1; cardNum > -1; cardNum--) {
			System.out.print("");
		}
	}
}
