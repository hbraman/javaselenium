package com.Introduction;

public class Laptop {
	
	public void service1() {
		char a='J';
		System.out.println("Customer name:"+a+"\nservice1:Lenovo");
		
	}
	
	public void service2() {
		char b='K';
		System.out.println("\nCustomer name:"+b+"\nservice2:DELL");
		
	}
	public void service3() {
		char c='O';
		System.out.println("\nCustomer name:"+c+"\nservice3:HP");
		
	}
	public void service4(){
		char d='X';
		System.out.println("\nCustomer name:"+d+"\nservice4:ACER");
		
	}
	
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.service1();
		l.service2();
		l.service3();
		l.service4();
	}

}
