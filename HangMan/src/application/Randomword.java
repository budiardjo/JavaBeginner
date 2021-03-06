package application;

import java.util.Random;

/*
 * y father?s family name being Pirrip, and my Christian name Philip, my infant tongue could make of both names nothing longer or more explicit than Pip. So, I called myself Pip, and came to be called Pip.

I give Pirrip as my father?s family name, on the authority of his tombstone and my sister,?Mrs. Joe Gargery, who married the blacksmith. As I never saw my father or my mother, and never saw any likeness of either of them (for their days were long before the days of photographs), my first fancies regarding what they were like were unreasonably derived from their tombstones. The shape of the letters on my father?s, gave me an odd idea that he was a square, stout, dark man, with curly black hair. From the character and turn of the inscription, ?Also Georgiana Wife of the Above,? I drew a childish conclusion that my mother was freckled and sickly. To five little stone lozenges, each about a foot and a half long, which were arranged in a neat row beside their grave, and were sacred to the memory of five little brothers of mine,?who gave up trying to get a living, exceedingly early in that universal struggle,?I am indebted for a belief I religiously entertained that they had all been born on their backs with their hands in their trousers-pockets, and had never taken them out in this state of existence.
 */



public class Randomword {
	private String[] words = {"family", "never", "belief", "taken" , "existence", "indebted", " Wife", "freckled", "grave" , "exceedingly", "struggle"};
	private String chosenWord;
	private Random random = new Random();
	private char[] characters;
	
	public Randomword() {
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()]; 
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (char c: characters) {
			sb.append(c == '\u0000' ? '_': c);
			sb.append(' ');
		}
		
		return sb.toString();
	}

	public boolean isCompleted() {
		for(char c: characters) {
			if(c == '\u0000') {
				return false;
			}
		}
		return true;
	}
	
	public boolean addGuess(char c) {
		
		boolean correct = false; 
		
		for (int i=0; i<chosenWord.length(); i++) {
			if(c == chosenWord.charAt(i)) {
				characters [i] = c;
				correct = true;
			}
		}
		return correct;
	}
	
	
	
}
