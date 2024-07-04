package com.Multilevel;

public class Teacher extends HeadMaster {

	public void award2() {
		System.out.println("Brilent Student");
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.award1();
		t.award2();

	}

}
