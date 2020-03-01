package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileImporter {
	File file = new File("C:\\Users\\student22\\Desktop\\Hangman\\java-hangman\\src\\main\\resources");
	ArrayList<String> list = new ArrayList<>();

	public List<String> Convert() throws FileNotFoundException { 
		Scanner scan;
		scan = new Scanner(new BufferedReader(new FileReader(file)));
		list.add(scan.nextLine());
		scan.close();
		return list;
	}
	
	public String Losowanie() {
		int randomIndex = (int) (Math.random() * this.list.size());
		return this.list.get(randomIndex);
	}
	
	public String Losowanie(int wordLength) {
		ArrayList<String> newList = new ArrayList<>();
		
		for (int i=0;i<list.size();i++) {
			if (list.get(i).length()==wordLength) {
				newList.add(list.get(i));
			}
		}
		int randomIndex = (int) (Math.random() * newList.size());
		return newList.get(randomIndex);
	}
}
