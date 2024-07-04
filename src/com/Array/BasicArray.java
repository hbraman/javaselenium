package com.Array;

public class BasicArray {
	public static void main(String[] args) {

		char[] a = new char[5];
		a[0] = 'A';
		a[1] = 'B';
		a[2] = 'C';
		a[3] = 'D';
		a[4] = 'E';
		for (char i = 0; i < a.length; i++) {
			System.out.println(a[1]);

			int[] b = { 44, 55, 66, 77, 88, 99 };
			System.out.println(b[3]);

			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);

				/*String s[] = { "Jan", "Feb", "Mar", "Apr", "May" };
				System.out.println(s[1]);
				// for each ==valueBased
				for (String new1 : s) {
					System.out.println(new1);
				}
*/
			}
		}
	}
}
