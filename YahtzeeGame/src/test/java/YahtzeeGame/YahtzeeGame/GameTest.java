package YahtzeeGame.YahtzeeGame;

public class GameTest {
	
	public void testYahtzee() {
	  
		Game tg = new Game();
		assertEquals(true, tg.isYahtzee([5,5,5,5,5]));
		
	}
	
	public void testFullHouse() {
		Game tg = new Game();
		assertEquals(true, tg.isFullHouse([1,2,1,2,1]));
	}
}
