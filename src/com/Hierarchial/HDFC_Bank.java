package com.Hierarchial;

public class HDFC_Bank extends Customer {

	public void counter() {
		System.out.println("Acc.Balance:20000rs");

	}

	public static void main(String[] args) {
		HDFC_Bank b = new HDFC_Bank();
		b.passbook();
		b.counter();
	}

}
