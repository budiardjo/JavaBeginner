import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessGranted = false;
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter password >");
			String input = scanner.nextLine();
			
			if (input.equals(USER_PASSWORD)) {
				System.out.println("Access granted.");
				accessGranted = true;
				break;
			}
			else {
				System.out.println("Incorrect password.");
			}
		}
		
		scanner.close();

		
		if(!accessGranted) {
			System.out.println("Access Denied");
		}
		
	}

}
