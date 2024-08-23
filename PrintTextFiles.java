package com.vedait.assignments.fileHandling;

import java.io.File;

public class PrintTextFiles {
	
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling";
		pringTextFiles(path);
	}

	private static void pringTextFiles(String path) {
			File file=new File(path);
			File[] files=file.listFiles();
			for(int i=0;i<files.length;i++) {
				String filename=files[i].getName();
				int index=filename.lastIndexOf(".");
				if(filename.substring(index+1).equals("txt")) {
					System.out.println(filename);
				}
				
			}
		}
}
