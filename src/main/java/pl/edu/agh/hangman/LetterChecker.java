package pl.edu.agh.hangman;

import java.util.ArrayList;

public class LetterChecker {
	private String word;

	public LetterChecker(String wordToCheck) {
		this.word = wordToCheck.toUpperCase();
	}
	
	public boolean checkLetter(char letter) {
		return this.word.contains(Character.toString(letter).toUpperCase());
	}
	
	public ArrayList<Integer> foundLetterIndices(char letter) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		
		for (int i = 0; i < this.word.length(); i++) {
			if (this.word.charAt(i) == Character.toUpperCase(letter)) {
				indices.add(i);
			}
		}
		return indices;
	}
}
