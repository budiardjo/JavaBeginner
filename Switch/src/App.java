
public class App {

	public static void main(String[] args) {

		int option = 0;
		
		switch(option) {
		case 0 :
			System.out.println("Option 0 elected");
			break;
		case 1:
			System.out.println("option 1 selected");
			break;
		case 10:
			System.out.println("Existing program...");
			System.exit(0);
			break;
		default:
			System.out.println("invalid option");
			break;
		}
	}

}
