package com.ConditionStatement;

public class DrivingLicense {
	public static void main(String[] args) {
		int age = 17;
		if (age > 19) {
			System.out.println("Eligible");
		} else if (age == 18) {
			System.out.println("Eligible apply LLR");
		} else {
			System.out.println("Not Eligible");
		}
	}

}
