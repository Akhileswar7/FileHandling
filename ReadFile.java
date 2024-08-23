package com.vedait.assignments.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		readal(path);
	}

	private static void readal(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			ArrayList<String> i = new ArrayList<String>();
			String string;
			while((string = bufferedReader.readLine())!=null) {
				i.add(string);
			}
			for(String s:i) {
				System.out.println(s);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
