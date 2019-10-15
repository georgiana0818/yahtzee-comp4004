package YahtzeeGame.YahtzeeGame;

public class Player {
	
	private String playerName;
	private int totalscore;
	private int ones, twos, threes, fours, fives, sixs;
	private int bonus;
	private int largeStraight, smallStraight;
	private int FullHouse;
	private int threeKind, fourKind;
	private int chance;
	private int Yahtzee;
	
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
	
	public void setOnes(int ones) {
		this.ones = ones;
	}
	
	public void showScoreBoard() {
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("| Name: "+playerName+"          |Current Score: " + totalscore + "        | Current Round : ");
	}
}
