package YahtzeeGame.YahtzeeGame;

import java.util.Arrays;

public class Game {
	private Player player;
	public Game(Player player) {
		this.player = player;
	}
	
	public void start(){	
		
		
	
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
	
	public boolean checkSecondCategory(int category) {
		boolean scored = false;
		
		return scored;
	}
}
