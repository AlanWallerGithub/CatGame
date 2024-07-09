package CatPackage;

import java.util.Arrays;

import Item.ItemBox;

public class Cat1 {
	
	public static boolean gameOverVariable = false;
	
	public static void catAppears() {
		
		System.out.println("************************\nCAT ATTACK\n************************");
		
		System.out.println("Meow! I am a cat! I roam this neighborhood. I am here to steal your items.");
		
		
		if (ItemBox.itemArray[0] == ItemBox.item0 && ItemBox.itemArray[1] == ItemBox.item0 && ItemBox.itemArray[2] == ItemBox.item0 && ItemBox.itemArray[3] == ItemBox.item0 && ItemBox.itemArray[4] == ItemBox.item0) {
			System.out.println("You have no items! I will eat you instead! GAME OVER");
			
			gameOverVariable = true;
		
			
		}else {
			
			for(int i = 0;i<ItemBox.itemArray.length;i++) {
				if(ItemBox.itemArray[i]!=ItemBox.item0) {
					System.out.println("Meow! I stole your item: "+ItemBox.itemArray[i]);
					
					System.out.println("************************\nENOUGH\n************************");
					
					ItemBox.itemArray[i]=ItemBox.item0;
					
					System.out.println("Now you have "+Arrays.toString(ItemBox.itemArray));
					
					return;
				}
				
			}
			
		}
		
		
		
	}
	
	

}
