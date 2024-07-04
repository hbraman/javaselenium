package com.Keywords;

public class Book2 extends Book1 {

	@Override
	public void page4() {
		super.page4();
		System.out.println("No static keyword /=/ method");
	}

	public static void main(String[] args) {
		Book1 b1 = new Book2();// upper casting
		b1.page1();
		System.out.println(x);
		b1.page1("Topic:", 1.2f);
		b1.page3();
		b1.page4();
		b1.page5();
	}

}