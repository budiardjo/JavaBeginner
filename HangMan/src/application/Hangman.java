package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);
	private int triesRemaining = 5;
	private char lastGuess;
	
	public void run() {
		
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);
	}
	
	private void checkUserInput() {
		
		boolean isCorrect = word.addGuess(lastGuess);
		
		if(isCorrect) {
			if(word.isCompleted()) {
				System.out.println("you have won!");
				System.out.println("you word is: " + word);
				running = false;
			}
		}
		else { 
			triesRemaining--;
			
			if ( triesRemaining == 0) {
				System.out.println("you have lost!");
				running = false;
			}
		}
		
	}
	
	private void getUserInput () {
		
		System.out.print("Enter you guess: ");
		String guess = scanner.nextLine();
		lastGuess = guess.charAt(0);
	}
	
	void displayWord() {
		System.out.println("Tries remaining: " + triesRemaining);
		System.out.println(word);
	}

	public void close() {
		scanner.close();
	}
}
