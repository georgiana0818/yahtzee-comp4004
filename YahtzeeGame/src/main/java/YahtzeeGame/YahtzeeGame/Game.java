package YahtzeeGame.YahtzeeGame;

import java.util.Arrays;

public class Game {
	private Player player;
	
	public Game(Player player) {
		this.player = player;
	}
	
	public void start(){	
		
		
	
	}
	
	public Boolean handleScore(Player player, String category, int[] faceValues) {
		boolean scored = false;
		if(category.equals("1")) {
			if(!checkSecondCategory(player.checkOnes())) {
				player.setOnes(addUpperSection(faceValues,1));
				scored = true;
			}
		}else if(category.equals("2")) {
			if(!checkSecondCategory(player.checkTwos())) {
			player.setTwos(addUpperSection(faceValues,2));
			scored = true;
			}
		}else if(category.equals("3")) {
			if(!checkSecondCategory(player.checkThrees())) {
			player.setThrees(addUpperSection(faceValues,3));
			scored = true;
			}
		}else if(category.equals("4")) {
			if(!checkSecondCategory(player.checkFours())) {
			player.setFours(addUpperSection(faceValues,4));
			scored = true;
			}
		}else if(category.equals("5")) {
			if(!checkSecondCategory(player.checkFives())) {
			player.setFives(addUpperSection(faceValues,5));
			scored = true;
			}
		}else if(category.equals("6")) {
			if(!checkSecondCategory(player.checkSixs())) {
			player.setSixs(addUpperSection(faceValues,6));
			scored = true;
			}
		}else if(category.equals("7")) {
			if(!checkSecondCategory(player.checkLargeStraight())) {
			player.setLargeStraight(checkLargeStraight(faceValues));
			scored = true;
			}
		}else if(category.equals("8")) {
			if(!checkSecondCategory(player.checkSmallStraight())) {
			player.setSmallStraight(checkSmallStraight(faceValues));
			scored = true;
			}
		}else if(category.equals("9")) {
			if(!checkSecondCategory(player.checkFullHouse())) {
			player.setFullHouse(checkFullHouse(faceValues));
			scored = true;
			}
		}else if(category.equals("10")) {
			if(!checkSecondCategory(player.checkThreeKind())) {
			player.setThreeKind(checkThreeKind(faceValues));
			scored = true;
			}
		}else if(category.equals("11")) {
			if(!checkSecondCategory(player.checkFourKind())) {
			player.setFourKind(checkFourKind(faceValues));
			scored = true;
			}
		}else if(category.equals("12")) {
			if(!checkSecondCategory(player.checkChance())) {
			player.setChance(chance(faceValues));
			scored = true;
			}
		}else if(category.equals("13")) {
			if(!checkSecondCategory(player.checkYahtzee())) {
			player.setYahtzee(checkYahtzee(faceValues));
			scored = true;
			}
			
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
			for(int i = 0; i <= 5; i++) {
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
	
	public int additionYahtzee(Player player, int[] dices) {
		int addtional = 0;
		
		return addtional;
	}
	
	public int upperBonus(Player player) {
		int bonus = 0;
		
		return bonus;
	}
	
	public boolean checkSecondCategory(Boolean category) {
		boolean scored = false;
		
		if(category) {
			scored = true;
		}
		
		return scored;
	}
}
