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

board += "--------------------------------------------------------------------------------------------------------------------\n"
+ "| Name: "+player.getPlayerName()+"          |Current Score: " + player.getCurrentScore()
+ "        | Current Round : "+ (player.getCurrentRound()+1) + "                                            "
+ "        |\n|-------------------------------------------------------------------------------------------------------------------|\n|"
+ "(1) Ones:"+ player.getOnes() +" | (2) Twos:" + player.getTwos() + " | (3)Threes:" + player.getThrees()
+ " | (4) Fours:" + player.getFours() + " | (5) Fives:" + player.getFives() + " | (6) Sixs:" + player.getSixs() + " |\n"
+ "|-------------------------------------------------------------------------------------------------------------------|\n"
+ "| (7) Small Straight:" + player.getSmallStraight() + " | (8) Large Straight:" + player.getLargeStraight()
+ " | (9) Full House:" + player.getFullHouse() + " | (10) Three Kinds:" + player.getThreeKind()
+ " |\n|-------------------------------------------------------------------------------------------------------------------|\n"
+ "| (11) Four Kinds:" + player.getFourKind() + " | (12) Yahtzee:" + player.getYahtzee()
+ " | (13) Chance:" + player.getChance() + "|\n"
+"---------------------------------------------------------------------------------------------------------------------\n";


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
}
