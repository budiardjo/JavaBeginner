package application;

public class Menu {
	
	String[] options = {"Add an item", "View items", "Delete on item", "Quit the progress"};
	
	String get() {
		
		String menuText = "Choose an option:\n";
		 	
		for (int i = 0; i < options.length; i++) {
			menuText += " " + i + ". " + options[i] + "\n";
		}
		
		return menuText;
	}
}
