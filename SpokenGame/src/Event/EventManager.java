package Event;

import CatPackage.Cat1;
import CatPackage.Dice1;

public class EventManager {
	
	
	
	public static void callEvent(String event) {
		
		if (Dice1.throwDice() == 7) {
			Cat1.catAppears(); 
		}
		
		if(Cat1.gameOverVariable == false) {
			System.out.println(event);
		}else if (Cat1.gameOverVariable == true) {
			//Game ends
			System.exit(0);
		}
		
		
		
		
		
		
	}

}
