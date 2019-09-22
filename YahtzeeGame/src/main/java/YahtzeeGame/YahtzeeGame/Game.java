package YahtzeeGame.YahtzeeGame;

public class Game {
	private Player player;
	public Game(Player player) {
		this.player = player;
	}
	
	public void start(){	
		
		
	
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
	
	public int additionYahtzee(Player player, int[] dices) {
		int addtional = 0;
		
		return addtional;
	}
	
	public int upperBonus(Player player) {
		int bonus = 0;
		
		return bonus;
	}
}
