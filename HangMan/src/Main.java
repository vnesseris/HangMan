import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the game of HangMan");
		ArrayList<String> letters = new ArrayList<String>();
		Word word = new Word();
		boolean playing = true;
		
		while(playing) {
			//Random Choice of Word 
			String chosen = word.getWord(word.getRandom());
			Scanner myscan = new Scanner(System.in);
			Scanner newgame = new Scanner(System.in);
			String hidden = "";
			//Replace letters with dash
			for(int i=0;i<chosen.length();i++) {
				hidden += '-';
			}
			System.out.println("The hidden word is " + hidden);
			int lives = 10;
			
			while (lives > 0 && !hidden.equals(chosen) ){
				System.out.println("Please choose a letter: ");
				String letter = myscan.nextLine();
				//Checks if the player chose this letter again
				while(letters.contains(letter)) {
					System.out.println("You already chose this letter. Please choose another");
					letter = myscan.nextLine();
				}
				letters.add(letter);
				//Checks if player chose correctly and replaces dashes with letters
				if(chosen.contains(letter.toUpperCase())) {
					System.out.println("Well Done\n");
					for(int i=0; i<chosen.length(); i++) {
						if(chosen.charAt(i) == letter.toUpperCase().charAt(0)) {
							hidden = hidden.substring(0,i) + letter.toUpperCase() + hidden.substring(i+1, hidden.length());
						}
					}
				}
				//If the player chose wrong reduces his lives and prompts him to choose again
				else {
					System.out.println("Sorry, please choose again!");
					lives -= 1;
					System.out.println("You have " + lives + " lives left\n");
				}
				System.out.println("The hidden word is " +hidden);
			}
			//Checks if the player lost or if he won
			if(lives == 0) {
				System.out.println("You lost. Please try again\n");
				
			}
			else if(hidden.equals(chosen)) {
				System.out.println("Congrats");
			}
			System.out.println("Would you like to play another game? (Y/N)\n");
			String playingagain = newgame.nextLine();
			if(playingagain.toUpperCase().equals("Y")) {
				playing = true;			
				letters.clear();
			}
			else {
				playing = false;
			}
		}
		
		
		}
		




}