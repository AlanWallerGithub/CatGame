package Menu;
import java.util.Scanner;


public class UserName {
	
	//Character's name, publically available
	 public String charName;
	// Create scanner
		 Scanner scanner = new Scanner(System.in);
		
	public  void selectCharName() {
		
		System.out.println("Select your character's name");
		
		charName = scanner.nextLine();
		
		System.out.println("Oh, "+charName+", welcome.");

		
		
	}

}
