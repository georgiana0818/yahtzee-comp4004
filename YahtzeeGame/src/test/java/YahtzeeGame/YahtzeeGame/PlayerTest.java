package YahtzeeGame.YahtzeeGame;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	public void testPlayerName() {
		Player tester = new Player("Tester");
		assertEquals("Tester", tester.getPlayerName());
	}
	
	public void testScoreOnes() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(test,1,test);
		assertEquals(4, tester.getOnes());
	}
	
	public void testScoreTwos() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {1,1,2,1,1};
		tg.handleScore(tester,2,test);
		assertEquals(2, tester.getTwos());
	}
	
	public void testScoreThrees() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,2,1,1};
		tg.handleScore(tester,3,test);
		assertEquals(6, tester.getThrees());
	}
	
	public void testScoreFours() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {3,3,4,1,1};
		tg.handleScore(tester,4,test);
		assertEquals(4, tester.getFours());
	}
	
	public void testScoreFives() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,1,1};
		tg.handleScore(tester,5,test);
		assertEquals(10, tester.getFives());
	}
	
	public void testSetSixs() {
		Player tester = new Player("Tester");
		Game tg = new Game(tester);
		int test[] = new int[] {5,5,4,6,1};
		tg.handleScore(tester,6,test);
		assertEquals(6, tester.getSixs());
	}
	

}
