package YahtzeeGame.YahtzeeGame;

import java.util.Random;

public class Dice {
	private int faceValue;
	
	public Dice() {
		
	}
	
	public void roll() {
		Random ran = new Random();
		faceValue = 1 + ran.nextInt(6 - 1 + 1);
	}
	
	public int getFaceValue() {
		return faceValue;
	}
}