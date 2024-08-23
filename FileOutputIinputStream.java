package com.vedait.assignments.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputIinputStream {
	
	public static void main(String[] args) {
		
		String string="Reading is a powerful tool that can expand your knowledge, improve your vocabulary, and \nenhance your critical thinking skills. \nIt offers a gateway to different worlds, allowing you to explore diverse perspectives and experiences. \nWhether you prefer fiction or non-fiction, reading can be a rewarding and enriching pastime. \nBy immersing yourself in stories, you can develop empathy, imagination, and a deeper understanding of the world around you.";
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		write(string,path);
		Read(path);
	}

	private static void Read(String path) {
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			byte[] bytes=fileInputStream.readAllBytes();
			for(byte b:bytes) {
				System.out.print((char)b);
			}
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void write(String string, String path) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(string.getBytes());
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
