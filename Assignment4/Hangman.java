/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {
	private int guessTimes = 8;
	//private HangmanLexicon lexicon = new HangmanLexicon();
	
	public void init() {
		canvas = new HangmanCanvas();
		add(canvas);
	}
	private HangmanCanvas canvas;

    public void run() {
		/* You fill this in */
    	canvas.reset();
    	HangmanLexicon lexicon = new HangmanLexicon();
        println("Welcome to Hangman!");
        //int r1 = lexicon.getWordCount(); // return how many words the list have
        //int r2 = rgen.nextInt(1, r1); // random number
        //String Word = lexicon.getWord(r2); //returnWords store a random word
    	playGames: while(true) {
    		/**1. Choose a random word*/    		
        	String Word = lexicon.getWord(rgen.nextInt(0,lexicon.getWordCount()));
        	/*Generate ______ */
        	String guessWord = "";
        	String guessChar = "";
            for(int i = 0; i < Word.length(); i++) {
            	guessWord += '¡ª';
            }
        	/**2. Keep track of the user¡¯s partially guessed word*/

        	while(guessTimes>0 && guessWord.indexOf("¡ª")>=0) {
        		println("The word now looks like this:"+" "+guessWord);
        		println("You have "+guessTimes+" "+ "guessTimes left.");
        		String guess = readLine("Your guess: ");
        		if (guess.equals("")|| guess.length()>1) {
        			println("Invalid input!");
        			continue;
        		}
        		guess = guess.toUpperCase();
        		guessChar += guess; 
        		if (Word.indexOf(guess)<0) {
        			println("There are no  "+guess+"'S "+"in the word.");
        			guessTimes--;
        			canvas.displayWord(guessWord);
        			canvas.noteIncorrectGuess(guessChar,guessTimes);
        		} else {
        			println("That guess is correct.");
        			/**Return the update guessWord*/
        			guessWord = updateWord(guessWord,guess,Word);
        		}
        	}
    		/** Check win or lose*/
    		if (guessWord.indexOf("¡ª")<0) {
    			println("You win.");
    		} else {
    			println("You lose.");
    		} 
    		
    		/**Continue playing or not?*/
    		String YN = readLine("Continuew playing? Y/N ");
    		if (YN.equals("N")) {
    			break playGames;
    		}
    	}    	
	}
    
    /**Be careful about the comparism */
    private String updateWord(String ToB, String oR, String notToB) {     			
	    for (int i=0;i<notToB.length();i++) {
			if (oR.charAt(0)==notToB.charAt(i)) {
				ToB = ToB.substring(0, i)+oR+ToB.substring(i+1);
			}
		}
	    return ToB;
    }
    
    private RandomGenerator rgen = new RandomGenerator();
    private String guessWrod;

}
