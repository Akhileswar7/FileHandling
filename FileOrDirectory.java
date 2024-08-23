package com.vedait.assignments.fileHandling;


import java.io.File;

public class FileOrDirectory {

	public static void main(String[] args) {
		
		String path="C:\\Users\\gajja\\Downloads\\filehandling";
		Check(path);
		
	}

	private static void Check(String path) {
		File file =new File(path);
		if(file.exists()) {
			System.out.println("Directory or file is present");
			if(file.isFile()) 
			System.out.println(" and it is a file");
			else 
			System.out.println(" and it is a directory");
		} else {
			System.out.println("Directory or file not present");
		}
	}

}

