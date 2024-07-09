package SpokenGameStuff;

import java.util.Arrays;

import java.util.Scanner;

import Event.EventManager;
import Item.ItemBox;
import LocationsInTheGame.ShopFrontLocation;

public class ShopKeeper {
	// Create scanner
		static Scanner scanner = new Scanner(System.in);
	
	

	
	public static String speak(int option) {
		
		String resultString = "";
		
		switch(option) {
		case 1:
			resultString = "SHOPKEEPER: Here is my menu:";
			break;
			
		case 2:
			resultString = "SHOPKEEPER: You can go to the basement. Let's go";
			break;
		}
	return resultString;
		
	}

	
	public static void shop() {
		int decideToShop = 1;
		while(decideToShop == 1) {
			EventManager.callEvent("Here's my menu for the shop.\nI have:\nAn item called "+ItemBox.item1+"\nAn item called "+ItemBox.item2+"\nAn item called "+ItemBox.item3+"\nAn item called "+ItemBox.item4+"\n\nWhich do you want?\n*Select 1 for "+(ItemBox.item1).toUpperCase()+"*\n*Select 2 for "+(ItemBox.item2).toUpperCase()+"*\n*Select 3 for "+(ItemBox.item3).toUpperCase()+"*\n*Select 4 for "+(ItemBox.item4).toUpperCase()+"*\n");
		
		int shopOption = scanner.nextInt();
		
		switch(shopOption) {
		case 1:
			boolean result1 = ItemBox.introduceElement(ItemBox.item1);
			if (result1 == false) {
				EventManager.callEvent("You have purchased item "+(ItemBox.item1).toUpperCase());
			}else {
				EventManager.callEvent("No more than 10 items, please!!");
			}
			
			break;
		case 2:
			boolean result2 = ItemBox.introduceElement(ItemBox.item2);
			if (result2 == false) {
				EventManager.callEvent("You have purchased item "+(ItemBox.item2).toUpperCase());
			}else {
				EventManager.callEvent("No more than 10 items, please!!");
			}
			break;
		case 3:
			boolean result3 = ItemBox.introduceElement(ItemBox.item3);
			if (result3 == false) {
				EventManager.callEvent("You have purchased item "+(ItemBox.item3).toUpperCase());
			}else {
				EventManager.callEvent("No more than 10 items, please!!");
			}
			break;
		case 4:
			boolean result4 = ItemBox.introduceElement(ItemBox.item4);
			if (result4 == false) {
				EventManager.callEvent("You have purchased item "+(ItemBox.item4).toUpperCase());
			}else {
				EventManager.callEvent("No more than 10 items, please!!");
			}
			break;
		}
		
		EventManager.callEvent("Do you want to continue shopping? Your current Item Box is like this: \n"+Arrays.toString(ItemBox.itemArray)+"\nSelect 1 for YES\tSelect 2 for NO");
		
		decideToShop = scanner.nextInt();
	
	}
		
		
		
		EventManager.callEvent("You stopped shopping");
		
		ShopFrontLocation.enterShop();
		
	}
	
	
}
