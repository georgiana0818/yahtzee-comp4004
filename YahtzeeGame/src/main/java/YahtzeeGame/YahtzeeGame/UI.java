package YahtzeeGame.YahtzeeGame;

/**
 * Hello world!
 *
 */
public class UI 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public UI() {
	}

	public String showScoreBoard(Score score) {
		String board = "";

		board += "|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  Name: "+score.getName()+"          |Current Score: " + score.getCurrentScore()
		+ "        | Current Round : "+ (score.getCurrentRound()+1) + "                                            "
		+ "      \n|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (1) Ones:"+ displayHelper(score.getOnes()) +"   | (2) Twos:" + displayHelper(score.getTwos()) 
		+ "   | (3)Threes:" + displayHelper(score.getThrees())+ "   | (4) Fours:" + displayHelper(score.getFours()) 
		+ "   | (5) Fives:" + displayHelper(score.getFives()) + "   | (6) Sixs:" + displayHelper(score.getSixs()) 
		+ "   | Bonus:" + displayHelper(score.getBonus()) 
		+"      \n" + "|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (7) Large Straight:" + displayHelper(score.getLargeStraight()) 
		+ "    | (8) Small Straight:" + displayHelper(score.getSmallStraight())
		+ "    | (9) Full House:" + displayHelper(score.getFullHouse()) 
		+ "    | (10) Three Kinds:" + displayHelper(score.getThreeKind())
		+ "  \n|-------------------------------------------------------------------------------------------------------------------|\n"
		+ "  (11) Four Kinds:" + displayHelper(score.getFourKind())
		+ "    | (12) Chance:" + displayHelper(score.getChance())
		+ "    | (13) Yahtzee:" + displayHelper(score.getYahtzee()) + "   \n"
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

	public String displayHelper(int num) {
		String msg = "";
		if(num == -1) {

		}else {
			msg = Integer.toString(num);
		}

		return msg;
	}


}