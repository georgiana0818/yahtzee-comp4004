package YahtzeeGame.YahtzeeGame;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cucumber.api.java.en.*;

public class testPlayer2 {
	Player player2;
	InputAsker asker= mock(InputAsker.class);
	@Given("player Two join the game")
	public void player_Two_join_the_game() {
		when(asker.ask("Welcome Player2, Please enter you name:")).thenReturn("player2");
		player2 = new Player();
	    player2.start(asker);
	}
	
	@Then("player Two can see player one score category Three")
	public void player_Two_can_see_player_one_score_category_Three() {
	  
	}

	@When("player Two start round One")
	public void player_Two_start_round_One() {
	  
	}

	@When("play Two wants to score category Three")
	public void play_Two_wants_to_score_category_Three() {

	}

	@Then("play Two can see can see it score category Three")
	public void play_Two_can_see_can_see_it_score_category_Three() {
	   
	}

}
