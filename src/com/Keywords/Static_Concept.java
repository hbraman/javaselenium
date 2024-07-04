package com.Keywords;

public class Static_Concept {
	// public class static ClassA-->static key not possible in class level--invalid
	// modifier//

	static String a = "Hello";

	public static void method() { // using static can't overriding
		System.out.println("Good");
	}

	public static void method1(int a, String b) {// can be overloading
		System.out.println("ID.No." + a + b);
	}

	public void method2() {
		System.out.println("I am overriding");
	}

	public static void main(String[] args) {
		Static_Concept sc = new Static_Concept(); // using (class-object=new class)===method calling>>METHOD LEVEL
		sc.method();
		sc.method1(5, "Sathish");

		System.out.println(sc.a);// String a="Hello"-->object.a(variable)>>VARIABLE LEVEL

		System.out.println(a);// STATIC LEVEL(or)DIRECT LEVEL
		// using static keyword in Datatype--Direct print variable--<no need object
		// creation>
	}
}