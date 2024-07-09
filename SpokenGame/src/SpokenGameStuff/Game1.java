package SpokenGameStuff;
import LocationsInTheGame.ShopFrontLocation;


import Menu.UserName;



public class Game1 {
	
	public static String name;
	
	public static void obtainUserName() {
		UserName userName = new UserName();
		userName.selectCharName();
		name = userName.charName;
	}
	

	
     public static void GameMain(){
    	 
    	 ShopFrontLocation.enterShop();
    	 
    	 
    	 
     }

}
