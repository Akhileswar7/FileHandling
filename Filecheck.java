package com.vedait.assignments.fileHandling;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filecheck {
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		PrintLastModified(path);
	}

	private static void PrintLastModified(String path) {
		File file = new File(path);
		Date date=new Date(file.lastModified());
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.out.println(simpleDateFormat.format(date));
		
	}
}
