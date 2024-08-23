package com.vedait.assignments.fileHandling;

import java.io.File;

public class PrintAllInFile {
	
	
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\gajja\\Downloads\\filehandling";
		PrintAllSubFolders(path);
		Print(path);
	}

	private static void Print(String path) {
		File file=new File(path);
		String[] strings=file.list();
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
		}
	}

	private static void PrintAllSubFolders(String path) {
		File file=new File(path);
		File[] files=file.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
	}
	
	
	
}
