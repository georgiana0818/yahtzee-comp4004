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
		turn(player, new InputAsker(System.in, System.out));
	
	}
	
	public void turn(Player player, InputAsker asker){
		String input = asker.ask("Press <<Enter>> to roll the dices...");
		
		
		if(input.equals("")) {
			facevalues = rollDice();
			
			System.out.println(ui.showDices(dices));
			while(rerollcount < 2) {
				if(rerollcount < 2) {
					input = validateInput(asker,displayActions());
					try {
						handleAction(input,player,facevalues,asker);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(input.equals("3")) {
					break;
				}
					
				rerollcount++;
				
				if(rerollcount == 2) {
					input = asker.ask("What category do you want to score this round against? Please enter the category number: ");
					String category = input;
					while(!handleScore(player, category, facevalues)) {
						input = asker.ask("What category do you want to score this round against? Please enter the category number: ");
						category = input;
					}
				}
			}
		}
	}
	
	public String displayActions() {
		String menu = "What action would you like to perform next\n"+
					"(1) Select dice to hold and then re-roll the other dice\n"+
					"(2) Re-roll all the dice\n"+
					"(3) Score this round";
		return menu;
	}
	
	public String validateInput(InputAsker asker, String menu) {
		String input = asker.ask(menu);
		while(true) {
			if(input.equals("1")) {
				break;
			}else if(input.equals("2")) {
				break;
			}else if(input.equals("3")) {
				break;
			}else {
				System.out.println("Please choose again!");
				input = asker.ask(menu);
			}
		}
		return input;
	}
	
	public void handleAction(String action,Player player, int[] faceValues, InputAsker asker) throws ClassNotFoundException, IOException {
			if(action.equals("1")) {
				String input = asker.ask("Please enter in the dice position that you want to hold, please separate each number with a <<space>>");
				int[] hold = rerollHelper(inputConverter(input));
				facevalues = rerollDice(hold);
				System.out.println(ui.showDices(dices));
				
			}else if(action.equals("2")) {
				facevalues = rollDice();
				System.out.println(ui.showDices(dices));
				
			}else if(action.equals("3")) {
				if(checkYahtzee(faceValues) == 50 && player.getScore().getYahtzee() != -1 && additionYahtzeeHelper(faceValues)==false) {
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
					String input = asker.ask("What category do you want to score this round against? Please enter the category number: ");
					String category = input;
					while(!handleScore(player, category, faceValues)) {
						input = asker.ask("What category do you want to score this round against? Please enter the category number: ");
						category = input;
					}
				}
			}else {
				
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
			if(checkSecondCategory(player.getScore().getYahtzee()) == false) {
				player.getScore().setYahtzee(checkYahtzee(faceValues));
				scored = true;
			}
		}
		return scored;
	}
	
	public boolean ScoreOne(int [] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getOnes())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setOnes(addUpperSection(faceValues,1));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setOnes(addUpperSection(faceValues,1));
				player.getScore().setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreTwo(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getTwos())) {
			if(player.getScore().getYahtzee()!= -1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setTwos(addUpperSection(faceValues,2));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setTwos(addUpperSection(faceValues,2));
				player.getScore().setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreThree(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getThrees())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setThrees(addUpperSection(faceValues,3));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setThrees(addUpperSection(faceValues,3));
				player.getScore().setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFour(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getFours())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50 ) {
				player.getScore().setFours(addUpperSection(faceValues,4));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setFours(addUpperSection(faceValues,4));
				player.getScore().setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFive(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getFives())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setFives(addUpperSection(faceValues,5));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setFives(addUpperSection(faceValues,5));
				player.getScore().setCurrentScore(upperBonus(player));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreSix(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getSixs())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setSixs(addUpperSection(faceValues,6));
				player.getScore().setCurrentScore(upperBonus(player));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setSixs(addUpperSection(faceValues,6));
				player.getScore().setCurrentScore(upperBonus(player));
			}
		scored = true;
		}
		return scored;
	}
	
	public boolean ScoreSS(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getSmallStraight())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setSmallStraight(30);
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setSmallStraight(checkSmallStraight(faceValues));		
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreLS(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getLargeStraight())) {
			if(player.getScore().getYahtzee()!= -1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setLargeStraight(40);
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setLargeStraight(checkLargeStraight(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreTK(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getThreeKind())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setThreeKind(checkThreeKind(faceValues));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setThreeKind(checkThreeKind(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFK(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getFourKind())) {
			if(player.getScore().getYahtzee()!= -1 && checkYahtzee(faceValues) == 50 ) {
				player.getScore().setFourKind(checkFourKind(faceValues));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setFourKind(checkFourKind(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreChance(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getChance())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50) {
				player.getScore().setChance(chance(faceValues));
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setChance(chance(faceValues));
			}
			scored = true;
		}
		return scored;
	}
	
	public boolean ScoreFH(int[] faceValues) {
		boolean scored = false;
		if(!checkSecondCategory(player.getScore().getFullHouse())) {
			if(player.getScore().getYahtzee()!=-1 && checkYahtzee(faceValues) == 50 ) {
				player.getScore().setFullHouse(25);
				player.getScore().setAdditionYahtzee();
			}else {
				player.getScore().setFullHouse(checkFullHouse(faceValues));
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
		if(dices[0] == 1 && player.getScore().getOnes()!=-1) {
			check = true;
		}else if(dices[0] == 2 && player.getScore().getTwos()!=-1) {
			check = true;
		}else if(dices[0] == 3 && player.getScore().getThrees()!=-1) {
			check = true;
		}else if(dices[0] == 4 && player.getScore().getFours()!=-1) {
			check = true;
		}else if(dices[0] == 5 && player.getScore().getFives()!=-1) {
			check = true;
		}else if(dices[0] == 6 && player.getScore().getSixs()!=-1){
			check = true;
		}
		return check;
	}
	
	public int upperBonus(Player player) {
		int bonus = -1;
		if(player.getScore().getUpperScore() >= 63 && player.getScore().getBonus() == -1) {
			bonus = 35;
			player.getScore().setBonus(bonus);
			System.out.println("Upper Score is higher than or equal to 63. You earn an upper bonus");
		}
		
		if(player.getScore().getOnes()!=-1&&player.getScore().getTwos()!=-1&&player.getScore().getThrees()!=-1
		  &&player.getScore().getFours()!=-1&&player.getScore().getFives()!=-1&&player.getScore().getSixs()!=-1
		  &&player.getScore().getUpperScore() < 63 && player.getScore().getBonus()==-1) {
			bonus = 0;
			player.getScore().setBonus(bonus);
		}
		return bonus;
	}
	
	public boolean checkSecondCategory(int isScored) {
		boolean scored = false;
		
		if(isScored != -1) {
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
		int[] hold = new int[] {0,0,0,0,0};
		
		if(str.length()!=0) {
			String[] splited = str.split(" ");
			
			 hold = new int[splited.length];
			 for(int i = 0; i < splited.length; i++) {
			    hold[i] = Integer.parseInt(splited[i]);
			 }
		}
		return hold;
	}
	public int[] rerollHelper(int[]hold) {
		int[] helper = new int[5];
		for(int i = 0; i < helper.length;i++) {
			helper[i] = 0;
		}
		
		for(int i = 0; i < hold.length; i++) {
			if(hold[i] != 0) {
				break;
			}else if(i == 4 && hold[i] == 0) {
				return helper;
			}
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
	
	public void setDice(int[] dice) {
		for(int i = 0; i< dice.length; i++) {
			facevalues[i] = dice[i]; 
		}
	}
	
}
