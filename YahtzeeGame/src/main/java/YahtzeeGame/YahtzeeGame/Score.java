package YahtzeeGame.YahtzeeGame;

import java.io.Serializable;


public class Score implements Serializable{
	private String  playerName;
	private int playerID;
	
	
	private int ones = -1,twos = -1, threes = -1, fours = -1, fives = -1, sixs = -1;
	private int largeStraight = -1, smallStraight = -1;
	private int fullHouse = -1;
	private int threeKind = -1, fourKind = -1;
	private int chance = -1;
	private int yahtzee = -1;

	private int additionYahtzee; 
	private int upperBonus = -1;
	private int upperScore = 0;
	private int currentScore = 0;
	
	private int currentRound;
	
	public Score(int ID) {
		playerID = ID;
	
	}
	
	public void setName(String name) {
		playerName = name;
	}
	public String getName() {
		return playerName;
	}
	
	public int getID() {
		return playerID;
	}
	
	public void setCurrentRound(int round) {
		currentRound = round;
	}
	
	public int getCurrentRound() {
		return currentRound;
	}
	
	public void setCurrentScore(int score) {
		currentScore += score;
	}
	
	public int getCurrentScore() {
		return currentScore;
	}
	
	public void setUpperScore(int us) {
		upperScore += us;
	}
	
	public int getUpperScore() {
		return upperScore;
	}

	public void setOnes(int ones) {
		this.ones = ones;
		setUpperScore(this.ones);
		setCurrentScore(this.ones);
	}
	
	public int getOnes() {
		return ones;
	}
	
	public void setTwos(int twos) {
		this.twos = twos;
		setUpperScore(this.twos);
		setCurrentScore(this.twos);
	}
	
	public int getTwos() {
		return twos;
	}
	
	public void setThrees(int threes) {
		this.threes = threes;
		setUpperScore(this.threes);
		setCurrentScore(this.threes);
	}
	
	public int getThrees() {
		return threes;
	}
	
	public void setFours(int fours) {
		this.fours = fours;
		setUpperScore(this.fours);
		setCurrentScore(this.fours);
	}
	
	public int getFours() {
		return fours;
	}
	
	public void setFives(int fives) {
		this.fives = fives;
		setUpperScore(this.fives);
		setCurrentScore(this.fives);
	}
	
	public int getFives() {
		return fives;
	}
	
	public void setSixs(int sixs) {
		this.sixs = sixs;
		setUpperScore(this.sixs);
		setCurrentScore(this.sixs);
	}
	
	public int getSixs() {
		return sixs;
	}
	
	public void setBonus(int bonus) {
		upperBonus = bonus;
	}
	
	public int getBonus() {
		return upperBonus;
	}
	
	public void setThreeKind(int tk) {
		threeKind = tk;
		setCurrentScore(this.threeKind);
	}
	
	public int getThreeKind() {
		return threeKind;
	}
	
	public void setFourKind(int fk) {
		fourKind = fk;
		setCurrentScore(this.fourKind);
	}
	
	public int getFourKind() {
		return fourKind;
	}
	
	public void setFullHouse(int fh) {
		fullHouse = fh;
		setCurrentScore(this.fullHouse);
	}
	
	public int getFullHouse() {
		return fullHouse;
	}

	
	public void setSmallStraight(int ss) {
		smallStraight = ss;
		setCurrentScore(this.smallStraight);
	}
	
	public int getSmallStraight() {
		return smallStraight;
	}
	
	public void setLargeStraight(int ls) {
		largeStraight = ls;
		setCurrentScore(this.largeStraight);
	}
	
	public int getLargeStraight() {
		return largeStraight;
	}
	
	public void setYahtzee(int yz) {
		 yahtzee = yz;
		 setCurrentScore(this.yahtzee);
	}
	
	public int getYahtzee() {
		return yahtzee;
	}
	
	public void setAdditionYahtzee() {
		this.additionYahtzee += 100;
		setCurrentScore(100);
	}
	
	public int getAdditionYahtzee() {
		return additionYahtzee;
	}
	
	public void setChance(int cc) {
		chance = cc;
		setCurrentScore(this.chance);
	}
	
	public int getChance() {
		return chance;
	}
	
	public String toString() {
        return "Score [playerName=" + playerName + ", playerID=" + playerID
                +", currentRound=" + currentRound +"]";
	}
}
