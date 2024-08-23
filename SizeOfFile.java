package com.vedait.assignments.fileHandling;

import java.io.File;

public class SizeOfFile {
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		printSize(path);
	}

	private static void printSize(String path) {
		File file = new File(path);
		long bytes=file.length();
		System.out.println(bytes+" bytes");
		System.out.println((double)bytes/1024+" kb");
		System.out.println(((double)bytes/1024)/1024+" mb");
		
		
	}
}
