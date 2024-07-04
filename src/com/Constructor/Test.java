
package com.Constructor;

public class Test {
	public Test() {
		this(6);
		System.out.println("Default Constructor");
	}

	public Test(int a) {
		this("h", 7);
		System.out.println("Parameterzied constructor");
	}

	public Test(int a, int b) {

		System.out.println(a + b);
	}

	public Test(String a, int b) {
		this(10, 10);
		System.out.println("Good");
	}

	public static void main(String[] args) {
		Test t = new Test();

	}

}
