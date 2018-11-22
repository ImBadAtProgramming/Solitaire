package Solitaire;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class CardPic {
	
	private int numSuits = 4;
	private int numPoints = 13;
	private char suits[] = {'c','d','h','s'};
	private String base = "src/Solitaire/Deck/";
	private ArrayList<ArrayList<Image>> images = new ArrayList<ArrayList<Image>>();
	
	public void LoadPics() {
			
		for (int suit = 0; suit < numSuits; suit++) {
			
			ArrayList<Image> rankImages = new ArrayList<Image>();
			
			for (int point = 0; point < numPoints; point++) {
				
				String fileName = String.format("%s%d%c.png", base, point, suits[suit]);
				
				
				try {
					Image image = ImageIO.read(new FileInputStream(fileName));
					rankImages.add(image);
				} catch (FileNotFoundException e) {
					
					System.out.println("Filename not found: " + fileName);
					e.printStackTrace();
					
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			images.add(rankImages);
		}
		
	}
	public Image getImage(int suit, int rank) {
		return images.get(suit).get(rank);
	}
}
