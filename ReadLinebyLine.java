package com.vedait.assignments.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLinebyLine {
	
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		read(path);
	}

	private static void read(String path) {
		try {
		FileReader fileReader=new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string;
		while((string = bufferedReader.readLine())!=null) {
			System.out.println(string);
		}
		bufferedReader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
