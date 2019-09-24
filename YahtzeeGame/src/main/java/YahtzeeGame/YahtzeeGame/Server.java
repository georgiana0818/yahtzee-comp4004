package YahtzeeGame.YahtzeeGame;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
	private ServerSocket socket;
	private Socket clientSocket;
	private int port = 8281;
	private ClientHandler player1,player2,player3;
	private int numOfPlayers;
	private String player1Board, player2Board, player3Board;
	private String scoreBoard1, scoreBoard2, scoreBoard3;
	private int player1Score, player2Score, player3Score;
	private int count = 0;
	
	
	
	public Server() {
		numOfPlayers = 0;
		try {
			socket = new ServerSocket(port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(){
		System.out.println("Yahtzee Game Engine has starting, Waiting for players to join ...");
		
		try {
			while(numOfPlayers < 3) {
				clientSocket = socket.accept();
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
	
	private class ClientHandler implements Runnable{
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
					player1Board = (String) ois.readObject();
				}else if(playerID == 2) {
					player2Board = (String) ois.readObject();
				}else {
					player3Board = (String) ois.readObject();
				}
				count++;
				
				waitMsg();
				
				if(count == 3) {
					if(playerID == 1) {
						//oos.writeObject("Ready Player One?");
						//ois.readObject();
						System.out.println("The game is starting");
						sendScoreboard(player1Board,player2Board,player3Board);
						oos.writeObject("your turn");
						oos.flush();
					}else if(playerID == 2) {
						//player1.oos.writeObject("Ready Player One?");
						//player1.ois.readObject();
						System.out.println("The game is starting");
						sendScoreboard(player1Board,player2Board,player3Board);
						player1.notifyPlayer();
						
					}else {
						//player1.oos.writeObject("Ready Player One?");
						//player1.ois.readObject();
						System.out.println("The game is starting");
						sendScoreboard(player1Board,player2Board,player3Board);
						player1.notifyPlayer();
						
					}
					
				}
			
				while(round < 13) {
					 
					received = (String) ois.readObject();//tell server turn end
					System.out.println("Player " + playerID + " has completed their turn");
				
					round++;
					if(playerID == 1) {
						player1Board = (String) ois.readObject();
						player1Score = (Integer) ois.readObject();
						player2.notifyPlayer();
					}else if(playerID == 2) {
						player2Board = (String) ois.readObject();
						player2Score = (Integer) ois.readObject();
						player3.notifyPlayer();
					}else {
						player3Board = (String) ois.readObject();
						player3Score = (Integer) ois.readObject();
						System.out.println("Round " + round + " is completed.\n");
						sendScoreboard(player1Board,player2Board,player3Board);
						if(round != 13) {
							player1.notifyPlayer();
						}else {
							System.out.println("\nGame Complete");
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
				ex.printStackTrace();
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
		
		public void waitMsg() throws IOException {
			if(count == 2) {
				player1.oos.writeObject(count);
				player2.oos.writeObject(count);
				player3.oos.writeObject(count);
				if(playerID == 1) {
					if(player2.playerName=="") {
						oos.writeObject("Waiting for player " + player2.playerID + " to start the game");
						player2.oos.writeObject("");
						player3.oos.writeObject("Waiting for player " + player2.playerID + " to start the game");
					}
					else {
						oos.writeObject("Waiting for player " + player3.playerID + " to start the game");
						player3.oos.writeObject("");
						player2.oos.writeObject("Waiting for player " + player2.playerID + " to start the game");
					}
				}else if(playerID == 2) {
					if(player1.playerName=="") {
						oos.writeObject("Waiting for player " + player1.playerID + " to start the game");
						player1.oos.writeObject("");
						player3.oos.writeObject("Waiting for player " + player1.playerID + " to start the game");
					}
					else {
						oos.writeObject("Waiting for player " + player3.playerID + " to start the game");
						player3.oos.writeObject("");
						player1.oos.writeObject("Waiting for player " + player3.playerID + " to start the game");
					}
				}else {
					if(player2.playerName=="") {
						oos.writeObject("Waiting for player " + player2.playerID + " to start the game");
						player2.oos.writeObject("");
						player1.oos.writeObject("Waiting for player " + player2.playerID + " to start the game");
					}
					else {
						oos.writeObject("Waiting for player " + player1.playerID + " to start the game");
						player1.oos.writeObject("");
						player2.oos.writeObject("Waiting for player " + player1.playerID + " to start the game");
					}
				}
			}
		}
		
		public void sendScoreboard(String p1, String p2, String p3) {
			scoreBoard1 = player1Board + player2Board + player3Board;
			scoreBoard2 = player2Board + player3Board + player1Board;
			scoreBoard3 = player3Board + player1Board + player2Board;
			try {
				player1.oos.writeObject(scoreBoard1);
				player2.oos.writeObject(scoreBoard2);
				player3.oos.writeObject(scoreBoard3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void checkWinner() {
			String msg;
			if(player1Score > player2Score && player1Score > player3Score) {
				msg = "Congratulations, " + player1.playerName + " has won the game with a score of "
					 + player1Score + " points!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
					 + "\n\nSo Long, And Thanks For All The Fish!";
			}else if(player2Score > player1Score && player2Score > player3Score) {
				msg = "Congratulations, " + player2.playerName + " has won the game with a score of "
						 + player2Score + " points!!!!!\nGreat game everyone, and thanks for playing. Goodbye."
						 + "\n\nSo Long, And Thanks For All The Fish!";
			}else if(player3Score > player1Score && player3Score > player2Score) {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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


	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException{
		Server server = new Server();
		server.start();
		server.socket.close();
	}
}
	
	
	