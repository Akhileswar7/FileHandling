package com.vedait.assignments.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\scanner.txt";
		printLargestWord(path);
	}

	private static void printLargestWord(String path) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(path));
			String string=scanner.nextLine();
			String[] strings=string.split(" ");
			String max="";
			for(String s:strings) {
				if(s.length()>max.length()) {
					max=s;
				}
			}
			System.out.println(max);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
