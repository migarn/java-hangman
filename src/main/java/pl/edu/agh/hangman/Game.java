package pl.edu.agh.hangman;

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
		if (letterChecker.checkLetter(letter)) {
			letterChecker.foundLetterIndices(letter);
		}
	}
	
	public String dashWord() {
		StringBuilder dashedWord = new StringBuilder();
		
		for (int i = 0; i < this.word.length(); i++) {
			dashedWord.append("_");
		}
		return dashedWord.toString();
	}
	
	
}
