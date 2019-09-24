package YahtzeeGame.YahtzeeGame;

import java.io.IOException;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {

	public void testScoreOnes() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(tester,"1",test);
		assertEquals(4, tester.getOnes());
	}
	
	public void testScoreTwos() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(tester,"2",test);
		assertEquals(2, tester.getTwos());
	}
	
	public void testScoreThrees() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,2,1,1};
		tg.handleScore(tester,"3",test);
		assertEquals(6, tester.getThrees());
	}
	
	public void testScoreFours() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,4,1,1};
		tg.handleScore(tester,"4",test);
		assertEquals(4, tester.getFours());
	}
	
	public void testScoreFives() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,1,1};
		tg.handleScore(tester,"5",test);
		assertEquals(10, tester.getFives());
	}
	
	public void testScoreSixs() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,6,1};
		tg.handleScore(tester,"6",test);
		assertEquals(6, tester.getSixs());
	}
	
	public void testScoreLargeStraight() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,3,4,5};
		tg.handleScore(tester,"7",test);
		assertEquals(40, tester.getLargeStraight());
		assertEquals(true, tester.checkLargeStraight());
		
		int test1[] = new int[] {2,3,4,5,2}; //test the category has been scored and it cannot be scored again
		boolean couldbeScored = tg.handleScore(tester,"7",test1);
		assertEquals(false, couldbeScored);
		
		Player tester2 = new Player();
		Game tg2 = new Game(tester2);
		int test2[] = new int[] {1,2,3,4,6};
		tg2.handleScore(tester2,"7",test2);
		assertEquals(0, tester2.getLargeStraight());
		assertEquals(true, tester2.checkLargeStraight());//0 still be scored
	}
	
	public void testAdditionYahtzeeLargeStraight() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);
		
		int[] test = new int[] {2,2,2,2,2};
		
		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "7", test);
		assertEquals(40, tester.getLargeStraight());
	}
	
	public void testScoreSmallStraight() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,3,4,6};
		
		tg.handleScore(tester,"8",test);//test the category score
		assertEquals(30, tester.getSmallStraight());
		assertEquals(true, tester.checkSmallStraight());
		
		int test1[] = new int[] {2,3,4,5,2}; //test the category has been scored and it cannot be scored again
		boolean couldbeScored = tg.handleScore(tester,"8",test1);
		assertEquals(false, couldbeScored);
		
		Player tester2 = new Player();
		Game tg2 = new Game(tester2);
		int test2[] = new int[] {1,2,1,4,6};
		tg2.handleScore(tester2,"8",test2);
		assertEquals(0, tester2.getSmallStraight());
		assertEquals(true, tester2.checkSmallStraight());
	}
	
	public void testAdditionYahtzeeSmallStraight() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);
		
		int[] test = new int[] {2,2,2,2,2};
		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "8", test);
		assertEquals(30, tester.getSmallStraight());
	}
	
	public void testScoreFullHouse() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,2,1,2,1};
		tg.handleScore(tester,"9",test);
		assertEquals(25, tester.getFullHouse());
		
	}
	
	public void testAdditionYahtzeeFullHouse() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Game tg = new Game(tester);
		
		int[] test = new int[] {2,2,2,2,2};
		
		tg.handleScore(tester, "13", test);
		tg.handleScore(tester, "9", test);
		assertEquals(25, tester.getFullHouse());
	}
	
	public void testScoreThreeKind() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {3,2,3,2,2};
		tg.handleScore(tester,"10",test);
		assertEquals(12, tester.getThreeKind());
	}
	
	public void testScoreFourKind() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,2,1};
		tg.handleScore(tester,"11",test);
		assertEquals(6, tester.getFourKind());
	}
	
	public void testScoreChance() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,2,1};
		tg.handleScore(tester,"12",test);
		assertEquals(6, tester.getChance());
	}
	

	public void testScoreYahtzee() {
		Player tester = new Player();
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,1,1,1};
		tg.handleScore(tester,"13",test);
		assertEquals(50, tester.getYahtzee());
	}
	
	public void testAdditionYahtzee() throws ClassNotFoundException, IOException {
		Player tester = new Player();
		Player tester2 = new Player();
		Game tg = new Game(tester);
		Game tg2 = new Game(tester2);
		
		int[] test = new int[] {2,2,2,2,2};
		int[] test1 = new int [] {1,2,1,1,1};
		int[] test2 = new int[] {1,1,1,1,1};
		
		tg.handleScore(tester, "13", test);
		tg.handleAction("3", tester, test2);
		assertEquals(5,tester.getOnes());
		assertEquals(100, tester.getAdditionYahtzee());
		
		tg2.handleScore(tester2, "13", test1);
		tg2.handleScore(tester2, "13", test2);
		assertEquals(0, tester2.getAdditionYahtzee());
	}
	
	public void testScoreUpperBonus() {
		Player tester = new Player();
		Game tg = new Game(tester);
		tg.handleScore(tester, "5", new int[]{5,5,5,5,6});
		tg.handleScore(tester, "6", new int[]{6,6,6,6,5});
		tg.handleScore(tester, "4", new int[]{4,4,4,4,6});
		tg.handleScore(tester, "3", new int[]{3,1,1,1,1});
		
		assertEquals(35, tester.getBonus());
	}	
	
}


