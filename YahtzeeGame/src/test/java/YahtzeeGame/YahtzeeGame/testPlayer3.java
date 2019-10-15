package YahtzeeGame.YahtzeeGame;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import cucumber.api.java.en.*;

public class testPlayer3 {
	Player player3;
	InputAsker asker= mock(InputAsker.class);
	@Given("player Three join the game")
	public void player_Three_join_the_game() {
		when(asker.ask("Welcome Player3, Please enter you name:")).thenReturn("player3");
		player3 = new Player();
		player3.start(asker);
	
	}

	@Then("player Three can see player one score category Three")
	public void player_Three_can_see_player_one_score_category_Three() {
	  
	}
	
	@When("player Three start round One")
	public void player_Three_start_round_One() {
	    
	}

	@When("play Three wants to score category Three")
	public void play_Three_wants_to_score_category_Three() {
	   
	}

	@Then("play Three can see can see it score category Three")
	public void play_Three_can_see_can_see_it_score_category_Three() {
	  
	}

}
