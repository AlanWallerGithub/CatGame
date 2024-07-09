package Utilities;

import Item.ItemBox;

public class VariableFinder {

	public static String findVar(String stringName) {
		
		String result = "";
		
		//Find variables that have this name
		
		switch(stringName) {
		case "item0":
			result = ItemBox.item0;
			break;
		case "item1":
			result = ItemBox.item1;
			break;
		case "item2":
			result = ItemBox.item2;
			break;
		case "item3":
			result = ItemBox.item3;
			break;
		case "item4":
			result = ItemBox.item4;
			break;
		}
		
		return result;
		
	}
	
}
