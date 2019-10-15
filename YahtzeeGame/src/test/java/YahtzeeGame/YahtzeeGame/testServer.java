package YahtzeeGame.YahtzeeGame;

import static org.mockito.Mockito.mock;



import cucumber.api.java.en.*;

public class testServer {

	Server server;

	@Given("I start server")
	public void i_start_server() {
	    server = new Server();
	    server.start();
	}

	@Then("check player one join game")
	public void check_player_one_join_game() {
	    
	}

	@Then("check player two join game")
	public void check_player_two_join_game() {
	    
	}

	@Then("check player three join game")
	public void check_player_three_join_game() {
	    
	}
	
	@Then("server close")
	public void server_close() {

	}


}
