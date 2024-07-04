package com.Constructor;

public class Program {
	public Program() {
		this(20);
		System.out.println("Java");
	}

	public Program(int a) {
		this(20.45f);
		System.out.println("Selenium");
	}

	public Program(String b) {

		System.out.println("API");
	}

	public Program(float c) {
		this("delex");
		System.out.println("Project");
	}

	public static void main(String[] args) {
		Program p = new Program();

	}

}
