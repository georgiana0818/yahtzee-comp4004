package YahtzeeGame.YahtzeeGame;

import cucumber.api.java.en.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Assert;;

public class testPlayer1 {
	Player player1;
	InputAsker asker= mock(InputAsker.class);

	
	@Given("player One join the game")
	public void player_One_join_the_game() {
		when(asker.ask("Welcome Player1, Please enter you name:")).thenReturn("player1");
		player1 = new Player();
		player1.start(asker);
		
	}


	/*@When("player One Two and Three set up name")
	public void player_One_Two_and_Three_set_up_name() {
		when(asker.ask("Welcome Player1, Please enter you name:")).thenReturn("player1");
		 when(asker.ask("Welcome Player2, Please enter you name:")).thenReturn("player2");
		 when(asker.ask("Welcome Player3, Please enter you name:")).thenReturn("player3");		
	}*/

	@When("player One start round One")
	public void player_One_start_round_One() {
		when(asker.ask("Ready Player One?")).thenReturn("");
	}

	@When("play One wants to score category Three")
	public void play_One_wants_to_score_category_Three() {
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	}

	@Then("play One can see can see it score category Three")
	public void play_One_can_see_can_see_it_score_category_Three() {
	    Assert.assertNotEquals(-1, player1.getAllplayerScore()[0].getThrees());
	}

	/*@Then("play Two can see can see player One score category Three")
	public void play_Two_can_see_can_see_player_One_score_category_Three() {
		 Assert.assertNotEquals(-1, player2.getAllplayerScore()[2].getThrees());
	}

	@Then("play Three can see can see Player One score category Three")
	public void play_Three_can_see_can_see_Player_One_score_category_Three() {
		 Assert.assertNotEquals(-1, player3.getAllplayerScore()[1].getThrees());
	}

	@Then("player Two start round One")
	public void player_Two_start_round_One() {
		 assertEquals("play", player2.getStatus());
	}

	@When("play Two wants to score category Five")
	public void play_Two_wants_to_score_category_Five() {
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("5");
	}

	@Then("play Two can see can see it score category Five")
	public void play_Two_can_see_can_see_it_score_category_Five() {
		Assert.assertNotEquals(-1, player2.getAllplayerScore()[0].getFives());
	}

	@Then("play Three can see can see player Two score category Five")
	public void play_Three_can_see_can_see_player_Two_score_category_Five() {
		Assert.assertNotEquals(-1, player3.getAllplayerScore()[2].getFives());
	}

	@Then("play One can see can see Player Two score category Five")
	public void play_One_can_see_can_see_Player_Two_score_category_Five() {
		Assert.assertNotEquals(-1, player1.getAllplayerScore()[1].getFives());
	}

	@Then("player Three start round One")
	public void player_Three_start_round_One() {
		assertEquals("play", player3.getStatus());
	}

	@When("play Three wants to score category Six")
	public void play_Three_wants_to_score_category_Six() {
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("6");
	}

	@Then("play Three can see can see it score category Six")
	public void play_Three_can_see_can_see_it_score_category_Six() {
		Assert.assertNotEquals(-1, player3.getAllplayerScore()[0].getSixs());

	}

	@Then("play One can see can see player Three score category Six")
	public void play_One_can_see_can_see_player_Three_score_category_Six() {
		Assert.assertNotEquals(-1, player1.getAllplayerScore()[2].getSixs());
	}

	@Then("play Two can see can see Player Three score category Six")
	public void play_Two_can_see_can_see_Player_Three_score_category_Six() {
		Assert.assertNotEquals(-1, player2.getAllplayerScore()[1].getSixs());
	}*/

}
