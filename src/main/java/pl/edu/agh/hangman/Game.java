package pl.edu.agh.hangman;

import java.util.ArrayList;

public class Game {
	private String word;
	private String shownWord;
	private LetterChecker letterChecker;
	private int gameStage;
	
	public Game(String word) {
		this.word = word;
		this.shownWord = dashWord();
		this.letterChecker = new LetterChecker(this.word);
		gameStage = 0;
	}
	
	public String startGame() {
		StringBuilder result = new StringBuilder();
		result.append(Hangman.HANGMANPICS[gameStage]);
		result.append("\n" + this.shownWord);
		return result.toString();
	}
	
	public String gameTurn(char letter) {
		StringBuilder result = new StringBuilder();
				
		if (letterChecker.checkLetter(letter)) {
			
			this.shownWord = unDashWord(letterChecker.foundLetterIndices(letter), letter);
			result.append(Hangman.HANGMANPICS[gameStage]);
			result.append("\n" + this.shownWord);
			return result.toString();
	
		}
		else {
			this.gameStage ++;
			if (this.gameStage == 6) {
				return Hangman.HANGMANPICS[gameStage] + "\nYou failed.";
			}
			result.append(Hangman.HANGMANPICS[gameStage]);
			result.append("\n" + this.shownWord);
			return result.toString();
		}		
	}
	
	public String dashWord() {
		StringBuilder dashedWord = new StringBuilder();
		
		for (int i = 0; i < this.word.length(); i++) {
			dashedWord.append("_");
		}
		return dashedWord.toString();
	}
	
	public String unDashWord(ArrayList<Integer> indices, char letter) {
		StringBuilder unDashedWord = new StringBuilder();
		unDashedWord.append(shownWord);
		
		for (int index : indices) {
			unDashedWord.replace(index, index+1, Character.toString(letter));
		}
		
		return unDashedWord.toString();
	}
}
