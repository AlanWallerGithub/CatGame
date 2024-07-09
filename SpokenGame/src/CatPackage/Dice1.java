package CatPackage;

import java.util.Random;

public class Dice1 {
	
	static Random rand = new Random();
	
	public static int throwDice() {
		int rand_int1 = rand.nextInt(15);
		
		return rand_int1;
	}
	
	

}
