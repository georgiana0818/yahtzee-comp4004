package YahtzeeGame.YahtzeeGame;

import java.io.*;
import java.net.*;


public class Server {
	private ServerSocket ssocket;
	private Socket clientSocket;
	private int port = 8281;
	private ClientHandler player1,player2,player3;
	private int numOfPlayers;
	private Score player1Score, player2Score, player3Score;
	private Score[] scoreBoard1 = new Score[3];
	private Score[] scoreBoard2 = new Score[3];
	private Score[] scoreBoard3 = new Score[3];
	private int count = 0;

	public Server() {
		numOfPlayers = 0;
		try {
			ssocket = new ServerSocket(port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(){
		System.out.println("Yahtzee Game Engine has starting, Waiting for players to join ...");
		
		try {
			while(numOfPlayers < 3) {
				clientSocket = ssocket.accept();
				numOfPlayers++;
				ClientHandler ch = new ClientHandler(clientSocket,numOfPlayers);
				if(numOfPlayers == 1) {
					player1 = ch;
				}else if(numOfPlayers == 2) {
					player2 = ch;
				}else {
					player3 = ch;
				}
				Thread t = new Thread(ch);
				t.start();
			}
			
		} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
	
	public void closeServer() {
		try {
			ssocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 class ClientHandler implements Runnable{
		private Socket socket;
		private ObjectOutputStream oos;
		private ObjectInputStream ois;
		private int playerID;
		private String playerName ="";
		private String received;
		private int round = 0;
		
		public ClientHandler(Socket s, int id) {
			socket = s;
			playerID = id;
			playerName = "";
			try {
				oos = new ObjectOutputStream(socket.getOutputStream());
				ois = new ObjectInputStream(socket.getInputStream());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}

		public void run() {
			
			try {
				oos.writeObject(playerID);			
				oos.flush();
				playerName = (String) ois.readObject();
				
				System.out.println(playerName + " has entered the lobby");
				if(playerID == 1) {
					player1Score = (Score) ois.readObject();
					
				}else if(playerID == 2) {
					player2Score = (Score) ois.readObject();
					
				}else if(playerID==3) {
					player3Score = (Score) ois.readObject();
		
				}
				count++;

				//waitMsg();
				
				if(count == 3) {
					if(playerID == 1) {
						player1.oos.writeObject("Ready Player One?");
					}else if(playerID == 2) {					
						player1.oos.writeObject("Ready Player One?");
					}else {
						player1.oos.writeObject("Ready Player One?");
					}
				}
				
				if(playerID == 1) {
					System.out.println(ois.readObject());
					sendScoreboard(player1Score,player2Score,player3Score);
					oos.writeObject("your turn");
				}
				
				while(round < 13) {
					received = (String) ois.readObject();//tell server turn end
					System.out.println("Player " + playerID + " has completed their turn");
					
					
					round++;
					
					if(playerID == 1) {
						player1Score = (Score) ois.readObject();
						//send score board to each player. here need to update code
						sendScoreboard(player1Score,player2Score,player3Score);
						player2.notifyPlayer();
					}else if(playerID == 2) {
						player2Score = (Score) ois.readObject();
						//player2Score = (Integer) ois.readObject();
						//send score board to each player. here need to update code
						sendScoreboard(player1Score,player2Score,player3Score);
						player3.notifyPlayer();
					}else {
						player3Score = (Score) ois.readObject();
						//player3Score = (Integer) ois.readObject();
						System.out.println("Round " + round + " is completed.\n");
						sendScoreboard(player1Score,player2Score,player3Score);
						if(round != 13) {
							player1.notifyPlayer();
						}else {
							System.out.println("\nGame Complete");
							//receive all player current score here
							checkWinner();
						}
					}
					
					if(round==13) {
						received = (String) ois.readObject();
					}
					
				}
				ois.close();
				oos.close();
				closeConnection();
			}catch(IOException ex) {
				//ex.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void notifyPlayer() {
			try {
				oos.writeObject("your turn");
				oos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		
		public void sendScoreboard(Score ps1, Score ps2, Score ps3) {
			scoreBoard1[0] = ps1;
			scoreBoard1[1] = ps2;
			scoreBoard1[2] = ps3;
			
			scoreBoard2[0] = ps2;
			scoreBoard2[1] = ps3;
			scoreBoard2[2] = ps1;
			
			scoreBoard3[0] = ps3;
			scoreBoard3[1] = ps1;
			scoreBoard3[2] = ps2;
		
			try {
				player1.oos.writeObject(scoreBoard1);
				player1.oos.flush();
				player1.oos.reset();
				player2.oos.writeObject(scoreBoard2);
				player2.oos.flush();
				player2.oos.reset();
				player3.oos.writeObject(scoreBoard3);
				player3.oos.flush();
				player3.oos.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		public void checkWinner() {
			String msg;
			if(player1Score.getCurrentScore() > player2Score.getCurrentScore() && player1Score.getCurrentScore() > player3Score.getCurrentScore()) {
				msg = "Congratulations, " + player1.playerName + " has won the game with a score of "
					 + player1Score + " points!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
					 + "\n\nSo Long, And Thanks For All The Fish!";
			}else if(player2Score.getCurrentScore() > player1Score.getCurrentScore() && player2Score.getCurrentScore() > player3Score.getCurrentScore()) {
				msg = "Congratulations, " + player2.playerName + " has won the game with a score of "
						 + player2Score + " points!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
						 + "\n\nSo Long, And Thanks For All The Fish!";
			}else if(player3Score.getCurrentScore() > player1Score.getCurrentScore() && player3Score.getCurrentScore() > player2Score.getCurrentScore()) {
				msg = "Congratulations, " + player3.playerName + " has won the game with a score of "
						 + player3Score + " points!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
						 + "\n\nSo Long, And Thanks For All The Fish!";
			}else {
				msg = "Congratulations, you guys get a draw!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
						 + "\n\nSo Long, And Thanks For All The Fish!";
			}
			
			try {
				player1.oos.writeObject(msg);
				player2.oos.writeObject(msg);
				player3.oos.writeObject(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public void closeConnection() {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException{
		Server server = new Server();
		server.start();
		server.closeServer();
	}
}
	
	
	