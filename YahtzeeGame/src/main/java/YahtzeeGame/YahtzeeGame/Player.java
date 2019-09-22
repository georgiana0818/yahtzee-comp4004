package YahtzeeGame.YahtzeeGame;

public class Player {
	
	private String playerName;
	private int totalscore;
	private int ones, twos, threes, fours, fives, sixs;
	private int bonus;
	private int largeStraight, smallStraight;
	private int fullHouse;
	private int threeKind, fourKind;
	private int chance;
	private int yahtzee;
	
	private int upperScore = 0;
	private int lowerScore = 0;
	
	public Player(String name) {
		playerName = name;
		totalscore = 0;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public int getCurrentScore() {
		return totalscore;
	}
	
	public void setScore(int currentScore) {
		totalscore = currentScore;
	}
	
	public void setUpperScore(int us) {
		upperScore = us;
	}
	
	public int getUpperScore() {
		return upperScore;
	}
	
	public void setYahtzee(int yahtzee) {
		this.yahtzee = yahtzee;
	}
	
	public int getYahtzee() {
		return yahtzee;
	}
	
	public void setOnes(int ones) {
		this.ones = ones;
	}
	
	public int getOnes() {
		return ones;
	}
	
	
}
