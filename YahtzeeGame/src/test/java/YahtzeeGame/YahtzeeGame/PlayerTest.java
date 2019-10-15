package YahtzeeGame.YahtzeeGame;

import java.io.IOException;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

public class PlayerTest extends TestCase {

	public void testScoreOnes() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(tester,"1",test);
		assertEquals(4, tester.getScore().getOnes());

		boolean couldbeScored = tg.handleScore(tester,"1",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreTwos() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(tester,"2",test);
		assertEquals(2, tester.getScore().getTwos());

		boolean couldbeScored = tg.handleScore(tester,"2",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreThrees() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,2,1,1};
		tg.handleScore(tester,"3",test);
		assertEquals(6, tester.getScore().getThrees());

		boolean couldbeScored = tg.handleScore(tester,"3",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreFours() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,4,1,1};
		tg.handleScore(tester,"4",test);
		assertEquals(4, tester.getScore().getFours());

		boolean couldbeScored = tg.handleScore(tester,"4",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreFives() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,1,1};
		tg.handleScore(tester,"5",test);

		assertEquals(10, tester.getScore().getFives());

		boolean couldbeScored = tg.handleScore(tester,"5",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreSixs() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,6,1};
		tg.handleScore(tester,"6",test);

		assertEquals(6, tester.getScore().getSixs());

		boolean couldbeScored = tg.handleScore(tester,"6",test); //test scored category 5 again
		assertEquals(false, couldbeScored);
	}

	public void testScoreLargeStraight() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,3,4,5};
		tg.handleScore(tester,"7",test);
		assertEquals(40, tester.getScore().getLargeStraight());

		int test1[] = new int[] {2,3,4,5,2}; //test the category has been scored and it cannot be scored again
		boolean couldbeScored = tg.handleScore(tester,"7",test1);
		assertEquals(false, couldbeScored);

		Player tester2 = new Player();
		Game tg2 = new Game(tester2);
		int test2[] = new int[] {1,2,3,4,6};
		tg2.handleScore(tester2,"7",test2);
		assertEquals(0, tester2.getScore().getLargeStraight());
	}

	public void testAdditionYahtzeeLargeStraight() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);

		int[] test = new int[] {2,2,2,2,2};

		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "7", test);
		assertEquals(40, tester.getScore().getLargeStraight());
	}

	public void testScoreSmallStraight() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,3,4,6};

		tg.handleScore(tester,"8",test);//test the category score
		assertEquals(30, tester.getScore().getSmallStraight());


		int test1[] = new int[] {2,3,4,5,2}; //test the category has been scored and it cannot be scored again
		boolean couldbeScored = tg.handleScore(tester,"8",test1);
		assertEquals(false, couldbeScored);

		Player tester2 = new Player();
		Game tg2 = new Game(tester2);
		int test2[] = new int[] {1,2,1,4,6};
		tg2.handleScore(tester2,"8",test2);
		assertEquals(0, tester2.getScore().getSmallStraight());
	}

	public void testAdditionYahtzeeSmallStraight() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);

		int[] test = new int[] {2,2,2,2,2};
		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "8", test);
		assertEquals(30, tester.getScore().getSmallStraight());
	}

	public void testScoreFullHouse() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,1,2,1};
		tg.handleScore(tester,"9",test);
		assertEquals(25, tester.getScore().getFullHouse());

	}

	public void testAdditionYahtzeeFullHouse() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);

		int[] test = new int[] {2,2,2,2,2};

		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "9", test);
		assertEquals(25, tester.getScore().getFullHouse());
	}

	public void testScoreThreeKind() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,2,3,2,2};
		tg.handleScore(tester,"10",test);
		assertEquals(12, tester.getScore().getThreeKind());
	}

	public void testScoreFourKind() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,2,1};
		tg.handleScore(tester,"11",test);
		assertEquals(6, tester.getScore().getFourKind());
	}

	public void testScoreChance() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,2,1};
		tg.handleScore(tester,"12",test);
		assertEquals(6, tester.getScore().getChance());
	}


	public void testScoreYahtzee() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,1,1};
		tg.handleScore(tester,"13",test);
		assertEquals(50, tester.getScore().getYahtzee());
	}

	public void testAdditionYahtzee() throws ClassNotFoundException, IOException {
		InputAsker asker = mock(InputAsker.class);
		when(asker.ask("What category do you want to score this round against? Please enter the category number: ")).thenReturn("3");

		Player tester = new Player();
		Player tester2 = new Player();
		Game tg = new Game(tester);
		Game tg2 = new Game(tester2);

		int[] test = new int[] {2,2,2,2,2};
		int[] test1 = new int [] {1,2,1,1,1};
		int[] test2 = new int[] {1,1,1,1,1};

		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "1", test1);
		assertEquals(4,tester.getScore().getOnes());
		tg.handleAction("3", tester, test2,asker);

		assertEquals(0,tester.getScore().getThrees());
		assertEquals(100, tester.getScore().getAdditionYahtzee());

		tg2.handleScore(tester2, "13", test1);
		tg2.handleScore(tester2, "13", test2);
		assertEquals(0, tester2.getScore().getAdditionYahtzee());
	}

	public void testScoreUpperBonus() {
		Player tester = new Player();
		Game tg = new Game(tester);
		tg.handleScore(tester, "5", new int[]{5,5,5,5,6});
		tg.handleScore(tester, "6", new int[]{6,6,6,6,5});
		tg.handleScore(tester, "4", new int[]{4,4,4,4,6});
		tg.handleScore(tester, "3", new int[]{3,1,1,1,1});

		assertEquals(35, tester.getScore().getBonus());
	}	

	
}