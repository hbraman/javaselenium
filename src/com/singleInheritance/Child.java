package com.singleInheritance;

public class Child extends ParentA {

	public void bike2() {
		System.out.println("KTM");

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.bike1();
		c.bike2();
	}

}
