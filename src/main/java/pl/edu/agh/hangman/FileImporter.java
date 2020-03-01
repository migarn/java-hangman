package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileImporter {
	File file = new File("C:\\Users\\student13\\Desktop\\hangman\\java-hangman\\src\\main\\java\\pl\\edu\\agh\\hangman\\slowa.txt");
	ArrayList<String> list = new ArrayList<>();
	
	public String Losowanie() throws FileNotFoundException {
		Scanner scan;
		scan = new Scanner(new FileReader(file));
		while (scan.hasNext()) {
			this.list.add(scan.nextLine());
		}
		scan.close();
		
		int randomIndex = (int) (Math.random() * this.list.size());
		return this.list.get(randomIndex);
	}
	
}
