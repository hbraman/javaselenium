package com.TypeCasting;

public class Tigher {
	public static void main(String[] args) {
		// widening-->Implicit type casting //lower value can only in store higher value
		int a = 10;// 4byte
		long b = a;// 8byte
		System.out.println(b);

		// Narrowing-->Explicit type casting/

		long d = 2343222;// long-8byte
		int e = (int) d;// int-4byte so used another one (int) is 4byte -->4+4=8byte
		System.out.println(e);

		float g = 19191.29f;
		double h = g;
		System.out.println(h);

	}

}
