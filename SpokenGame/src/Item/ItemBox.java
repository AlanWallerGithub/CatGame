package Item;

public class ItemBox {
	
	// Item types
	public final static String item0 = "Empty";
	public final static String item1 = "Chicken";
	public final static String item2 = "Celery";
	public final static String item3 = "Tripe";
	public final static String item4 = "Coriander";
	
	// This is the array of items
	
	public static String[] itemArray = {item0,item0,item0,item0,item0};
	
	
	public static boolean introduceElement(String element) {
		
		int i = 0;
		boolean itemsAreFull = false;
		boolean exitLoop = false;
		
		while(exitLoop ==false && i < itemArray.length) {
			
			if(ItemBox.itemArray[i]==ItemBox.item0) {
		
				
				switch(element) {
				case item1:
					ItemBox.itemArray[i]=ItemBox.item1;
					break;
				case item2:
					ItemBox.itemArray[i]=ItemBox.item2;
					break;
				case item3:
					ItemBox.itemArray[i]=ItemBox.item3;
					break;
				case item4:
					ItemBox.itemArray[i]=ItemBox.item4;
					break;
	
				}
				exitLoop = true;
			}
		
			i++;
			if (i == itemArray.length && exitLoop == false) {
				itemsAreFull = true;
			}
		}
		
		return itemsAreFull;
	}
	
	public static boolean deleteElement(String element) {
		
		int i = 0;
		boolean itemsAreEmpty = false;
		boolean exitLoop = false;
		
		while(exitLoop ==false && i < itemArray.length) {
			
			if(ItemBox.itemArray[i]==element) {
		
				
				switch(element) {
				case item1:
					ItemBox.itemArray[i]=item0;
					break;
				case item2:
					ItemBox.itemArray[i]=item0;
					break;
				case item3:
					ItemBox.itemArray[i]=item0;
					break;
				case item4:
					ItemBox.itemArray[i]=item0;
					break;
	
				}
				exitLoop = true;
			}
		
			i++;
			if (i == itemArray.length && exitLoop == false) {
				itemsAreEmpty = true;
			}
		}
		
		return itemsAreEmpty;
		
	}
	
	
	
	

}
