package com.Mutiple;

public class Mechnanic extends TvsCustomer,BajajCustomer{
	
	//multipleInheritance 2parent classes can't access with 1 child class using "extends" is impossible because priority issue
	//"Interface is overcome useing this methods

	public void service() {
		System.out.println("please wait");

	}

	public static void main(String[] args) {
		Mechnanic m=new Mechnanic();
		m.service1();
		m.service();
		m.service2();
	}
}
