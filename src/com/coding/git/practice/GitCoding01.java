package com.coding.git.practice;

public class GitCoding01 {

	public static void main(String[] args) {
		
		int a=12;
		int b=51;
		String str="Hello Wolrd";
		System.out.println(str + ", Sum is : " + a + b);

		// 01. Simple printing the name...
		printName(3);
		
		//03. Sum og two numbers...
		System.out.println("Sum of two numbers is :" + sum(5,11));

	}

	// 01.
	public static void printName(int no) {

		for (int i = 1; i <= no; i++) {
			System.out.println("Welcome to learn GIT Concept");
			System.out.println("Thank You");
			System.out.println("Everything is ok");
			System.out.println("Learning git stash command");
		}
	}
	
	//03.
	public static int sum(int a, int b) {
		return a + b;
	}

}
