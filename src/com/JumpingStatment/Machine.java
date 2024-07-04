package com.JumpingStatment;

public class Machine {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {

			if (i == 5) {
				System.out.println("skip");
				continue;// skip/hide the 6 value and continue to print
			}
			if (i ==10) {
				break;// break the condition will be stop
			}
			
			System.out.println( i);
		}

	}
}
