package YahtzeeGame.YahtzeeGame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Player {
	
	private String playerName;
	private int playerID;
	private int totalscore;
	private int ones, twos, threes, fours, fives, sixs;
	private boolean hasOnes = false, hasTwos = false, hasThree = false, 
					hasFours = false, hasFives = false, hasSixs = false;
	private int bonus;
	private int largeStraight, smallStraight;
	private boolean hasLS = false, hasSS = false;
	private int fullHouse;
	private boolean hasFH = false;
	private int threeKind, fourKind;
	private boolean hasTK = false, hasFK = false;
	private int chance;
	private boolean hasChance = false;
	private int yahtzee;
	private boolean hasYaht = false;
	
	private int upperScore = 0;
	private int lowerScore = 0;
	
	public Player() {
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

	public void setOnes(int ones) {
		this.ones = ones;
		
	}
	
	public int getOnes() {
		return ones;
	}
	public void setTwos(int twos) {
		this.twos = twos;
	}
	
	public int getTwos() {
		return twos;
	}
	
	public void setThrees(int threes) {
		this.threes = threes;
	}
	
	public int getThrees() {
		return threes;
	}
	
	public void setFours(int fours) {
		this.fours = fours;
	}
	
	public int getFours() {
		return fours;
	}
	
	public void setFives(int fives) {
		this.fives = fives;
	}
	
	public int getFives() {
		return fives;
	}
	
	public void setSixs(int sixs) {
		this.sixs = sixs;
	}
	
	public int getSixs() {
		return sixs;
	}
	
	public void setThreeKind(int tk) {
		threeKind = tk;
	}
	
	public int getThreeKind() {
		return threeKind;
	}
	
	public void setFourKind(int fk) {
		fourKind = fk;
	}
	
	public int getFourKind() {
		return fourKind;
	}
	
	public void setFullHouse(int fh) {
		fullHouse = fh;
	}
	
	public int getFullHouse() {
		return fullHouse;
	}
	
	public void setSmallStraight(int ss) {
		smallStraight = ss;
	}
	
	public int getSmallStraight() {
		return smallStraight;
	}
	
	public void setLargeStraight(int ls) {
		largeStraight = ls;
	}
	
	public int getLargeStraight() {
		return largeStraight;
	}
	
	public void setYahtzee(int yz) {
		yahtzee = yz;
	}
	
	public int getYahtzee() {
		return yahtzee;
	}
	
	public void setChance(int cc) {
		chance = cc;
	}
	
	public int getChance() {
		return chance;
	}
	class Client{
		private Socket socket;
		private InetAddress host;
		private ObjectOutputStream oos;
		private ObjectInputStream ois;
		
		
		public Client() {
			try {
				host = InetAddress.getLocalHost();
				socket = new Socket(host,8281);
				oos = new ObjectOutputStream(socket.getOutputStream());
				ois = new ObjectInputStream(socket.getInputStream()); 
		        playerID = (Integer) ois.readObject();
		        System.out.println("Welcome Player" + playerID +", Please enter you name:");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void sendObject(Object o) {
			try {
				oos.writeObject(o);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public Object receiveObject() {
			Object o = "";
			try {
				 o = ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return o;
		}
	}
	
	public static void main(String[] args) {
		Player p = new Player();
		p.start();
	}
}
	

