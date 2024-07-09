package LocationsInTheGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Item.ItemBox;
import SpokenGameStuff.Game1;
import Utilities.VariableFinder;

public class BasementLocation {
	
	// Lights
	
	static int lights = 0;
	
	// LUNCH has been completed
	
	static boolean lunchCompleted = true;
	
	// Or ONE of the foods completed
	
	static boolean oneFood = false;
	
	// Your PREVIOUS lunch choices
	// This SHOULD keep the state
	static String choice1;
	static String choice2;
	
	//Random stuff
	static Random rand = new Random();
	
	// Create scanner
	static Scanner scanner = new Scanner(System.in);

	// ***********
	
	public static void goToBasement() {
	
	int stayOrLeaveBasement = -1;
	// Here we need to go to basement

	
	System.out.println("\nYou are now in the basement. It is a room with a chair around a table, some books, and some other stuff. Here the cat can't attack you");
	
	System.out.println("\nSHOPKEEPER: I propose a lunch with you. Have lunch with me?\n1: LUNCH\n2: GO BACK TO SHOPFRONT");
	
	stayOrLeaveBasement = scanner.nextInt();
	
	if (stayOrLeaveBasement == 2) {
		
		System.out.println("Right-o");
		Game1.GameMain();
		
	}else if (stayOrLeaveBasement == 1) {
		System.out.println("Sure, let's have lunch");
		BasementLocation.haveLunch();
	}
	}
	
	public static void haveLunch() {
		
		
		
	if (lunchCompleted == true) {
		  int rand_int1 = rand.nextInt(4);
		    int rand_int2 = rand.nextInt(4);
		    
		  //Make the choices
		     choice1 = "item"+(rand_int1+1);
		     choice2 = "item"+(rand_int2+1);
	}

	  
	    

	    
	    
		
	System.out.println("This is a great lunch we're going to have. I would like some "+VariableFinder.findVar(choice1)+" combined with "+VariableFinder.findVar(choice2)+", yum! That would be nice.");
		
	
	boolean bothItems = false;

	
		if (Arrays.asList(ItemBox.itemArray)
		        .contains(VariableFinder.findVar(choice1))) {
			
		
			ItemBox.deleteElement(VariableFinder.findVar(choice1));
			
			if(Arrays.asList(ItemBox.itemArray)
			        .contains(VariableFinder.findVar(choice2))) {
				
				
				ItemBox.deleteElement(VariableFinder.findVar(choice2));
				
				System.out.println("Oh, nice! You have both ingredients! Let's have lunch!\nCURRENT ITEMS IN YOUR BOX:\n"+Arrays.toString(ItemBox.itemArray));
				System.out.println("Thank you!\nAs a prize, I will activate one of the 4 lights");
				lights++;
				
				if (lights == 4) {
					System.out.println("All 4 lights have been activated!! Oh no, this will open the portal..\nTHE END");
				}else {
					System.out.println("So far, you have managed to make me turn on "+lights+" out of 4 lights");
				}
				oneFood = false;
				lunchCompleted = true;
				
				bothItems = true;
			}
			
			if (bothItems == false) {
				
				if (oneFood == true) {
System.out.println("WE COMPLETED the lunch!! Ah that was delicious! Thank you!\nAs a prize, I will activate one of the 4 lights");
					
					lights++;
					
					if (lights == 4) {
						System.out.println("All 4 lights have been activated!! Oh no, this will open the portal..\nTHE END");
					}else {
						System.out.println("So far, you have managed to make me turn on "+lights+" out of 4 lights");
					}
					
					oneFood = false;
					lunchCompleted = true;
				}else {
					System.out.println("Oh, you only have ONE ingredient! I'll take it anyway and wait for the other, thank you!\nCURRENT ITEMS IN YOUR BOX:\n"+Arrays.toString(ItemBox.itemArray));
					
					oneFood = true;
					lunchCompleted = false;
				}
			
				
		
			}
			
			

		}else if (Arrays.asList(ItemBox.itemArray)
		        .contains(VariableFinder.findVar(choice2))) {
			
		
			ItemBox.deleteElement(VariableFinder.findVar(choice2));
			
			if(Arrays.asList(ItemBox.itemArray)
			        .contains(VariableFinder.findVar(choice1))) {
				
				
				ItemBox.deleteElement(VariableFinder.findVar(choice1));
				
				System.out.println("Oh, nice! You have both ingredients! Let's have lunch!\nCURRENT ITEMS IN YOUR BOX:\n"+Arrays.toString(ItemBox.itemArray));
				
				System.out.println("Thank you!\nAs a prize, I will activate one of the 4 lights");
				lights++;
				
				if (lights == 4) {
					System.out.println("All 4 lights have been activated!! Oh no, this will open the portal..\nTHE END");
				}else {
					System.out.println("So far, you have managed to make me turn on "+lights+" out of 4 lights");
				}
				oneFood = false;
				lunchCompleted = true;
			
				bothItems = true;
			}
			
			if (bothItems == false) {
				
				if (oneFood == true) {
					System.out.println("WE COMPLETED the lunch!! Ah that was delicious! Thank you!\nAs a prize, I will activate one of the 4 lights");
					
					lights++;
					
					if (lights == 4) {
						System.out.println("All 4 lights have been activated!! Oh no, this will open the portal..\nTHE END");
					}else {
						System.out.println("So far, you have managed to make me turn on "+lights+" out of 4 lights");
					}

					
					oneFood = false;
					lunchCompleted = true;
				}else {
					System.out.println("Oh, you only have ONE ingredient! I'll take it anyway and wait for the other, thank you!\nCURRENT ITEMS IN YOUR BOX:\n"+Arrays.toString(ItemBox.itemArray));
					
					oneFood = true;
					lunchCompleted = false;
				}
			

			}
	
		}else if (Arrays.asList(ItemBox.itemArray)
		        .contains(VariableFinder.findVar(choice1)) == false && Arrays.asList(ItemBox.itemArray)
				        .contains(VariableFinder.findVar(choice2)) == false) {
		
			System.out.println("You have no ingredients! Don't worry, you can come back some other time\nBut remember! Our lunch is to be:\n"+VariableFinder.findVar(choice1)+" combined with "+VariableFinder.findVar(choice2)+"\nYOU RETURN TO THE SHOP");
			lunchCompleted = false;
			ShopFrontLocation.enterShop();
			return;
		}
		if (lights != 4) {
			goToBasement();
		}
		
	}
}
