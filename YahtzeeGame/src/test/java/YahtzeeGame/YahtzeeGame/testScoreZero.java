package YahtzeeGame.YahtzeeGame;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.*;

public class testScoreZero {
	Player player;
	Game game;
	@Given("I want to Score a zero with Aces")
	public void i_want_to_Score_a_zero_with_Aces() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Aces")
	public void i_input_int_array_for_Aces() {
		game.handleScore(player,"1",new int[] {2,2,2,2,2});
	}

	@Then("I verify the Aces score")
	public void i_verify_the_Aces_score() {
		assertEquals(0, player.getScore().getOnes());
	}

	@Given("I want to Score a zero with Twos")
	public void i_want_to_Score_a_zero_with_Twos() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Twos")
	public void i_input_int_array_for_Twos() {
		game.handleScore(player,"2",new int[] {1,1,1,1,1});
	}

	@Then("I verify the Twos score")
	public void i_verify_the_Twos_score() {
		assertEquals(0, player.getScore().getTwos());	
	}

	@Given("I want to Score a zero with Threes")
	public void i_want_to_Score_a_zero_with_Threes() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Threes")
	public void i_input_int_array_for_Threes() {
		game.handleScore(player,"3",new int[] {2,2,2,2,2});
	}

	@Then("I verify the Threes score")
	public void i_verify_the_Threes_score() {
		assertEquals(0, player.getScore().getThrees());
	}

	@Given("I want to Score a zero with Fours")
	public void i_want_to_Score_a_zero_with_Fours() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Fours")
	public void i_input_int_array_for_Fours() {
		game.handleScore(player,"4",new int[] {1,1,1,1,1});
	}

	@Then("I verify the Fours score")
	public void i_verify_the_Fours_score() {
		assertEquals(0, player.getScore().getFours());	    
	}

	@Given("I want to Score a zero with Fives")
	public void i_want_to_Score_a_zero_with_Fives() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Fives")
	public void i_input_int_array_for_Fives() {
		game.handleScore(player,"5",new int[] {1,1,1,1,1});
	}

	@Then("I verify the Fives score")
	public void i_verify_the_Fives_score() {
		assertEquals(0, player.getScore().getFives());	    
	}

	@Given("I want to Score a zero with Sixs")
	public void i_want_to_Score_a_zero_with_Sixs() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Sixs")
	public void i_input_int_array_for_Sixs() {
		game.handleScore(player,"6",new int[] {1,1,1,1,1});
	}

	@Then("I verify the Sixs score")
	public void i_verify_the_Sixs_score() {
		assertEquals(0, player.getScore().getSixs());	 
	}
	
	@Given("I want to Score a zero with upperBonus")
	public void i_want_to_Score_a_zero_with_upperBonus() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for upperBonus")
	public void i_input_int_array_for_upperBonus() {
		game.handleScore(player,"1",new int[] {1,1,1,1,1});
		game.handleScore(player,"2",new int[] {1,1,1,1,1});
		game.handleScore(player,"3",new int[] {1,1,1,1,1});
		game.handleScore(player,"4",new int[] {1,1,1,1,1});
		game.handleScore(player,"5",new int[] {1,1,1,1,1});
		game.handleScore(player,"6",new int[] {1,1,1,1,1});
	}

	@Then("I verify the upperBonus score")
	public void i_verify_the_upperBonus_score() {
		assertEquals(0, player.getScore().getBonus());
	}


	@Given("I want to Score a zero with LargeStraight")
	public void i_want_to_Score_a_zero_with_LargeStraight() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for LargeStraight")
	public void i_input_int_array_for_LargeStraight() {
		game.handleScore(player,"7",new int[] {1,1,1,1,1});
	}

	@Then("I verify the LargeStraight score")
	public void i_verify_the_LargeStraight_score() {
		assertEquals(0, player.getScore().getLargeStraight());	 
	}

	@Given("I want to Score a zero with SmallStraight")
	public void i_want_to_Score_a_zero_with_SmallStraight() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for SmallStraight")
	public void i_input_int_array_for_SmallStraight() {
		game.handleScore(player,"8",new int[] {1,2,1,2,1});
	}

	@Then("I verify the SmallStraight score")
	public void i_verify_the_SmallStraight_score() {
		assertEquals(0, player.getScore().getSmallStraight());	  
	}

	@Given("I want to Score a zero with FullHouse")
	public void i_want_to_Score_a_zero_with_FullHouse() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for FullHouse")
	public void i_input_int_array_for_FullHouse() {
		game.handleScore(player,"9",new int[] {1,1,4,1,1});
	}

	@Then("I verify the FullHouse score")
	public void i_verify_the_FullHouse_score() {
		assertEquals(0, player.getScore().getFullHouse());	   
	}

	@Given("I want to Score a zero with ThreeKind")
	public void i_want_to_Score_a_zero_with_ThreeKind() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for ThreeKind")
	public void i_input_int_array_for_ThreeKind() {
		game.handleScore(player,"10",new int[] {1,2,3,2,1});
	}

	@Then("I verify the ThreeKind score")
	public void i_verify_the_ThreeKind_score() {
		assertEquals(0, player.getScore().getThreeKind());	
	}

	@Given("I want to Score a zero with FourKind")
	public void i_want_to_Score_a_zero_with_FourKind() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for FourKind")
	public void i_input_int_array_for_FourKind() {
		game.handleScore(player,"11",new int[] {1,2,3,2,1});
	}

	@Then("I verify the FourKind score")
	public void i_verify_the_FourKind_score() {
		assertEquals(0, player.getScore().getFourKind());	   
	}

	@Given("I want to Score a zero with Yahtzee")
	public void i_want_to_Score_a_zero_with_Yahtzee() {
		player = new Player();
		game = new Game(player);
	}

	@When("I input int array for Yahtzee")
	public void i_input_int_array_for_Yahtzee() {
		game.handleScore(player,"13",new int[] {1,2,1,1,1});
	}

	@Then("I verify the Yahtzee score")
	public void i_verify_the_Yahtzee_score() {
		assertEquals(0, player.getScore().getYahtzee());	
	}

}
