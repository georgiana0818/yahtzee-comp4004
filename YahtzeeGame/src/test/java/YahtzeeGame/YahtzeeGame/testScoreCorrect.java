package YahtzeeGame.YahtzeeGame;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

import cucumber.api.java.en.*;

public class testScoreCorrect {
	InputAsker asker;
	Player player;
	Game game;
	@Given("I want to score acesScoreOne correctly")
	public void i_want_to_score_acesScoreOne_correctly() {
	    player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for acesScoreOne to score")
	public void i_input_int_array_for_acesScoreOne_to_score() {
		game.handleScore(player,"1",new int[] {1,2,2,2,2});
	}

	@Then("I verify the score of the acesScoreOne")
	public void i_verify_the_score_of_the_acesScoreOne() {
		assertEquals(1, player.getScore().getOnes());
	}

	@Given("I want to score acesScoreTwo correctly")
	public void i_want_to_score_acesScoreTwo_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for acesScoreTwo to score")
	public void i_input_int_array_for_acesScoreTwo_to_score() {
		game.handleScore(player,"1",new int[] {1,1,2,2,2});
	}

	@Then("I verify the score of the acesScoreTwo")
	public void i_verify_the_score_of_the_acesScoreTwo() {
		assertEquals(2, player.getScore().getOnes());
	}

	@Given("I want to score acesScoreThree correctly")
	public void i_want_to_score_acesScoreThree_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for acesScoreThree to score")
	public void i_input_int_array_for_acesScoreThree_to_score() {
		game.handleScore(player,"1",new int[] {1,1,1,2,2});
	}

	@Then("I verify the score of the acesScoreThree")
	public void i_verify_the_score_of_the_acesScoreThree() {
		assertEquals(3, player.getScore().getOnes());
	}

	@Given("I want to score acesScoreFour correctly")
	public void i_want_to_score_acesScoreFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for acesScoreFour to score")
	public void i_input_int_array_for_acesScoreFour_to_score() {
		game.handleScore(player,"1",new int[] {1,1,1,1,2});
	}

	@Then("I verify the score of the acesScoreFour")
	public void i_verify_the_score_of_the_acesScoreFour() {
		assertEquals(4, player.getScore().getOnes());
	}

	@Given("I want to score acesScoreFive correctly")
	public void i_want_to_score_acesScoreFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for acesScoreFive to score")
	public void i_input_int_array_for_acesScoreFive_to_score() {
		game.handleScore(player,"1",new int[] {1,1,1,1,1});
	}

	@Then("I verify the score of the acesScoreFive")
	public void i_verify_the_score_of_the_acesScoreFive() {
		assertEquals(5, player.getScore().getOnes());
	}

	@Given("I want to score TwosScoreTwo correctly")
	public void i_want_to_score_TwosScoreTwo_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for TwosScoreTwo to score")
	public void i_input_int_array_for_TwosScoreTwo_to_score() {
		game.handleScore(player,"2",new int[] {2,3,3,3,3});
	}

	@Then("I verify the score of the TwosScoreTwo")
	public void i_verify_the_score_of_the_TwosScoreTwo() {
		assertEquals(2, player.getScore().getTwos());
	}

	@Given("I want to score TwosScoreFour correctly")
	public void i_want_to_score_TwosScoreFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for TwosScoreFour to score")
	public void i_input_int_array_for_TwosScoreFour_to_score() {
		game.handleScore(player,"2",new int[] {2,2,3,3,3});
	}

	@Then("I verify the score of the TwosScoreFour")
	public void i_verify_the_score_of_the_TwosScoreFour() {
		assertEquals(4, player.getScore().getTwos());
	}

	@Given("I want to score TwosScoreSix correctly")
	public void i_want_to_score_TwosScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for TwosScoreSix to score")
	public void i_input_int_array_for_TwosScoreSix_to_score() {
		game.handleScore(player,"2",new int[] {2,2,2,3,3});
	}

	@Then("I verify the score of the TwosScoreSix")
	public void i_verify_the_score_of_the_TwosScoreSix() {
		assertEquals(6, player.getScore().getTwos());
	}

	@Given("I want to score TwosScoreEight correctly")
	public void i_want_to_score_TwosScoreEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for TwosScoreEight to score")
	public void i_input_int_array_for_TwosScoreEight_to_score() {
		game.handleScore(player,"2",new int[] {2,2,2,2,3});
	}

	@Then("I verify the score of the TwosScoreEight")
	public void i_verify_the_score_of_the_TwosScoreEight() {
		assertEquals(8, player.getScore().getTwos());
	}

	@Given("I want to score TwosScoreTen correctly")
	public void i_want_to_score_TwosScoreTen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for TwosScoreTen to score")
	public void i_input_int_array_for_TwosScoreTen_to_score() {
		game.handleScore(player,"2",new int[] {2,2,2,2,2});
	}

	@Then("I verify the score of the TwosScoreTen")
	public void i_verify_the_score_of_the_TwosScoreTen() {
		assertEquals(10, player.getScore().getTwos());
	}

	@Given("I want to score ThreesScoreThree correctly")
	public void i_want_to_score_ThreesScoreThree_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreesScoreThree to score")
	public void i_input_int_array_for_ThreesScoreThree_to_score() {
		game.handleScore(player,"3",new int[] {3,2,2,2,2});
	}

	@Then("I verify the score of the ThreesScoreThree")
	public void i_verify_the_score_of_the_ThreesScoreThree() {
		assertEquals(3, player.getScore().getThrees());
	}

	@Given("I want to score ThreesScoreSix correctly")
	public void i_want_to_score_ThreesScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreesScoreSix to score")
	public void i_input_int_array_for_ThreesScoreSix_to_score() {
		game.handleScore(player,"3",new int[] {3,3,2,2,2});
	}

	@Then("I verify the score of the ThreesScoreSix")
	public void i_verify_the_score_of_the_ThreesScoreSix() {
		assertEquals(6, player.getScore().getThrees());
	}

	@Given("I want to score ThreesScoreNine correctly")
	public void i_want_to_score_ThreesScoreNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreesScoreNine to score")
	public void i_input_int_array_for_ThreesScoreNine_to_score() {
		game.handleScore(player,"3",new int[] {3,3,3,2,2});
	}

	@Then("I verify the score of the ThreesScoreNine")
	public void i_verify_the_score_of_the_ThreesScoreNine() {
		assertEquals(9, player.getScore().getThrees());
	}

	@Given("I want to score ThreesScoreTwelve correctly")
	public void i_want_to_score_ThreesScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreesScoreTwelve to score")
	public void i_input_int_array_for_ThreesScoreTwelve_to_score() {
		game.handleScore(player,"3",new int[] {3,3,3,3,2});
	}

	@Then("I verify the score of the ThreesScoreTwelve")
	public void i_verify_the_score_of_the_ThreesScoreTwelve() {
		assertEquals(12, player.getScore().getThrees());
	}

	@Given("I want to score ThreesScoreFifty correctly")
	public void i_want_to_score_ThreesScoreFifty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreesScoreFifty to score")
	public void i_input_int_array_for_ThreesScoreFifty_to_score() {
		game.handleScore(player,"3",new int[] {3,3,3,3,3});
	}

	@Then("I verify the score of the ThreesScoreFifty")
	public void i_verify_the_score_of_the_ThreesScoreFifty() {
		assertEquals(15, player.getScore().getThrees());
	}

	@Given("I want to score FoursScoreFour correctly")
	public void i_want_to_score_FoursScoreFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FoursScoreFour to score")
	public void i_input_int_array_for_FoursScoreFour_to_score() {
		game.handleScore(player,"4",new int[] {4,3,3,2,2});
	}

	@Then("I verify the score of the FoursScoreFour")
	public void i_verify_the_score_of_the_FoursScoreFour() {
		assertEquals(4, player.getScore().getFours());
	}

	@Given("I want to score FoursScoreEight correctly")
	public void i_want_to_score_FoursScoreEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FoursScoreEight to score")
	public void i_input_int_array_for_FoursScoreEight_to_score() {
		game.handleScore(player,"4",new int[] {4,4,3,2,2});
	}

	@Then("I verify the score of the FoursScoreEight")
	public void i_verify_the_score_of_the_FoursScoreEight() {
		assertEquals(8, player.getScore().getFours());
	}

	@Given("I want to score FoursScoreTwelve correctly")
	public void i_want_to_score_FoursScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FoursScoreTwelve to score")
	public void i_input_int_array_for_FoursScoreTwelve_to_score() {
		game.handleScore(player,"4",new int[] {4,4,4,2,2});
	}

	@Then("I verify the score of the FoursScoreTwelve")
	public void i_verify_the_score_of_the_FoursScoreTwelve() {
		assertEquals(12, player.getScore().getFours());
	}

	@Given("I want to score FoursScoreSixteen correctly")
	public void i_want_to_score_FoursScoreSixteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FoursScoreSixteen to score")
	public void i_input_int_array_for_FoursScoreSixteen_to_score() {
		game.handleScore(player,"4",new int[] {4,4,4,4,2});
	}

	@Then("I verify the score of the FoursScoreSixteen")
	public void i_verify_the_score_of_the_FoursScoreSixteen() {
		assertEquals(16, player.getScore().getFours());
	}

	@Given("I want to score FoursScoreTwenty correctly")
	public void i_want_to_score_FoursScoreTwenty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FoursScoreTwenty to score")
	public void i_input_int_array_for_FoursScoreTwenty_to_score() {
		game.handleScore(player,"4",new int[] {4,4,4,4,4});
	}

	@Then("I verify the score of the FoursScoreTwenty")
	public void i_verify_the_score_of_the_FoursScoreTwenty() {
		assertEquals(20, player.getScore().getFours());
	}

	@Given("I want to score FivesScoreFive correctly")
	public void i_want_to_score_FivesScoreFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FivesScoreFive to score")
	public void i_input_int_array_for_FivesScoreFive_to_score() {
		game.handleScore(player,"5",new int[] {5,3,3,2,2});
	}

	@Then("I verify the score of the FivesScoreFive")
	public void i_verify_the_score_of_the_FivesScoreFive() {
		assertEquals(5, player.getScore().getFives());
	}

	@Given("I want to score FivesScoreTen correctly")
	public void i_want_to_score_FivesScoreTen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FivesScoreTen to score")
	public void i_input_int_array_for_FivesScoreTen_to_score() {
		game.handleScore(player,"5",new int[] {5,5,3,2,2});
	}

	@Then("I verify the score of the FivesScoreTen")
	public void i_verify_the_score_of_the_FivesScoreTen() {
		assertEquals(10, player.getScore().getFives());
	}

	@Given("I want to score FivesScoreFifteen correctly")
	public void i_want_to_score_FivesScoreFifteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FivesScoreFifteen to score")
	public void i_input_int_array_for_FivesScoreFifteen_to_score() {
		game.handleScore(player,"5",new int[] {5,5,5,2,2});
	}

	@Then("I verify the score of the FivesScoreFifteen")
	public void i_verify_the_score_of_the_FivesScoreFifteen() {
		assertEquals(15, player.getScore().getFives());
	}

	@Given("I want to score FivesScoreTwenty correctly")
	public void i_want_to_score_FivesScoreTwenty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FivesScoreTwenty to score")
	public void i_input_int_array_for_FivesScoreTwenty_to_score() {
		game.handleScore(player,"5",new int[] {5,5,5,5,2});
	}

	@Then("I verify the score of the FivesScoreTwenty")
	public void i_verify_the_score_of_the_FivesScoreTwenty() {
		assertEquals(20, player.getScore().getFives());
	}

	@Given("I want to score FivesScoreTwentyFive correctly")
	public void i_want_to_score_FivesScoreTwentyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FivesScoreTwentyFive to score")
	public void i_input_int_array_for_FivesScoreTwentyFive_to_score() {
		game.handleScore(player,"5",new int[] {5,5,5,5,5});
	}

	@Then("I verify the score of the FivesScoreTwentyFive")
	public void i_verify_the_score_of_the_FivesScoreTwentyFive() {
		assertEquals(25, player.getScore().getFives());
	}

	@Given("I want to score SixsScoreSix correctly")
	public void i_want_to_score_SixsScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SixsScoreSix to score")
	public void i_input_int_array_for_SixsScoreSix_to_score() {
		game.handleScore(player,"6",new int[] {6,5,5,5,2});
	}

	@Then("I verify the score of the SixsScoreSix")
	public void i_verify_the_score_of_the_SixsScoreSix() {
		assertEquals(6, player.getScore().getSixs());
	}

	@Given("I want to score SixsScoreTwelve correctly")
	public void i_want_to_score_SixsScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SixsScoreTwelve to score")
	public void i_input_int_array_for_SixsScoreTwelve_to_score() {
		game.handleScore(player,"6",new int[] {6,6,5,5,2});
	}

	@Then("I verify the score of the SixsScoreTwelve")
	public void i_verify_the_score_of_the_SixsScoreTwelve() {
		assertEquals(12, player.getScore().getSixs());
	}

	@Given("I want to score SixsScoreEighteen correctly")
	public void i_want_to_score_SixsScoreEighteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SixsScoreEighteen to score")
	public void i_input_int_array_for_SixsScoreEighteen_to_score() {
		game.handleScore(player,"6",new int[] {6,6,6,5,2});
	}

	@Then("I verify the score of the SixsScoreEighteen")
	public void i_verify_the_score_of_the_SixsScoreEighteen() {
		assertEquals(18, player.getScore().getSixs());
	}

	@Given("I want to score SixsScoreTwentyFour correctly")
	public void i_want_to_score_SixsScoreTwentyFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SixsScoreTwentyFour to score")
	public void i_input_int_array_for_SixsScoreTwentyFour_to_score() {
		game.handleScore(player,"6",new int[] {6,6,6,6,2});
	}

	@Then("I verify the score of the SixsScoreTwentyFour")
	public void i_verify_the_score_of_the_SixsScoreTwentyFour() {
		assertEquals(24, player.getScore().getSixs());
	}

	@Given("I want to score SixsScoreThirty correctly")
	public void i_want_to_score_SixsScoreThirty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SixsScoreThirty to score")
	public void i_input_int_array_for_SixsScoreThirty_to_score() {
		game.handleScore(player,"6",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the SixsScoreThirty")
	public void i_verify_the_score_of_the_SixsScoreThirty() {
		assertEquals(30, player.getScore().getSixs());
	}
	
	@Given("I want to score UpperBonusThirtyFive correctly")
	public void i_want_to_score_UpperBonusThirtyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for UpperBonusThirtyFive to score")
	public void i_input_int_array_for_UpperBonusThirtyFive_to_score() {
		game.handleScore(player,"4",new int[] {4,4,4,4,4});
		game.handleScore(player,"5",new int[] {5,5,5,5,5});
		game.handleScore(player,"6",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the UpperBonusThirtyFive")
	public void i_verify_the_score_of_the_UpperBonusThirtyFive() {
		assertEquals(35, player.getScore().getBonus());
	}

	@Given("I want to score LargeStraightScoreForty correctly")
	public void i_want_to_score_LargeStraightScoreForty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for LargeStraightScoreForty to score")
	public void i_input_int_array_for_LargeStraightScoreForty_to_score() {
		game.handleScore(player,"7",new int[] {4,3,2,1,5});

	}

	@Then("I verify the score of the LargeStraightScoreForty")
	public void i_verify_the_score_of_the_LargeStraightScoreForty() {
		assertEquals(40, player.getScore().getLargeStraight());
	}

	@Given("I want to score SmallStraightScoreThirty correctly")
	public void i_want_to_score_SmallStraightScoreThirty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for SmallStraightScoreThirty to score")
	public void i_input_int_array_for_SmallStraightScoreThirty_to_score() {
		game.handleScore(player,"8",new int[] {6,3,1,4,2});
	}

	@Then("I verify the score of the SmallStraightScoreThirty")
	public void i_verify_the_score_of_the_SmallStraightScoreThirty() {
		assertEquals(30, player.getScore().getSmallStraight());
	}

	@Given("I want to score FullHouseScoreTwentyFive correctly")
	public void i_want_to_score_FullHouseScoreTwentyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FullHouseScoreTwentyFive to score")
	public void i_input_int_array_for_FullHouseScoreTwentyFive_to_score() {
		game.handleScore(player,"9",new int[] {2,2,2,4,4});
	}

	@Then("I verify the score of the FullHouseScoreTwentyFive")
	public void i_verify_the_score_of_the_FullHouseScoreTwentyFive() {
		assertEquals(25, player.getScore().getFullHouse());
	}

	@Given("I want to score ThreeKindScoreFive correctly")
	public void i_want_to_score_ThreeKindScoreFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreFive to score")
	public void i_input_int_array_for_ThreeKindScoreFive_to_score() {
		game.handleScore(player,"10",new int[] {1,1,1,1,1});
	}

	@Then("I verify the score of the ThreeKindScoreFive")
	public void i_verify_the_score_of_the_ThreeKindScoreFive() {
		assertEquals(5, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreSix correctly")
	public void i_want_to_score_ThreeKindScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreSix to score")
	public void i_input_int_array_for_ThreeKindScoreSix_to_score() {
		game.handleScore(player,"10",new int[] {1,1,1,1,2});
	}

	@Then("I verify the score of the ThreeKindScoreSix")
	public void i_verify_the_score_of_the_ThreeKindScoreSix() {
		assertEquals(6, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreSeven correctly")
	public void i_want_to_score_ThreeKindScoreSeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreSeven to score")
	public void i_input_int_array_for_ThreeKindScoreSeven_to_score() {
		game.handleScore(player,"10",new int[] {1,1,1,2,2});
	}

	@Then("I verify the score of the ThreeKindScoreSeven")
	public void i_verify_the_score_of_the_ThreeKindScoreSeven() {
		assertEquals(7, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreEight correctly")
	public void i_want_to_score_ThreeKindScoreEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreEight to score")
	public void i_input_int_array_for_ThreeKindScoreEight_to_score() {
		game.handleScore(player,"10",new int[] {2,2,2,1,1});
	}

	@Then("I verify the score of the ThreeKindScoreEight")
	public void i_verify_the_score_of_the_ThreeKindScoreEight() {
		assertEquals(8, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreNine correctly")
	public void i_want_to_score_ThreeKindScoreNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreNine to score")
	public void i_input_int_array_for_ThreeKindScoreNine_to_score() {
		game.handleScore(player,"10",new int[] {1,1,1,3,3});
	}

	@Then("I verify the score of the ThreeKindScoreNine")
	public void i_verify_the_score_of_the_ThreeKindScoreNine() {
		assertEquals(9, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTen correctly")
	public void i_want_to_score_ThreeKindScoreTen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTen to score")
	public void i_input_int_array_for_ThreeKindScoreTen_to_score() {
		game.handleScore(player,"10",new int[] {2,2,2,2,2});
	}

	@Then("I verify the score of the ThreeKindScoreTen")
	public void i_verify_the_score_of_the_ThreeKindScoreTen() {
		assertEquals(10, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreEleven correctly")
	public void i_want_to_score_ThreeKindScoreEleven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreEleven to score")
	public void i_input_int_array_for_ThreeKindScoreEleven_to_score() {
		game.handleScore(player,"10",new int[] {3,3,3,1,1});
	}

	@Then("I verify the score of the ThreeKindScoreEleven")
	public void i_verify_the_score_of_the_ThreeKindScoreEleven() {
		assertEquals(11, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwelve correctly")
	public void i_want_to_score_ThreeKindScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwelve to score")
	public void i_input_int_array_for_ThreeKindScoreTwelve_to_score() {
		game.handleScore(player,"10",new int[] {3,3,3,1,2});
	}

	@Then("I verify the score of the ThreeKindScoreTwelve")
	public void i_verify_the_score_of_the_ThreeKindScoreTwelve() {
		assertEquals(12, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreThirteen correctly")
	public void i_want_to_score_ThreeKindScoreThirteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreThirteen to score")
	public void i_input_int_array_for_ThreeKindScoreThirteen_to_score() {
		game.handleScore(player,"10",new int[] {2,2,2,3,4});
	}

	@Then("I verify the score of the ThreeKindScoreThirteen")
	public void i_verify_the_score_of_the_ThreeKindScoreThirteen() {
		assertEquals(13, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreFourteen correctly")
	public void i_want_to_score_ThreeKindScoreFourteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreFourteen to score")
	public void i_input_int_array_for_ThreeKindScoreFourteen_to_score() {
		game.handleScore(player,"10",new int[] {1,1,1,5,6});
	}

	@Then("I verify the score of the ThreeKindScoreFourteen")
	public void i_verify_the_score_of_the_ThreeKindScoreFourteen() {
		assertEquals(14, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreFifteen correctly")
	public void i_want_to_score_ThreeKindScoreFifteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreFifteen to score")
	public void i_input_int_array_for_ThreeKindScoreFifteen_to_score() {
		game.handleScore(player,"10",new int[] {3,3,3,2,4});
	}

	@Then("I verify the score of the ThreeKindScoreFifteen")
	public void i_verify_the_score_of_the_ThreeKindScoreFifteen() {
		assertEquals(15, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreSixteen correctly")
	public void i_want_to_score_ThreeKindScoreSixteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreSixteen to score")
	public void i_input_int_array_for_ThreeKindScoreSixteen_to_score() {
		game.handleScore(player,"10",new int[] {4,4,4,1,3});
	}

	@Then("I verify the score of the ThreeKindScoreSixteen")
	public void i_verify_the_score_of_the_ThreeKindScoreSixteen() {
		assertEquals(16, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreSeventeen correctly")
	public void i_want_to_score_ThreeKindScoreSeventeen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreSeventeen to score")
	public void i_input_int_array_for_ThreeKindScoreSeventeen_to_score() {
		game.handleScore(player,"10",new int[] {5,5,5,1,1});
	}

	@Then("I verify the score of the ThreeKindScoreSeventeen")
	public void i_verify_the_score_of_the_ThreeKindScoreSeventeen() {
		assertEquals(17, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreEightteen correctly")
	public void i_want_to_score_ThreeKindScoreEightteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreEightteen to score")
	public void i_input_int_array_for_ThreeKindScoreEightteen_to_score() {
		game.handleScore(player,"10",new int[] {2,2,2,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreEightteen")
	public void i_verify_the_score_of_the_ThreeKindScoreEightteen() {
		assertEquals(18, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreNineteen correctly")
	public void i_want_to_score_ThreeKindScoreNineteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreNineteen to score")
	public void i_input_int_array_for_ThreeKindScoreNineteen_to_score() {
		game.handleScore(player,"10",new int[] {3,3,3,5,5});
	}

	@Then("I verify the score of the ThreeKindScoreNineteen")
	public void i_verify_the_score_of_the_ThreeKindScoreNineteen() {
		assertEquals(19, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwenty correctly")
	public void i_want_to_score_ThreeKindScoreTwenty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwenty to score")
	public void i_input_int_array_for_ThreeKindScoreTwenty_to_score() {
		game.handleScore(player,"10",new int[] {6,6,6,1,1});
	}

	@Then("I verify the score of the ThreeKindScoreTwenty")
	public void i_verify_the_score_of_the_ThreeKindScoreTwenty() {
		assertEquals(20, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyOne correctly")
	public void i_want_to_score_ThreeKindScoreTwentyOne_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyOne to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyOne_to_score() {
		game.handleScore(player,"10",new int[] {4,4,4,4,5});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyOne")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyOne() {
		assertEquals(21, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyTwo correctly")
	public void i_want_to_score_ThreeKindScoreTwentyTwo_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyTwo to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyTwo_to_score() {
		game.handleScore(player,"10",new int[] {5,5,5,6,1});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyTwo")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyTwo() {
		assertEquals(22, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyThree correctly")
	public void i_want_to_score_ThreeKindScoreTwentyThree_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyThree to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyThree_to_score() {
		game.handleScore(player,"10",new int[] {6,2,3,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyThree")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyThree() {
		assertEquals(23, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyFour correctly")
	public void i_want_to_score_ThreeKindScoreTwentyFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyFour to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyFour_to_score() {
		game.handleScore(player,"10",new int[] {5,5,4,5,5});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyFour")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyFour() {
		assertEquals(24, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyFive correctly")
	public void i_want_to_score_ThreeKindScoreTwentyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyFive to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyFive_to_score() {
		game.handleScore(player,"10",new int[] {5,6,2,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyFive")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyFive() {
		assertEquals(25, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentySix correctly")
	public void i_want_to_score_ThreeKindScoreTwentySix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentySix to score")
	public void i_input_int_array_for_ThreeKindScoreTwentySix_to_score() {
		game.handleScore(player,"10",new int[] {5,5,5,6,5});
	}

	@Then("I verify the score of the ThreeKindScoreTwentySix")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentySix() {
		assertEquals(26, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentySeven correctly")
	public void i_want_to_score_ThreeKindScoreTwentySeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentySeven to score")
	public void i_input_int_array_for_ThreeKindScoreTwentySeven_to_score() {
		game.handleScore(player,"10",new int[] {6,3,6,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreTwentySeven")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentySeven() {
		assertEquals(27, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyEight correctly")
	public void i_want_to_score_ThreeKindScoreTwentyEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyEight to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyEight_to_score() {
		game.handleScore(player,"10",new int[] {4,6,6,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyEight")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyEight() {
		assertEquals(28, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreTwentyNine correctly")
	public void i_want_to_score_ThreeKindScoreTwentyNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreTwentyNine to score")
	public void i_input_int_array_for_ThreeKindScoreTwentyNine_to_score() {
		game.handleScore(player,"10",new int[] {6,6,6,5,6});
	}

	@Then("I verify the score of the ThreeKindScoreTwentyNine")
	public void i_verify_the_score_of_the_ThreeKindScoreTwentyNine() {
		assertEquals(29, player.getScore().getThreeKind());
	}

	@Given("I want to score ThreeKindScoreThirty correctly")
	public void i_want_to_score_ThreeKindScoreThirty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ThreeKindScoreThirty to score")
	public void i_input_int_array_for_ThreeKindScoreThirty_to_score() {
		game.handleScore(player,"10",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the ThreeKindScoreThirty")
	public void i_verify_the_score_of_the_ThreeKindScoreThirty() {
		assertEquals(30, player.getScore().getThreeKind());
	}

	@Given("I want to score FourKindScoreFive correctly")
	public void i_want_to_score_FourKindScoreFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreFive to score")
	public void i_input_int_array_for_FourKindScoreFive_to_score() {
		game.handleScore(player,"11",new int[] {1,1,1,1,1});
	}

	@Then("I verify the score of the FourKindScoreFive")
	public void i_verify_the_score_of_the_FourKindScoreFive() {
		assertEquals(5, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreSix correctly")
	public void i_want_to_score_FourKindScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreSix to score")
	public void i_input_int_array_for_FourKindScoreSix_to_score() {
		game.handleScore(player,"11",new int[] {1,1,2,1,1});
	}

	@Then("I verify the score of the FourKindScoreSix")
	public void i_verify_the_score_of_the_FourKindScoreSix() {
		assertEquals(6, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreSeven correctly")
	public void i_want_to_score_FourKindScoreSeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreSeven to score")
	public void i_input_int_array_for_FourKindScoreSeven_to_score() {
		game.handleScore(player,"11",new int[] {1,3,1,1,1});
	}

	@Then("I verify the score of the FourKindScoreSeven")
	public void i_verify_the_score_of_the_FourKindScoreSeven() {
		assertEquals(7, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreEight correctly")
	public void i_want_to_score_FourKindScoreEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreEight to score")
	public void i_input_int_array_for_FourKindScoreEight_to_score() {
		game.handleScore(player,"11",new int[] {4,1,1,1,1});
	}

	@Then("I verify the score of the FourKindScoreEight")
	public void i_verify_the_score_of_the_FourKindScoreEight() {
		assertEquals(8, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreNine correctly")
	public void i_want_to_score_FourKindScoreNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreNine to score")
	public void i_input_int_array_for_FourKindScoreNine_to_score() {
		game.handleScore(player,"11",new int[] {2,1,2,2,2});
	}

	@Then("I verify the score of the FourKindScoreNine")
	public void i_verify_the_score_of_the_FourKindScoreNine() {
		assertEquals(9, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTen correctly")
	public void i_want_to_score_FourKindScoreTen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTen to score")
	public void i_input_int_array_for_FourKindScoreTen_to_score() {
		game.handleScore(player,"11",new int[] {1,6,1,1,1});
	}

	@Then("I verify the score of the FourKindScoreTen")
	public void i_verify_the_score_of_the_FourKindScoreTen() {
		assertEquals(10, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreEleven correctly")
	public void i_want_to_score_FourKindScoreEleven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreEleven to score")
	public void i_input_int_array_for_FourKindScoreEleven_to_score() {
		game.handleScore(player,"11",new int[] {2,3,2,2,2});
	}

	@Then("I verify the score of the FourKindScoreEleven")
	public void i_verify_the_score_of_the_FourKindScoreEleven() {
		assertEquals(11, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwelve correctly")
	public void i_want_to_score_FourKindScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwelve to score")
	public void i_input_int_array_for_FourKindScoreTwelve_to_score() {
		game.handleScore(player,"11",new int[] {2,2,2,4,2});
	}

	@Then("I verify the score of the FourKindScoreTwelve")
	public void i_verify_the_score_of_the_FourKindScoreTwelve() {
		assertEquals(12, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreThirteen correctly")
	public void i_want_to_score_FourKindScoreThirteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreThirteen to score")
	public void i_input_int_array_for_FourKindScoreThirteen_to_score() {
		game.handleScore(player,"11",new int[] {1,3,3,3,3});
	}

	@Then("I verify the score of the FourKindScoreThirteen")
	public void i_verify_the_score_of_the_FourKindScoreThirteen() {
		assertEquals(13, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreFourteen correctly")
	public void i_want_to_score_FourKindScoreFourteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreFourteen to score")
	public void i_input_int_array_for_FourKindScoreFourteen_to_score() {
		game.handleScore(player,"11",new int[] {2,6,2,2,2});
	}

	@Then("I verify the score of the FourKindScoreFourteen")
	public void i_verify_the_score_of_the_FourKindScoreFourteen() {
		assertEquals(14, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreFifteen correctly")
	public void i_want_to_score_FourKindScoreFifteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreFifteen to score")
	public void i_input_int_array_for_FourKindScoreFifteen_to_score() {
		game.handleScore(player,"11",new int[] {3,3,3,3,3});
	}

	@Then("I verify the score of the FourKindScoreFifteen")
	public void i_verify_the_score_of_the_FourKindScoreFifteen() {
		assertEquals(15, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreSixteen correctly")
	public void i_want_to_score_FourKindScoreSixteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreSixteen to score")
	public void i_input_int_array_for_FourKindScoreSixteen_to_score() {
		game.handleScore(player,"11",new int[] {3,4,3,3,3});
	}

	@Then("I verify the score of the FourKindScoreSixteen")
	public void i_verify_the_score_of_the_FourKindScoreSixteen() {
		assertEquals(16, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreSeventeen correctly")
	public void i_want_to_score_FourKindScoreSeventeen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreSeventeen to score")
	public void i_input_int_array_for_FourKindScoreSeventeen_to_score() {
		game.handleScore(player,"11",new int[] {4,4,4,1,4});
	}

	@Then("I verify the score of the FourKindScoreSeventeen")
	public void i_verify_the_score_of_the_FourKindScoreSeventeen() {
		assertEquals(17, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreEightteen correctly")
	public void i_want_to_score_FourKindScoreEightteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreEightteen to score")
	public void i_input_int_array_for_FourKindScoreEightteen_to_score() {
		game.handleScore(player,"11",new int[] {3,3,6,3,3});
	}

	@Then("I verify the score of the FourKindScoreEightteen")
	public void i_verify_the_score_of_the_FourKindScoreEightteen() {
		assertEquals(18, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreNineteen correctly")
	public void i_want_to_score_FourKindScoreNineteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreNineteen to score")
	public void i_input_int_array_for_FourKindScoreNineteen_to_score() {
		game.handleScore(player,"11",new int[] {4,3,4,4,4});
	}

	@Then("I verify the score of the FourKindScoreNineteen")
	public void i_verify_the_score_of_the_FourKindScoreNineteen() {
		assertEquals(19, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwenty correctly")
	public void i_want_to_score_FourKindScoreTwenty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwenty to score")
	public void i_input_int_array_for_FourKindScoreTwenty_to_score() {
		game.handleScore(player,"11",new int[] {4,4,4,4,4});
	}

	@Then("I verify the score of the FourKindScoreTwenty")
	public void i_verify_the_score_of_the_FourKindScoreTwenty() {
		assertEquals(20, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyOne correctly")
	public void i_want_to_score_FourKindScoreTwentyOne_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyOne to score")
	public void i_input_int_array_for_FourKindScoreTwentyOne_to_score() {
		game.handleScore(player,"11",new int[] {4,4,5,4,4});
	}

	@Then("I verify the score of the FourKindScoreTwentyOne")
	public void i_verify_the_score_of_the_FourKindScoreTwentyOne() {
		assertEquals(21, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyTwo correctly")
	public void i_want_to_score_FourKindScoreTwentyTwo_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyTwo to score")
	public void i_input_int_array_for_FourKindScoreTwentyTwo_to_score() {
		game.handleScore(player,"11",new int[] {5,2,5,5,5});
	}

	@Then("I verify the score of the FourKindScoreTwentyTwo")
	public void i_verify_the_score_of_the_FourKindScoreTwentyTwo() {
		assertEquals(22, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyThree correctly")
	public void i_want_to_score_FourKindScoreTwentyThree_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyThree to score")
	public void i_input_int_array_for_FourKindScoreTwentyThree_to_score() {
		game.handleScore(player,"11",new int[] {5,5,5,3,5});
	}

	@Then("I verify the score of the FourKindScoreTwentyThree")
	public void i_verify_the_score_of_the_FourKindScoreTwentyThree() {
		assertEquals(23, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyFour correctly")
	public void i_want_to_score_FourKindScoreTwentyFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyFour to score")
	public void i_input_int_array_for_FourKindScoreTwentyFour_to_score() {
		game.handleScore(player,"11",new int[] {5,4,5,5,5});
	}

	@Then("I verify the score of the FourKindScoreTwentyFour")
	public void i_verify_the_score_of_the_FourKindScoreTwentyFour() {
		assertEquals(24, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyFive correctly")
	public void i_want_to_score_FourKindScoreTwentyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyFive to score")
	public void i_input_int_array_for_FourKindScoreTwentyFive_to_score() {
		game.handleScore(player,"11",new int[] {5,5,5,5,5});
	}

	@Then("I verify the score of the FourKindScoreTwentyFive")
	public void i_verify_the_score_of_the_FourKindScoreTwentyFive() {
		assertEquals(25, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentySix correctly")
	public void i_want_to_score_FourKindScoreTwentySix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentySix to score")
	public void i_input_int_array_for_FourKindScoreTwentySix_to_score() {
		game.handleScore(player,"11",new int[] {5,5,5,6,5});
	}

	@Then("I verify the score of the FourKindScoreTwentySix")
	public void i_verify_the_score_of_the_FourKindScoreTwentySix() {
		assertEquals(26, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentySeven correctly")
	public void i_want_to_score_FourKindScoreTwentySeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentySeven to score")
	public void i_input_int_array_for_FourKindScoreTwentySeven_to_score() {
		game.handleScore(player,"11",new int[] {6,6,6,3,6});
	}

	@Then("I verify the score of the FourKindScoreTwentySeven")
	public void i_verify_the_score_of_the_FourKindScoreTwentySeven() {
		assertEquals(27, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyEight correctly")
	public void i_want_to_score_FourKindScoreTwentyEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyEight to score")
	public void i_input_int_array_for_FourKindScoreTwentyEight_to_score() {
		game.handleScore(player,"11",new int[] {6,6,6,6,4});
	}

	@Then("I verify the score of the FourKindScoreTwentyEight")
	public void i_verify_the_score_of_the_FourKindScoreTwentyEight() {
		assertEquals(28, player.getScore().getFourKind());
	}

	@Given("I want to score FourKindScoreTwentyNine correctly")
	public void i_want_to_score_FourKindScoreTwentyNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreTwentyNine to score")
	public void i_input_int_array_for_FourKindScoreTwentyNine_to_score() {
		game.handleScore(player,"11",new int[] {5,6,6,6,6});
	}

	@Then("I verify the score of the FourKindScoreTwentyNine")
	public void i_verify_the_score_of_the_FourKindScoreTwentyNine() {
		assertEquals(29, player.getScore().getFourKind());

	}
	
	@Given("I want to score FourKindScoreThirty correctly")
	public void i_want_to_score_FourKindScoreThirty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for FourKindScoreThirty to score")
	public void i_input_int_array_for_FourKindScoreThirty_to_score() {
		game.handleScore(player,"11",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the FourKindScoreThirty")
	public void i_verify_the_score_of_the_FourKindScoreThirty() {
		assertEquals(30, player.getScore().getFourKind());
	}
	@Given("I want to score ChanceScoreFive correctly")
	public void i_want_to_score_ChanceScoreFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreFive to score")
	public void i_input_int_array_for_ChanceScoreFive_to_score() {
		game.handleScore(player,"12",new int[] {1,1,1,1,1});
	}

	@Then("I verify the score of the ChanceScoreFive")
	public void i_verify_the_score_of_the_ChanceScoreFive() {
		assertEquals(5, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreFiveScoreSix correctly")
	public void i_want_to_score_ChanceScoreFiveScoreSix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreFiveScoreSix to score")
	public void i_input_int_array_for_ChanceScoreFiveScoreSix_to_score() {
		game.handleScore(player,"12",new int[] {1,1,1,1,2});
	}

	@Then("I verify the score of the ChanceScoreFiveScoreSix")
	public void i_verify_the_score_of_the_ChanceScoreFiveScoreSix() {
		assertEquals(6, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreSeven correctly")
	public void i_want_to_score_ChanceScoreSeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreSeven to score")
	public void i_input_int_array_for_ChanceScoreSeven_to_score() {
		game.handleScore(player,"12",new int[] {2,1,2,1,1});
	}

	@Then("I verify the score of the ChanceScoreSeven")
	public void i_verify_the_score_of_the_ChanceScoreSeven() {
		assertEquals(7, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreEight correctly")
	public void i_want_to_score_ChanceScoreEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreEight to score")
	public void i_input_int_array_for_ChanceScoreEight_to_score() {
		game.handleScore(player,"12",new int[] {1,2,3,1,1});
	}

	@Then("I verify the score of the ChanceScoreEight")
	public void i_verify_the_score_of_the_ChanceScoreEight() {
		assertEquals(8, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreNine correctly")
	public void i_want_to_score_ChanceScoreNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreNine to score")
	public void i_input_int_array_for_ChanceScoreNine_to_score() {
		game.handleScore(player,"12",new int[] {2,2,2,2,1});
	}

	@Then("I verify the score of the ChanceScoreNine")
	public void i_verify_the_score_of_the_ChanceScoreNine() {
		assertEquals(9, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTen correctly")
	public void i_want_to_score_ChanceScoreTen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTen to score")
	public void i_input_int_array_for_ChanceScoreTen_to_score() {
		game.handleScore(player,"12",new int[] {3,2,2,1,2});
	}

	@Then("I verify the score of the ChanceScoreTen")
	public void i_verify_the_score_of_the_ChanceScoreTen() {
		assertEquals(10, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreEleven correctly")
	public void i_want_to_score_ChanceScoreEleven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreEleven to score")
	public void i_input_int_array_for_ChanceScoreEleven_to_score() {
		game.handleScore(player,"12",new int[] {4,2,2,2,1});
	}

	@Then("I verify the score of the ChanceScoreEleven")
	public void i_verify_the_score_of_the_ChanceScoreEleven() {
		assertEquals(11, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwelve correctly")
	public void i_want_to_score_ChanceScoreTwelve_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwelve to score")
	public void i_input_int_array_for_ChanceScoreTwelve_to_score() {
		game.handleScore(player,"12",new int[] {5,2,3,1,1});
	}

	@Then("I verify the score of the ChanceScoreTwelve")
	public void i_verify_the_score_of_the_ChanceScoreTwelve() {
		assertEquals(12, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreThirteen correctly")
	public void i_want_to_score_ChanceScoreThirteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreThirteen to score")
	public void i_input_int_array_for_ChanceScoreThirteen_to_score() {
		game.handleScore(player,"12",new int[] {1,6,3,2,1});
	}

	@Then("I verify the score of the ChanceScoreThirteen")
	public void i_verify_the_score_of_the_ChanceScoreThirteen() {
		assertEquals(13, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreFourteen correctly")
	public void i_want_to_score_ChanceScoreFourteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreFourteen to score")
	public void i_input_int_array_for_ChanceScoreFourteen_to_score() {
		game.handleScore(player,"12",new int[] {6,4,1,2,1});
	}

	@Then("I verify the score of the ChanceScoreFourteen")
	public void i_verify_the_score_of_the_ChanceScoreFourteen() {
		assertEquals(14, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreFifteen correctly")
	public void i_want_to_score_ChanceScoreFifteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreFifteen to score")
	public void i_input_int_array_for_ChanceScoreFifteen_to_score() {
		game.handleScore(player,"12",new int[] {4,5,3,2,1});
	}

	@Then("I verify the score of the ChanceScoreFifteen")
	public void i_verify_the_score_of_the_ChanceScoreFifteen() {
		assertEquals(15, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreSixteen correctly")
	public void i_want_to_score_ChanceScoreSixteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreSixteen to score")
	public void i_input_int_array_for_ChanceScoreSixteen_to_score() {
		game.handleScore(player,"12",new int[] {3,2,4,6,1});
	}

	@Then("I verify the score of the ChanceScoreSixteen")
	public void i_verify_the_score_of_the_ChanceScoreSixteen() {
		assertEquals(16, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreSeventeen correctly")
	public void i_want_to_score_ChanceScoreSeventeen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreSeventeen to score")
	public void i_input_int_array_for_ChanceScoreSeventeen_to_score() {
		game.handleScore(player,"12",new int[] {5,4,6,1,1});
	}

	@Then("I verify the score of the ChanceScoreSeventeen")
	public void i_verify_the_score_of_the_ChanceScoreSeventeen() {
		assertEquals(17, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreEightteen correctly")
	public void i_want_to_score_ChanceScoreEightteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreEightteen to score")
	public void i_input_int_array_for_ChanceScoreEightteen_to_score() {
		game.handleScore(player,"12",new int[] {1,6,6,3,2});
	}

	@Then("I verify the score of the ChanceScoreEightteen")
	public void i_verify_the_score_of_the_ChanceScoreEightteen() {
		assertEquals(18, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreNineteen correctly")
	public void i_want_to_score_ChanceScoreNineteen_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreNineteen to score")
	public void i_input_int_array_for_ChanceScoreNineteen_to_score() {
		game.handleScore(player,"12",new int[] {4,6,5,3,1});
	}

	@Then("I verify the score of the ChanceScoreNineteen")
	public void i_verify_the_score_of_the_ChanceScoreNineteen() {
		assertEquals(19, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwenty correctly")
	public void i_want_to_score_ChanceScoreTwenty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwenty to score")
	public void i_input_int_array_for_ChanceScoreTwenty_to_score() {
		game.handleScore(player,"12",new int[] {5,2,6,6,1});
	}

	@Then("I verify the score of the ChanceScoreTwenty")
	public void i_verify_the_score_of_the_ChanceScoreTwenty() {
		assertEquals(20, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyOne correctly")
	public void i_want_to_score_ChanceScoreTwentyOne_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyOne to score")
	public void i_input_int_array_for_ChanceScoreTwentyOne_to_score() {
		game.handleScore(player,"12",new int[] {5,6,5,4,1});
	}

	@Then("I verify the score of the ChanceScoreTwentyOne")
	public void i_verify_the_score_of_the_ChanceScoreTwentyOne() {
		assertEquals(21, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyTwo correctly")
	public void i_want_to_score_ChanceScoreTwentyTwo_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyTwo to score")
	public void i_input_int_array_for_ChanceScoreTwentyTwo_to_score() {
		game.handleScore(player,"12",new int[] {4,4,4,4,6});
	}

	@Then("I verify the score of the ChanceScoreTwentyTwo")
	public void i_verify_the_score_of_the_ChanceScoreTwentyTwo() {
		assertEquals(22, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyThree correctly")
	public void i_want_to_score_ChanceScoreTwentyThree_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyThree to score")
	public void i_input_int_array_for_ChanceScoreTwentyThree_to_score() {
		game.handleScore(player,"12",new int[] {5,4,5,5,4});
	}

	@Then("I verify the score of the ChanceScoreTwentyThree")
	public void i_verify_the_score_of_the_ChanceScoreTwentyThree() {
		assertEquals(23, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyFour correctly")
	public void i_want_to_score_ChanceScoreTwentyFour_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyFour to score")
	public void i_input_int_array_for_ChanceScoreTwentyFour_to_score() {
		game.handleScore(player,"12",new int[] {6,5,6,6,1});
	}

	@Then("I verify the score of the ChanceScoreTwentyFour")
	public void i_verify_the_score_of_the_ChanceScoreTwentyFour() {
		assertEquals(24, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyFive correctly")
	public void i_want_to_score_ChanceScoreTwentyFive_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyFive to score")
	public void i_input_int_array_for_ChanceScoreTwentyFive_to_score() {
		game.handleScore(player,"12",new int[] {5,5,5,5,5});
	}

	@Then("I verify the score of the ChanceScoreTwentyFive")
	public void i_verify_the_score_of_the_ChanceScoreTwentyFive() {
		assertEquals(25, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentySix correctly")
	public void i_want_to_score_ChanceScoreTwentySix_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentySix to score")
	public void i_input_int_array_for_ChanceScoreTwentySix_to_score() {
		game.handleScore(player,"12",new int[] {6,6,5,6,3});
	}

	@Then("I verify the score of the ChanceScoreTwentySix")
	public void i_verify_the_score_of_the_ChanceScoreTwentySix() {
		assertEquals(26, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentySeven correctly")
	public void i_want_to_score_ChanceScoreTwentySeven_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentySeven to score")
	public void i_input_int_array_for_ChanceScoreTwentySeven_to_score() {
		game.handleScore(player,"12",new int[] {6,3,6,6,6});
	}

	@Then("I verify the score of the ChanceScoreTwentySeven")
	public void i_verify_the_score_of_the_ChanceScoreTwentySeven() {
		assertEquals(27, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyEight correctly")
	public void i_want_to_score_ChanceScoreTwentyEight_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyEight to score")
	public void i_input_int_array_for_ChanceScoreTwentyEight_to_score() {
		game.handleScore(player,"12",new int[] {6,6,4,6,6});
	}

	@Then("I verify the score of the ChanceScoreTwentyEight")
	public void i_verify_the_score_of_the_ChanceScoreTwentyEight() {
		assertEquals(28, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreTwentyNine correctly")
	public void i_want_to_score_ChanceScoreTwentyNine_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreTwentyNine to score")
	public void i_input_int_array_for_ChanceScoreTwentyNine_to_score() {
		game.handleScore(player,"12",new int[] {5,6,6,6,6});
	}

	@Then("I verify the score of the ChanceScoreTwentyNine")
	public void i_verify_the_score_of_the_ChanceScoreTwentyNine() {
		assertEquals(29, player.getScore().getChance());
	}

	@Given("I want to score ChanceScoreThirty correctly")
	public void i_want_to_score_ChanceScoreThirty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for ChanceScoreThirty to score")
	public void i_input_int_array_for_ChanceScoreThirty_to_score() {
		game.handleScore(player,"12",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the ChanceScoreThirty")
	public void i_verify_the_score_of_the_ChanceScoreThirty() {
		assertEquals(30, player.getScore().getChance());
	}
	
	@Given("I want to score YahtzeeScoreFifty correctly")
	public void i_want_to_score_YahtzeeScoreFifty_correctly() {
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for YahtzeeScoreFifty to score")
	public void i_input_int_array_for_YahtzeeScoreFifty_to_score() {
		game.handleScore(player,"13",new int[] {6,6,6,6,6});
	}

	@Then("I verify the score of the YahtzeeScoreFifty")
	public void i_verify_the_score_of_the_YahtzeeScoreFifty() {
		assertEquals(50, player.getScore().getYahtzee());
	}
	
	@Given("I want to score AdditionYahtzeeScore correctly")
	public void i_want_to_score_AdditionYahtzeeScore_correctly() {
		asker = mock(InputAsker.class);
		player = new Player();
	    game = new Game(player);
	}

	@When("I input int array for AdditionYahtzeeScore to score")
	public void i_input_int_array_for_AdditionYahtzeeScore_to_score() {
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("9");
		game.handleScore(player,"13",new int[] {6,6,6,6,6});
		try {
			game.handleAction("3",player,new int[] {6,6,6,6,6},asker);
			game.handleAction("3",player,new int[] {6,6,6,6,6},asker);
			when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("8");
			game.handleAction("3",player,new int[] {6,6,6,6,6},asker);
			when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("7");
			game.handleAction("3",player,new int[] {6,6,6,6,6},asker);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Then("I verify the score of the AdditionYahtzeeScore")
	public void i_verify_the_score_of_the_AdditionYahtzeeScore() {
		assertEquals(50, player.getScore().getYahtzee());
		assertEquals(30, player.getScore().getSixs());
		assertEquals(25, player.getScore().getFullHouse());
		assertEquals(30, player.getScore().getSmallStraight());
		assertEquals(40, player.getScore().getLargeStraight());
		assertEquals(400, player.getScore().getAdditionYahtzee());
	}


}
