package YahtzeeGame.YahtzeeGame;

public class Player {
	
	private String playerName;
<<<<<<< Updated upstream
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
=======
	private int playerID;
	
	private Score score;
	private int currentRound;
	
	private Client client;
	private Game game;
	private Score[] allPlayerScore;
	private UI ui;
	private String status = "wait";
	
	public Player() {
		currentRound = 0;
		score = new Score(playerID);
		score.setCurrentRound(currentRound);
		ui = new UI();
	}
	
	public void setPlayerName(InputAsker asker) {
		String msg = "Welcome Player" + playerID +", Please enter you name:"; 
		playerName = asker.ask(msg);
		score.setName(playerName);
		
>>>>>>> Stashed changes
	}

	public String getPlayerName() {
		return playerName;
	}
	
<<<<<<< Updated upstream
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
=======
	public int getCurrentRound() {
		return currentRound;
	}
	
	public Score getScore() {
		return score;
	}
	
	public Score[] getAllplayerScore() {
		return allPlayerScore;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

	public void connectToServer() {
		client = new Client();
	}
	
	public Client getClient() {
		return client;
	}
	
	public void start(InputAsker asker) {
		connectToServer();
		setPlayerName(asker);
		client.sendObject(playerName);
		client.sendObject(score);
		
		if(playerID!=1)
			System.out.println("Waiting for Player 1 to start game");//display waiting
		
		if(playerID == 1) {
			asker.ask((String)client.receiveObject());
			client.sendObject("The game is starting");
		}

		
		allPlayerScore = (Score[]) client.receiveObject();//display score board
		for(int i = 0; i < allPlayerScore.length;i++) {
			System.out.println(ui.showScoreBoard(allPlayerScore[i]));
		}
		
		if(playerID != 1){
			allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
		     for(int i = 0; i < allPlayerScore.length;i++) {
					System.out.println(ui.showScoreBoard(allPlayerScore[i]));
				}
		}
		
		if(playerID == 3){
			allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
		     for(int i = 0; i < allPlayerScore.length;i++) {
					System.out.println(ui.showScoreBoard(allPlayerScore[i]));
				}		 
		}
		
		String msg = (String) client.receiveObject();//receive turn start sign
		if(msg.equals("your turn")) {
			status = "play";
			game = new Game(this);
			try {
				while(currentRound < 13) {
					game.start();
					currentRound++;
					score.setCurrentRound(currentRound);
					status = "wait";
					client.sendObject("done");
					client.sendObject(score);
					allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
				     for(int i = 0; i < allPlayerScore.length;i++) {
							System.out.println(ui.showScoreBoard(allPlayerScore[i]));
						}	
					if(currentRound != 13) {
						//receive score board again implement need
						
						allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
					     for(int i = 0; i < allPlayerScore.length;i++) {
								System.out.println(ui.showScoreBoard(allPlayerScore[i]));
							}	
						 
					  	 
						
					     allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
					     for(int i = 0; i < allPlayerScore.length;i++) {
								System.out.println(ui.showScoreBoard(allPlayerScore[i]));
						 }	
							client.receiveObject();//receive turn start sign
							status = "play";
						
					}else {
						if(playerID != 3) {
							allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
						     for(int i = 0; i < allPlayerScore.length;i++) {
									System.out.println(ui.showScoreBoard(allPlayerScore[i]));
							 }
						}
						if(playerID == 1) {
							allPlayerScore = (Score[])client.receiveObject();//display score board except player 1
						     for(int i = 0; i < allPlayerScore.length;i++) {
									System.out.println(ui.showScoreBoard(allPlayerScore[i]));
							 }
						}
						msg = (String) client.receiveObject();//receive game result
						System.out.println(msg);
						client.sendObject("end");
					}
				}
				
				client.ois.close();
				client.oos.close();
				client.closeConnection();
			} catch (IOException e) {
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
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		public void sendObject(Object o) {
			try {
				oos.writeObject(o);
				oos.flush();
				oos.reset();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public Object receiveObject() {
			Object o = "";
			try {
				 o = ois.readObject();
				 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return o;
		}
		
		public void closeConnection() {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Player p = new Player();
		p.start(new InputAsker(System.in, System.out));
>>>>>>> Stashed changes
	}
}
