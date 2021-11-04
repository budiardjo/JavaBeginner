import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Do you want to procedd (y/n) ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		switch (input) {
		case "y":
			System.out.println("Proceding . . . . ");
			break;
		case "n":
			System.out.println(" NOt Proceding . . . . ");
			break;
		default:
			System.out.println("Unrecognizing option");
			break;
		}
		
	}

}
