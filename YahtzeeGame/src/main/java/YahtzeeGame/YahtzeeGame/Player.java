package YahtzeeGame.YahtzeeGame;

public class Player {
	
	private String playerName;
	private int score;
	
	public Player(String name) {
		playerName = name;
		score = 0;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public int getCurrentScore() {
		return score;
	}
	
	public void setScore(int currentScore) {
		score = currentScore;
	}
	
	public void showScoreBoard() {
		
	}
}
