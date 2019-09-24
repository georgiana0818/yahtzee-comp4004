package YahtzeeGame.YahtzeeGame;

import java.io.IOException;
import java.util.Arrays;

public class Game {
	private Dice[] dices = new Dice[5];
	private int rerollcount;
	private UI ui;
	private int[] facevalues;
	private Player player;
	
	public Game(Player player) {
		this.player = player;
	    for(int i = 0; i < dices.length; i++) {
	    	dices[i] = new Dice();
	    }
	    ui = new UI();
	   
	}
	
	public void start(){	
		rerollcount = 0;
		turn(player);
	
	}
	
	public void turn(Player player){
		String msg = "Press <<Enter>> to roll the dices...";
		String input = player.input(msg);
		
		if(input.equals("")) {
			facevalues = rollDice();
			
			System.out.println(ui.showDices(dices));
	
			while(rerollcount < 2) {
				input = player.input(displayActions());
				try {
					handleAction(input,player,facevalues);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//displayActions();
				if(input.equals("3")) {
					break;
				}
				rerollcount++;
				if(rerollcount == 2) {
					msg = "What category do you want to score this round against? Please enter the category number: ";
					input = player.input(msg);
					String category = input;
					while(!handleScore(player, category, facevalues)) {
						msg ="What category do you want to score this round against? Please enter the category number: ";
						input = player.input(input);
						category = input;
					}
				}
			}
		}
	}
	
	public String displayActions() {
		String msg = "What action would you like to perform next\n"+
					"(1) Select dice to hold and then re-roll the other dice\n"+
					"(2) Re-roll all the dice\n"+
					"(3) Score this round";
		return msg;
	}
	
	public void handleAction(String action,Player player, int[] faceValues) throws ClassNotFoundException, IOException {
			String msg;
			if(action.equals("1")) {
				msg = "Please enter in the dice position that you want to hold, please separate each number with a <<space>>";
				String input = player.input(msg);	
				int[] hold = rerollHelper(inputConverter(input));
				rerollDice(hold);
				System.out.println(ui.showDices(dices));
				
			}else if(action.equals("2")) {
				facevalues = rollDice();
				System.out.println(ui.showDices(dices));
				
			}else if(action.equals("3")) {
				if(checkYahtzee(faceValues) == 50 && player.checkYahtzee() && additionYahtzeeHelper(faceValues)==false) {
					if(faceValues[0] == 1) {
						ScoreOne(faceValues);
					}else if(faceValues[0] == 2) {
						ScoreTwo(faceValues);
					}else if(faceValues[0] == 3) {
						ScoreThree(faceValues);
					}else if(faceValues[0] == 4) {
						ScoreFour(faceValues);
					}else if(faceValues[0] == 5) {
						ScoreFive(faceValues);
					}else {
						ScoreSix(faceValues);
					}
				}else {
					msg ="What category do you want to score this round against? Please enter the category number: ";
					String input = player.input(msg);
					String category = input;
					while(handleScore(player, category, faceValues)==false) {
						msg ="What category do you want to score this round against? Please enter the category number: ";
						input = player.input(msg);
						category = input;
					}
				}
			}
		
	}
	
	public Boolean handleScore(Player player, String category, int[] faceValues) {
		boolean scored = false;
		if(category.equals("1")) {
			scored = ScoreOne(faceValues);
		}else if(category.equals("2")) {
			scored = ScoreTwo(faceValues);
		}else if(category.equals("3")) {
			scored = ScoreThree(faceValues);
		}else if(category.equals("4")) {
			scored = ScoreFour(faceValues);
		}else if(category.equals("5")) {
			scored = ScoreFive(faceValues);
		}else if(category.equals("6")) {
			scored = ScoreSix(faceValues);
		}else if(category.equals("7")) {
			scored = ScoreLS(faceValues);
		}else if(category.equals("8")) {
			scored = ScoreSS(faceValues);
		}else if(category.equals("9")) {
			scored = ScoreFH(faceValues);
		}else if(category.equals("10")) {
			scored = ScoreTK(faceValues);
		}else if(category.equals("11")) {
			scored = ScoreFK(faceValues);
		}else if(category.equals("12")) {
			scored = ScoreChance(faceValues);
		}else if(category.equals("13")) {
			if(checkSecondCategory(player.checkYahtzee()) == false) {
				player.setYahtzee(checkYahtzee(faceValues));
				scored = true;
			}
		}
		return scored;
	}
	
	public boolean ScoreOne(int [] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkOnes())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setOnes(addUpperSection(faceValues,1));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setOnes(addUpperSection(faceValues,1));
				player.setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreTwo(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkTwos())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setTwos(addUpperSection(faceValues,2));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setTwos(addUpperSection(faceValues,2));
				player.setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreThree(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkThrees())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setThrees(addUpperSection(faceValues,3));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setThrees(addUpperSection(faceValues,3));
				player.setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFour(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkFours())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50 ) {
				player.setFours(addUpperSection(faceValues,4));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setFours(addUpperSection(faceValues,4));
				player.setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFive(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkFives())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setFives(addUpperSection(faceValues,5));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setFives(addUpperSection(faceValues,5));
				player.setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreSix(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkSixs())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setSixs(addUpperSection(faceValues,6));
				player.setCurrentScore(upperBonus(player));
				player.setAdditionYahtzee();
			}else {
				player.setSixs(addUpperSection(faceValues,6));
				player.setCurrentScore(upperBonus(player));
			}
		scored = true;
		}
		return scored;
	}
	
	public boolean ScoreSS(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkSmallStraight())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setSmallStraight(30);
				player.setAdditionYahtzee();
			}else {
				player.setSmallStraight(checkSmallStraight(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreLS(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkLargeStraight())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setLargeStraight(40);
				player.setAdditionYahtzee();
			}else {
				player.setLargeStraight(checkLargeStraight(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreTK(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkThreeKind())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setThreeKind(checkThreeKind(faceValues));
				player.setAdditionYahtzee();
			}else {
				player.setThreeKind(checkThreeKind(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFK(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkFourKind())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50 ) {
				player.setFourKind(checkFourKind(faceValues));
				player.setAdditionYahtzee();
			}else {
				player.setFourKind(checkFourKind(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreChance(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkChance())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50) {
				player.setChance(chance(faceValues));
				player.setAdditionYahtzee();
			}else {
				player.setChance(chance(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFH(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.checkFullHouse())) {
			if(player.checkYahtzee() && checkYahtzee(faceValues) == 50 ) {
				player.setFullHouse(25);
				player.setAdditionYahtzee();
			}else {
				player.setFullHouse(checkFullHouse(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public int checkYahtzee(int[] dices) {
		int sum = 0;
		
		for(int i = 0; i <= 6; i++) {
			int counter = 0;
			for(int j = 0; j < 5; j++) {
				
				if(dices[j] == i) {
					counter++;
				}
				
				if(counter > 4) {
					sum = 50;
				}
			}
		}
		
		return sum;	
	}
	
	public int checkLargeStraight(int[] dices) {
		Arrays.sort(dices);
		
		if((dices[0] == 1 &&
		    dices[1] == 2 &&
		    dices[2] == 3 &&
		    dices[3] == 4 &&
		    dices[4] == 5)||
		   (dices[0] == 2 &&
			dices[1] == 3 &&
			dices[2] == 4 &&
			dices[3] == 5 &&
		    dices[4] == 6)) {
			return 40;
		}
			return 0;
	}
	
	public int checkSmallStraight(int[] dices) {
		Arrays.sort(dices);
		
		for(int i = 0; i < 4 ; i++) {
			int temp = 0;
			if(dices[i] == dices[i+1]) {
				temp = dices[i];
				
				for(int j = i; j < 4; j++) {
					dices[j] = dices[j+1];
				}
				
				dices[4] = temp;
			}
		}
		
		if((dices[0] == 1 && dices[1] == 2 && dices[2] == 3 && dices[3] == 4)||
		   (dices[0] == 2 && dices[1] == 3 && dices[2] == 4 && dices[3] == 5)||
		   (dices[0] == 3 && dices[1] == 4 && dices[2] == 5 && dices[3] == 6)||
		   (dices[1] == 1 && dices[2] == 2 && dices[3] == 3 && dices[4] == 4)||
		   (dices[1] == 2 && dices[2] == 3 && dices[3] == 4 && dices[4] == 5)||
		   (dices[1] == 3 && dices[2] == 4 && dices[3] == 5 && dices[4] == 6)) {
			return 30;
		}
			
			return 0;
	}
	
	public int checkFullHouse(int[] dices) {
		Arrays.sort(dices);
		
		if(((dices[0] == dices[1] && dices[1] == dices[2]) &&
		    (dices[3] == dices[4] && dices[2] != dices[3])) ||
			((dices[0] == dices[1]) && (dices[2] == dices[3] &&
			 dices[3] == dices[4] && dices[1] != dices[2]))) {
			
			return 25;
		}
			
		
		return 0;
	}
	
	public int checkThreeKind(int[] dices) {
		int sum = 0;
		boolean threeKind = false;
		
		for(int i = 0; i <= 6; i++) {
			int counter = 0;
			for(int j = 0; j < 5; j++) {
				
				if(dices[j] == i) {
					counter++;
				}
				
				if(counter > 2) {
					threeKind = true;
				}
			}
		}
		
		if(threeKind) {
			for(int i = 0; i < 5; i++) {
				sum += dices[i];
			}
		}
		return sum;
		
	}
	
	public int checkFourKind(int[] dices) {
		int sum = 0;
		boolean fourKind = false;
		
		for(int i = 0; i <= 6; i++) {
			int counter = 0;
			for(int j = 0; j < 5; j++) {
				
				if(dices[j] == i) {
					counter++;
				}
				
				if(counter > 3) {
					fourKind = true;
				}
			}
		}
		
		if(fourKind) {
			for(int i = 0; i < 5; i++) {
				sum += dices[i];
			}
		}

		return sum;
		
	}
	
	public int addUpperSection(int[] dices, int category) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			if(dices[i] == category) {
				sum += dices[i];
			}
		}
		return sum;
	}
	
	public int chance(int[] dices) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += dices[i];
		}
		return sum;	
	}
	
	public boolean additionYahtzeeHelper(int[] dices) {
		boolean check = false;
		if(dices[0] == 1) {
			check = player.checkOnes();
		}else if(dices[0] == 2) {
			check = player.checkTwos();
		}else if(dices[0] == 3) {
			check = player.checkThrees();
		}else if(dices[0] == 4) {
			check = player.checkFours();
		}else if(dices[0] == 5) {
			check = player.checkFives();
		}else {
			check = player.checkSixs();
		}
		return check;
	}
	
	public int upperBonus(Player player) {
		int bonus = 0;
		if(player.getUpperScore() >= 63) {
			bonus = 35;
		}
			
		return bonus;
	}
	
	public boolean checkSecondCategory(Boolean category) {
		boolean scored = false;
		
		if(category) {
			scored = true;
		}
		
		return scored;
	}
	
	public int [] rollDice() {
		int [] facevalues = new int[dices.length];
		for(int i = 0; i < dices.length; i++) {
			dices[i].roll();
			facevalues[i] = dices[i].getFaceValue();
			//System.out.print(dices[i].getFaceValue());
		}
		//show dices value string on player interface
		
		return facevalues;
	}
	public int[] inputConverter(String str) {
		String[] splited = str.split(" ");
		
		int[] hold = new int[splited.length];
		for(int i = 0; i < splited.length; i++) {
		    hold[i] = Integer.parseInt(splited[i]);
		}
		return hold;
	}
	public int[] rerollHelper(int[]hold) {
		int[] helper = new int[5];
		for(int i = 0; i < helper.length;i++) {
			helper[i] = 0;
		}
		
		for(int i = 0; i < hold.length; i++) {
			helper[hold[i]-1] = hold[i];
		}
		
		return helper;
	}
	public int[] rerollDice(int[] hold) {
		int[]face = new int[5];
		for(int i = 0; i < hold.length;i++) {
			if(hold[i] == 0) {
				dices[i].roll();
			}
			face[i] = dices[i].getFaceValue();
		}
		return face;
	}
	
	public int getRerollCount() {
		return rerollcount;
	}
	
}
