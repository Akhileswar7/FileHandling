package com.vedait.assignments.fileHandling;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFile {
	
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		read(path);
	}

	private static void read(String path) {

		try {
			File file = new File(path);
			FileInputStream fileInputStream =new FileInputStream(file);
			int i;
			while((i=fileInputStream.read())!=-1) {
				System.out.print((char)i);
			}
			fileInputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
