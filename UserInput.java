package com.vedait.assignments.fileHandling;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		String string=scanner.next();
		scanner.nextLine();
		String line=scanner.nextLine();
		System.out.println(i+string+line);
		scanner.close();
	}
}
