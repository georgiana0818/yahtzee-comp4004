package YahtzeeGame.YahtzeeGame;

import junit.framework.TestCase;


public class GameTest extends TestCase{
	
	public void testYahtzee() {
		  
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {5,5,5,5,5};
		int[] test2 = new int[] {5,5,3,5,5};
		assertEquals(50, tg.checkYahtzee(test));
		assertEquals(0, tg.checkYahtzee(test2));
		
	}
	
	public void testFullHouse() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,1,2,1};
		int[] test2 = new int[] {4,2,1,2,1};
		assertEquals(25, tg.checkFullHouse(test));
		assertEquals(0, tg.checkFullHouse(test2));
	}
	
	public void testThreeKind() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {3,2,3,2,2};
		int[] test2 = new int[] {3,2,3,2,1};
		assertEquals(12, tg.checkThreeKind(test));
		assertEquals(0, tg.checkThreeKind(test2));
	}
	
	public void testFourKind() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,1,1,2,1};
		int[] test2 = new int[] {1,1,1,1,1};
		int[] test3 = new int[] {1,2,3,1,1};
		assertEquals(6, tg.checkFourKind(test));
		assertEquals(5, tg.checkFourKind(test2));
		assertEquals(0, tg.checkFourKind(test3));
	}
	
	public void testSmallStraight() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,3,4,2};
		int[] test2 = new int[] {1,2,3,4,5};
		int[] test3= new int[] {1,2,5,4,5};
		assertEquals(30, tg.checkSmallStraight(test));
		assertEquals(30, tg.checkSmallStraight(test2));
		assertEquals(0, tg.checkSmallStraight(test3));
	}
	
	public void testLargeStraight() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,3,4,5};
		int[] test2 = new int[] {3,2,3,2,1};
		assertEquals(40, tg.checkLargeStraight(test));
		assertEquals(0, tg.checkLargeStraight(test2));
	}
	
	public void testaddUpperSection() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,3,4,5};
		int[] test2 = new int[] {2,2,3,4,5};
		assertEquals(1, tg.addUpperSection(test, 1));
		assertEquals(0, tg.addUpperSection(test2, 1));
	}
	
	public void testChance() {
		Player player = new Player();
		Game tg = new Game(player);
		int[] test = new int[] {1,2,3,4,5};
		assertEquals(15, tg.chance(test));
	}
	
	
	public void testUpperBonus() {
		Player player = new Player();
		Game tg = new Game(player);
		player.setUpperScore(63);
		assertEquals(35, tg.upperBonus(player));
	}
	
	public void testSecondCategory() {
		Player player = new Player();
		Game tg = new Game(player);
		assertEquals(false, tg.checkSecondCategory(player.checkOnes()));
		player.setOnes(4);
		assertEquals(true, tg.checkSecondCategory(player.checkOnes()));
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
	
}
