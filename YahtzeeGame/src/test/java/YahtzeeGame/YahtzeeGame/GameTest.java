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
<<<<<<< Updated upstream
=======
	
	public void testChance() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,3,4,5};
		assertEquals(15, tg.chance(test));
	}
	
	
	public void testUpperBonus() {
		Player player = new Player();
		Game tg = new Game(player);
		player.getScore().setUpperScore(63);
		assertEquals(35, tg.upperBonus(player));
	}
	
	public void testSecondCategory() {
		Player player = new Player();
		Game tg = new Game(player);
		assertEquals(false, tg.checkSecondCategory(player.getScore().getOnes()));
		player.getScore().setOnes(4);
		assertEquals(true, tg.checkSecondCategory(player.getScore().getOnes()));
	}
	
	public void testReroll() {
		Player player = new Player();
		Game tg = new Game(player);
		
		int[] faceValue1 = tg.rollDice(); 
		assertNotNull(null,faceValue1);
		int[] faceValue2 = tg.rollDice();  //test reroll all dices
		assertNotSame(faceValue1,faceValue2);
		
		int[] faceValue3 = tg.rerollDice(tg.rerollHelper(tg.inputConverter("1 2")));
		assertEquals(faceValue2[0],faceValue3[0]); //test reroll selected position
		assertEquals(faceValue2[1],faceValue3[1]);
	}
	
>>>>>>> Stashed changes
}
