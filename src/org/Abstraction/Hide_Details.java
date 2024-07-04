package org.Abstraction;

public class Hide_Details extends StudentDetails {
	@Override
	public void address() {
		System.out.println("Address:Sivan kovil street,Mambalam,Chennai.");
	}

	public static void main(String[] args) {
		Hide_Details hd = new Hide_Details();
		hd.name();
		hd.age();
		hd.address();
	}

}
