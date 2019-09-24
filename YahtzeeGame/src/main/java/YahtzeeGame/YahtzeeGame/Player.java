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
	private boolean hasBonus = false;

	private int additionYahtzee; 
	private int upperBonus;
	private int upperScore = 0;
	private int currentScore;
	
	private int currentRound;
	
	private Client client;
	private Scanner scan;
	private Game game;
	private UI ui;
	
	public Player() {
		currentScore = 0;
		currentRound = 0;
		scan = new Scanner(System.in);
		ui = new UI();
	}
	
	public void setPlayerName() {
		String input = scan.nextLine();
		playerName = input;
		client.sendObject(playerName);
		client.sendObject(ui.showScoreBoard(this));
	}

	public String getPlayerName() {
		return playerName;
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
	
	public String input() {
		return scan.nextLine();
	}

	public void setOnes(int ones) {
		this.ones = ones;
		hasOnes = true;
		setUpperScore(this.ones);
		setCurrentScore(this.ones);
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
		setUpperScore(this.twos);
		setCurrentScore(this.twos);
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
		setUpperScore(this.threes);
		setCurrentScore(this.threes);
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
		setUpperScore(this.fours);
		setCurrentScore(this.fours);
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
		setUpperScore(this.fives);
		setCurrentScore(this.fives);
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
		setUpperScore(this.sixs);
		setCurrentScore(this.sixs);
	}
	
	public int getSixs() {
		return sixs;
	}
	
	public boolean checkSixs() {
		return hasSixs;
	}
	
	public void setBonus(int bonus) {
		upperBonus = bonus;
		hasBonus = true;
	}
	
	public int getBonus() {
		return upperBonus;
	}
	
	public boolean checkBonus() {
		return hasBonus;
	}
	
	public void setThreeKind(int tk) {
		threeKind = tk;
		hasTK = true;
		setCurrentScore(this.threeKind);
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
		setCurrentScore(this.fourKind);
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
		setCurrentScore(this.fullHouse);
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
		setCurrentScore(this.smallStraight);
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
		setCurrentScore(this.largeStraight);
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
		 setCurrentScore(this.yahtzee);
	}
	
	public int getYahtzee() {
		return yahtzee;
	}
	public boolean checkYahtzee() {
		return hasYaht;
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
		hasChance = true;
		setCurrentScore(this.chance);
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
		
		client.receiveObject(); 
		System.out.println(client.receiveObject());//display waiting
		
		if(playerID == 1) {
			System.out.println(client.receiveObject());
			input();
			client.sendObject("The game is starting");
		}
	

		String board = (String) client.receiveObject();//display score board
		System.out.println(board);
		
		
		
		String msg = (String) client.receiveObject();//receive turn start sign
		if(msg.equals("your turn")) {
			game = new Game(this);
			try {
				while(currentRound < 13) {
					game.start();
					currentRound++;
					client.sendObject("done");
					client.oos.flush();
					client.sendObject(ui.showScoreBoard(this));
					client.oos.flush();
					client.sendObject(currentScore);//send currentScore
					client.oos.flush();
					msg = (String) client.receiveObject();//receive score board
					System.out.println(msg);
					if(currentRound != 13) {
						client.receiveObject();//receive turn start sign
					}else {
						msg = (String) client.receiveObject();//receive game result
						System.out.println(msg);
						client.sendObject("end");
					}
				}
				
				scan.close();
				client.ois.close();
				client.oos.close();
				client.closeConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
		
		public void closeConnection() {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Player p = new Player();
		p.start();
	}
}
	

