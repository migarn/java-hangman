package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {
	private Game game;
	private FileImporter fileImporter;
	
	public UserInterface() throws FileNotFoundException {
		this.fileImporter = new FileImporter();
		this.game = new Game(this.fileImporter.Losowanie());
	}
	
	public void initialize() {
		System.out.println(game.startGame());
		
		while (true) {
			System.out.println("Podaj litere:");
			Scanner scanner = new Scanner(System.in);
			char letter = scanner.next().charAt(0);
			
			System.out.println(game.gameTurn(letter));
			
		}
	}
	
	
	

}
