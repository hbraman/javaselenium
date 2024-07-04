package com.Multilevel;

public class GroupLeader extends Teacher {

	public void award3() {
		System.out.println("Best Frind");
	}

	public static void main(String[] args) {
		GroupLeader g = new GroupLeader();
		g.award1();
		g.award2();
		g.award3();
	}

}
