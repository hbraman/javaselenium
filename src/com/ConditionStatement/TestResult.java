package com.ConditionStatement;

public class TestResult {
	public static void main(String[] args) {
		int Tamil = 90;
		int Englis = 80;
		int Maths = 58;
		int Hindi = 90;
		int Evs = 50;
		int Total = (Tamil + Englis + Maths + Hindi + Evs);
		System.out.println("TestResut:" + "\n500/" + Total);

		if (Total >= 450) {
			System.out.println("Good Student");
		} else if (Total >= 400 & Maths > 90) {
			System.out.println("Cosentrate Other Subject");
		} else if (Total <= 400 && ((Englis & Hindi & Evs) < 90)) {
			System.out.println("Special Class");
		} else {
			System.out.println("Parents meating");
		}

	}

}
