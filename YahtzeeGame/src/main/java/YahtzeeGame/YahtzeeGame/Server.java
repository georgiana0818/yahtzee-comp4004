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

	}
	
	private class ClientHandler implements Runnable{
		private Socket socket;
		private ObjectOutputStream oos;
		private ObjectInputStream ois;
		private int playerID;

		
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
			
	
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
