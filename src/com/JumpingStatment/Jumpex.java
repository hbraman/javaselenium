package com.JumpingStatment;

public class Jumpex {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 4) { //skip value 4
				continue;
			}
			System.err.println(i);
		}
		
	}
}
