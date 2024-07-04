package com.Variables;

public class Box {

	int a = 10;// class variables=inside the class &outside the method

	private void folder() {
		int b = 20;// local variables =inside the method only
		System.out.println(b);

	}

	static long c = 12345678l;// static variables=inside the class and outside the method

	public static void main(String[] args) {
		Box b = new Box();
		b.folder();// print the output =local variables must need in object
		System.out.println(b.a);// class variables also need object
		System.out.println(c);// static variables no need object

	}

}
