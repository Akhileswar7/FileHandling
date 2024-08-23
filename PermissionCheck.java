package com.vedait.assignments.fileHandling;

import java.io.File;

public class PermissionCheck {
	
	public static void main(String[] args) {
		String path="C:\\Users\\gajja\\Downloads\\filehandling\\file.txt";
		Check(path);
	}

	private static void Check(String path) {
		File file=new File(path);
		if(file.canRead()) {
			System.out.println("Specified file has Read permission");
		} else {
			System.out.println("Specified file not has Read permission");
		}
		if(file.canWrite()) {
			System.out.println("Specified file has wirte permission");
		} else {
			System.out.println("Specified file not has write permission");
		}
	}
}
