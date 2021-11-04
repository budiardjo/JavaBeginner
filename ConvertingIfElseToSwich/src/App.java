import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Menu");
		System.out.println("====");
		System.out.println();
		System.out.println("1. print hello");
		System.out.println("2. print how are you");
		System.out.println("3. exit program");
		System.out.println();
		System.out.println("Enter an option > ");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		
		if ( input > 100) {
			System.out.println(" you found me, the gods of obelisk");
		} else {
			switch(input) {
			case 1:
				System.out.println("Hello");
				break;
			case 2:
				System.out.println("How are you?");
				break;
			case 100:
				System.out.println("awawawawwawa");
				break;
			case 3:
				System.out.println("Existing...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option....");
				break;
			}
			
		}
		/*
		if( input == 1) {
			System.out.println("hello");
		}
		else if (input == 2 ) {
			System.out.println("exiting...");
		}
		else if (input == 3 ) {
			System.out.println("exiting...");
			System.exit(0);
		}
		else if (input > 100 ) {
			System.out.println("you found the hidden egg");
		}
		else {
			System.out.println("Invalid option.");
		}
		
		while ( input > 10) {
			
			System.out.println("you are doint it wrong, try again");
		}
		*/
	}

}
