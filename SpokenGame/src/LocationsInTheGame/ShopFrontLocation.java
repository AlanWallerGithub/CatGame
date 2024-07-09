package LocationsInTheGame;

import java.util.Scanner;


import Event.EventManager;
import SpokenGameStuff.Game1;
import SpokenGameStuff.ShopKeeper;

public class ShopFrontLocation {
	
	// Create scanner
	static Scanner scanner = new Scanner(System.in);

	public static boolean firstVisit = true;
	
	public static void enterShop() {
		//First, we get the initial text
   	 
		if (firstVisit == true) {
		  	 Game1.obtainUserName();
		  	 firstVisit = false;
		}
		
 
   	 
   	 
   	 
   	 EventManager.callEvent("You enter a shop. There is a shopkeeper who asks you about how you are. What do you say?\nSelect 1 for: 'What do you have in the shop?'\tSelect 2 for: 'Where could I go?'\n");
   	 
   	 
   	
   		
   		int firstOption = scanner.nextInt();
   		
   		if (firstOption == 1) {
   			EventManager.callEvent(Game1.name.toUpperCase()+": What do you have in the shop?");
   		}else {
   			EventManager.callEvent(Game1.name.toUpperCase()+": Where could I go?");
   		}
	
   		EventManager.callEvent(ShopKeeper.speak(firstOption));
   	if (firstOption == 1) {
   		ShopKeeper.shop();
 
   	 } else if (firstOption == 2) {
   		BasementLocation.goToBasement();
   	 }
	}
	
	
	
}
