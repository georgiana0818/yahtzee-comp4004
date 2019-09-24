package YahtzeeGame.YahtzeeGame;

/**
 * Hello world!
 *
 */
public class UI
{
	public UI() {
	}

	public String showScoreBoard(Player player) {
		String board = "";
	
		board += "|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  Name: "+player.getPlayerName()+"          |Current Score: " + player.getCurrentScore()
		+ "        | Current Round : "+ (player.getCurrentRound()+1) + "                                            "
		+ "      \n|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (1) Ones:"+ displayHelper(player.getOnes(),player.checkOnes()) +"   | (2) Twos:" + displayHelper(player.getTwos(),player.checkTwos()) 
		+ "   | (3)Threes:" + displayHelper(player.getThrees(),player.checkThrees())+ "   | (4) Fours:" + displayHelper(player.getFours(), player.checkFours()) 
		+ "   | (5) Fives:" + displayHelper(player.getFives(),player.checkFives()) + "   | (6) Sixs:" + displayHelper(player.getSixs(),player.checkSixs()) 
		+ "   | Bonus:" + displayHelper(player.getBonus(),player.checkBonus()) 
		+"      \n" + "|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (7) Large Straight:" + displayHelper(player.getLargeStraight(),player.checkLargeStraight()) 
		+ "    | (8) Small Straight:" + displayHelper(player.getSmallStraight(),player.checkSmallStraight())
		+ "    | (9) Full House:" + displayHelper(player.getFullHouse(),player.checkFullHouse()) 
		+ "    | (10) Three Kinds:" + displayHelper(player.getThreeKind(),player.checkThreeKind())
		+ "  \n|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (11) Four Kinds:" + displayHelper(player.getFourKind(),player.checkFourKind())
		+ "    | (12) Chance:" + displayHelper(player.getChance(),player.checkChance())
		+ "    | (13) Yahtzee:" + displayHelper(player.getYahtzee(),player.checkYahtzee()) + "   \n"
		+"|-------------------------------------------------------------------------------------------------------------------|\n\n";
	
	
		return board;
	}
	
	public String showDices(Dice[] dices) {
		String dicesString = "";
	
	
		dicesString = "           -----   -----   -----   -----   -----\nYour roll: | " + dices[0].getFaceValue() + " |   | "
		+ dices[1].getFaceValue() + " |   | " + dices[2].getFaceValue() + " |   | "
		+ dices[3].getFaceValue() + " |   | " + dices[4].getFaceValue() + " |\n"
		+ "           -----   -----   -----   -----   -----";
		
		
		return dicesString;
	
	}
	
	public String displayHelper(int num, boolean checker) {
		String msg = "";
		if(num == 0 && !checker) {
			
		}else {
			msg = Integer.toString(num);
		}
		
		return msg;
	}

}
