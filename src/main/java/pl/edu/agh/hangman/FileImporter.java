package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileImporter {
	File file = new File("C:\\Users\\student22\\Desktop\\Hangman\\java-hangman\\src\\main\\resources");
	ArrayList<String> List = new ArrayList<>();

	public List<String> Convert(File file) throws FileNotFoundException { 
		Scanner scan;
		scan = new Scanner(new BufferedReader(new FileReader(file)));
		List.add(scan.nextLine());
		return List;
	}
	
	public String Losowanie(List<String> list) {
		int randomIndex = (int) (Math.random() * list.size());
		return list.get(randomIndex);
	}
	
}
