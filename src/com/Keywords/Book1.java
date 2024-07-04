package com.Keywords;

public class Book1 {

	public void page1() {
		System.out.println("Name & Index");
	}

	static String e = "page2";
	static int a = 1;
	static String b = " Topic";
	static String c = " Basic Java  ";
	static short f = 20;
	static int g = (short) f;// narrowing-explicit
	static float h = 1989.59f;
	static double i = h;// widening-implicit
	static String x = e + b + a + c + g + i;

	public static void page3() {
		System.out.println("Basic selenium");
	}

	public static void page1(String a, float b) {
		System.out.println("overloading");
	}

	public void page4() {
		System.out.println("//overriding//");
	}

	public static void page5() {
		System.out.println("static method using overriding");
	}

}
