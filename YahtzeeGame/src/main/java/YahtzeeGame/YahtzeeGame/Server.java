package YahtzeeGame.YahtzeeGame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket socket;
	private Socket clientSocket;
	private int port = 8281;
	private ClientHandler player1,player2,player3;
	private int numOfPlayers;

	public Server() {
		numOfPlayers = 0;
		try {
			socket = new ServerSocket(port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start() {
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
			System.out.println("We have 3 players. No more player can join in.");
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

		
		public ClientHandler(Socket s, int id) {
			socket = s;
			playerID = id;
			
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
				
			}catch(IOException ex) {
				ex.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		server.start();
	}

}
