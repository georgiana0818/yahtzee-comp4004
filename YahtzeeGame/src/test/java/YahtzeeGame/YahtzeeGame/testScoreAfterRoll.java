package YahtzeeGame.YahtzeeGame;

import static org.mockito.Mockito.*;

import org.junit.Assert;

import cucumber.api.java.en.*;

public class testScoreAfterRoll {
	InputAsker asker;
	Player player;
	Game game;
	@Given("I want to score noReroll")
	public void i_want_to_score_noReroll() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the noReroll")
	public void i_process_the_noReroll() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	    game.turn(player, asker);

	}

	@Then("I verify the score after noReroll")
	public void i_verify_the_score_after_noReroll() {
	   Assert.assertNotEquals(-1, player.getScore().getThrees());
	   System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollLessThanFiveOnce")
	public void i_want_to_score_rerollLessThanFiveOnce() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollLessThanFiveOnce")
	public void i_process_the_rerollLessThanFiveOnce() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("3");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	    game.turn(player, asker);
	}

	@Then("I verify the score after rerollLessThanFiveOnce")
	public void i_verify_the_score_after_rerollLessThanFiveOnce() {
		 Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollAllOnce")
	public void i_want_to_score_rerollAllOnce() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollAllOnce")
	public void i_process_the_rerollAllOnce() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	    game.turn(player, asker);
	}

	@Then("I verify the score after rerollAllOnce")
	public void i_verify_the_score_after_rerollAllOnce() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollAllTwice")
	public void i_want_to_score_rerollAllTwice() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollAllTwice")
	public void i_process_the_rerollAllTwice() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("2");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	    game.turn(player, asker);
	}

	@Then("I verify the score after rerollAllTwice")
	public void i_verify_the_score_after_rerollAllTwice() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldZeroAndOne")
	public void i_want_to_score_rerollTwiceHoldZeroAndOne() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldZeroAndOne")
	public void i_process_the_rerollTwiceHoldZeroAndOne() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
	    game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldZeroAndOne")
	public void i_verify_the_score_after_rerollTwiceHoldZeroAndOne() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldZeroAndTwo")
	public void i_want_to_score_rerollTwiceHoldZeroAndTwo() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldZeroAndTwo")
	public void i_process_the_rerollTwiceHoldZeroAndTwo() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldZeroAndTwo")
	public void i_verify_the_score_after_rerollTwiceHoldZeroAndTwo() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldZeroAndThree")
	public void i_want_to_score_rerollTwiceHoldZeroAndThree() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldZeroAndThree")
	public void i_process_the_rerollTwiceHoldZeroAndThree() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldZeroAndThree")
	public void i_verify_the_score_after_rerollTwiceHoldZeroAndThree() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldZeroAndFour")
	public void i_want_to_score_rerollTwiceHoldZeroAndFour() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldZeroAndFour")
	public void i_process_the_rerollTwiceHoldZeroAndFour() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("2").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3 4");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldZeroAndFour")
	public void i_verify_the_score_after_rerollTwiceHoldZeroAndFour() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldOneAndOne")
	public void i_want_to_score_rerollTwiceHoldOneAndOne() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldOneAndOne")
	public void i_process_the_rerollTwiceHoldOneAndOne() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1").thenReturn("1");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldOneAndOne")
	public void i_verify_the_score_after_rerollTwiceHoldOneAndOne() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldOneAndTwo")
	public void i_want_to_score_rerollTwiceHoldOneAndTwo() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldOneAndTwo")
	public void i_process_the_rerollTwiceHoldOneAndTwo() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1").thenReturn("1 2");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldOneAndTwo")
	public void i_verify_the_score_after_rerollTwiceHoldOneAndTwo() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldOneAndThree")
	public void i_want_to_score_rerollTwiceHoldOneAndThree() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldOneAndThree")
	public void i_process_the_rerollTwiceHoldOneAndThree() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1").thenReturn("1 2 3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldOneAndThree")
	public void i_verify_the_score_after_rerollTwiceHoldOneAndThree() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldOneAndFour")
	public void i_want_to_score_rerollTwiceHoldOneAndFour() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldOneAndFour")
	public void i_process_the_rerollTwiceHoldOneAndFour() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1").thenReturn("1 2 3 4");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldOneAndFour")
	public void i_verify_the_score_after_rerollTwiceHoldOneAndFour() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldTwoAndTwo")
	public void i_want_to_score_rerollTwiceHoldTwoAndTwo() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldTwoAndTwo")
	public void i_process_the_rerollTwiceHoldTwoAndTwo() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2").thenReturn("1 2");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldTwoAndTwo")
	public void i_verify_the_score_after_rerollTwiceHoldTwoAndTwo() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldTwoAndThree")
	public void i_want_to_score_rerollTwiceHoldTwoAndThree() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldTwoAndThree")
	public void i_process_the_rerollTwiceHoldTwoAndThree() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2").thenReturn("1 2 3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldTwoAndThree")
	public void i_verify_the_score_after_rerollTwiceHoldTwoAndThree() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldTwoAndFour")
	public void i_want_to_score_rerollTwiceHoldTwoAndFour() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldTwoAndFour")
	public void i_process_the_rerollTwiceHoldTwoAndFour() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2").thenReturn("1 2 3 4");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldTwoAndFour")
	public void i_verify_the_score_after_rerollTwiceHoldTwoAndFour() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldThreeAndThree")
	public void i_want_to_score_rerollTwiceHoldThreeAndThree() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldThreeAndThree")
	public void i_process_the_rerollTwiceHoldThreeAndThree() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3").thenReturn("1 2 3");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldThreeAndThree")
	public void i_verify_the_score_after_rerollTwiceHoldThreeAndThree() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldThreeAndFour")
	public void i_want_to_score_rerollTwiceHoldThreeAndFour() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldThreeAndFour")
	public void i_process_the_rerollTwiceHoldThreeAndFour() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3").thenReturn("1 2 3 4");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldThreeAndFour")
	public void i_verify_the_score_after_rerollTwiceHoldThreeAndFour() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}

	@Given("I want to score rerollTwiceHoldFourAndFour")
	public void i_want_to_score_rerollTwiceHoldFourAndFour() {
		asker = mock(InputAsker.class);
		player = new Player();
		game = new Game(player);
	}

	@When("I process the rerollTwiceHoldFourAndFour")
	public void i_process_the_rerollTwiceHoldFourAndFour() {
		when(asker.ask("Press <<Enter>> to roll the dices...")).thenReturn("");
		when(asker.ask("What action would you like to perform next\n"+
				"(1) Select dice to hold and then re-roll the other dice\n"+
				"(2) Re-roll all the dice\n"+
				"(3) Score this round")).thenReturn("1").thenReturn("1");
		when(asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>")).thenReturn("1 2 3 4").thenReturn("1 2 3 4");
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");
		game.turn(player, asker);
	}

	@Then("I verify the score after rerollTwiceHoldFourAndFour")
	public void i_verify_the_score_after_rerollTwiceHoldFourAndFour() {
		Assert.assertNotEquals(-1, player.getScore().getThrees());
		 System.out.println(player.getScore().getThrees());
	}



}