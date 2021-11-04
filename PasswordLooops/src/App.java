import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter Password > ");
			String password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("Acces granted.");
				break;
			}
			else {
				System.out.println("Acces Denied");
			}
		}
		
		scanner.close();
		
	}
}
