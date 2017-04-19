/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.BufferedReader;
import acm.program.*;
import java.util.*;
import java.io.*;
import acm.util.*;

public class HangmanLexicon extends ConsoleProgram {
/** This is the HangmanLexicon constructor */
	public HangmanLexicon() {
		//ArrayList<String> wordList = new ArrayList<String>();
		String fileName = "ShorterLexicon.txt";
		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader(fileName));
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}

		
		try {
			while (rd != null) {
				String lineWord = rd.readLine();
				if (lineWord == null) break;
				wordList.add(lineWord);
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}

		
	}

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return wordList.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		return wordList.get(index);
	};
	
	//public ArrayList<String> wordList;
	private ArrayList<String> wordList = new ArrayList<String>();

}
