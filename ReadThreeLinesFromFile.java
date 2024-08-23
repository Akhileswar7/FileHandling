package com.vedait.assignments.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadThreeLinesFromFile {
	
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		read(path);
	}

	private static void read(String path) {
		try {
		FileReader fileReader=new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		for(int i=0;i<3;i++) {
			System.out.println(bufferedReader.readLine());
		}
		bufferedReader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
