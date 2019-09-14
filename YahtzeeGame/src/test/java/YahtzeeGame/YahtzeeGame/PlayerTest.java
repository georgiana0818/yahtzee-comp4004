package YahtzeeGame.YahtzeeGame;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	public void testPlayerName() {
		Player tester = new Player("Tester");
		assertEquals("Tester", tester.getPlayerName());
	}
	
	public void testSetOnes() {
		Player tester = new Player("Tester");
		tester.setOnes(2);
		assertEquals(2, tester.getOnes());
	}

}
