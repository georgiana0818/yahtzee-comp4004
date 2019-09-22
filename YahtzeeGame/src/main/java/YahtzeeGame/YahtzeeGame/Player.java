package YahtzeeGame.YahtzeeGame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Player {
	
	private String playerName;
	private int playerID;
	private int ones, twos, threes, fours, fives, sixs;
	private int largeStraight, smallStraight;
	private int fullHouse;
	private int threeKind, fourKind;
	private int chance;
	private int yahtzee;
	
	private boolean hasOnes = false, hasTwos = false, hasThrees = false, 
			hasFours = false, hasFives = false, hasSixs = false;
	private boolean hasLS = false, hasSS = false;
	private boolean hasFH = false;
	private boolean hasTK = false, hasFK = false;
	private boolean hasChance = false;
	private boolean hasYaht = false;
	
	private int upperBonus;
	private int additionYahtzee; 
	private int upperScore = 0;
	private int lowerScore = 0;
	private int totalscore;
	
	private Client client;
	private Scanner scan;
	
	public Player() {
		totalscore = 0;
		scan = new Scanner(System.in);
	}
	
	public void setPlayerName() {
		String input = scan.nextLine();
		playerName = input;
		client.sendObject(playerName);
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
		hasOnes = true;
	}
	
	public int getOnes() {
		return ones;
	}
	
	public boolean checkOnes() {
		return hasOnes;
	}
	
	public void setTwos(int twos) {
		this.twos = twos;
		hasTwos = true;
	}
	
	public int getTwos() {
		return twos;
	}
	
	public boolean checkTwos() {
		return hasTwos;
	}
	
	public void setThrees(int threes) {
		this.threes = threes;
		hasThrees = true;
	}
	
	public int getThrees() {
		return threes;
	}
	
	public boolean checkThrees() {
		return hasThrees;
	}
	
	public void setFours(int fours) {
		this.fours = fours;
		hasFours = true;
	}
	
	public int getFours() {
		return fours;
	}
	
	public boolean checkFours() {
		return hasFours;
	}
	
	public void setFives(int fives) {
		this.fives = fives;
		hasFives = true;
	}
	
	public int getFives() {
		return fives;
	}
	
	public boolean checkFives() {
		return hasFives;
	}
	
	public void setSixs(int sixs) {
		this.sixs = sixs;
		hasSixs = true;
	}
	
	public int getSixs() {
		return sixs;
	}
	
	public boolean checkSixs() {
		return hasSixs;
	}
	
	public void setThreeKind(int tk) {
		threeKind = tk;
		hasTK = true;
	}
	
	public int getThreeKind() {
		return threeKind;
	}
	
	public boolean checkThreeKind() {
		return hasTK;
	}
	
	public void setFourKind(int fk) {
		fourKind = fk;
		hasFK = true;
	}
	
	public int getFourKind() {
		return fourKind;
	}
	
	public boolean checkFourKind() {
		return hasFK;
	}
	
	public void setFullHouse(int fh) {
		fullHouse = fh;
		hasFH = true;
	}
	
	public int getFullHouse() {
		return fullHouse;
	}
	
	public boolean checkFullHouse() {
		return hasFH;
	}
	
	public void setSmallStraight(int ss) {
		smallStraight = ss;
		hasSS = true;
	}
	
	public int getSmallStraight() {
		return smallStraight;
	}
	
	public boolean checkSmallStraight() {
		return hasSS;
	}
	
	public void setLargeStraight(int ls) {
		largeStraight = ls;
		hasLS = true;
	}
	
	public int getLargeStraight() {
		return largeStraight;
	}
	
	public boolean checkLargeStraight() {
		return hasLS;
	}
	
	public void setYahtzee(int yz) {
		yahtzee = yz;
		hasYaht = true;
	}
	
	public int getYahtzee() {
		return yahtzee;
	}
	public boolean checkYahtzee() {
		return hasYaht;
	}
	
	public void setAdditionYahtzee(int addtionYahtzee) {
		this.additionYahtzee += additionYahtzee;
	}
	
	public int getAdditionYahtzee() {
		return additionYahtzee;
	}
	
	public void setChance(int cc) {
		chance = cc;
		hasChance = true;
	}
	
	public int getChance() {
		return chance;
	}

	public boolean checkChance() {
		return hasChance;
	}
	
	public void connectToServer() {
		client = new Client();
	}
	
	public void start() {
		connectToServer();
		setPlayerName();
		
		/*while((Integer) client.receiveObject()!= 3) {
			client.sendObject("wait");
			System.out.println("Wait for the other players");
		}
		
		client.sendObject("Start");*/
		String msg =  (String) client.receiveObject();//display score board
		System.out.println(msg);
		
		
		
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
	

