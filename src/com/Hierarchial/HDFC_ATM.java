package com.Hierarchial;

public class HDFC_ATM extends Customer {

	void atmMachine() {
		System.out.println("Acc.Balance:20000rs");
	}

	public static void main(String[] args) {
		HDFC_ATM a = new HDFC_ATM();
		a.ATM();
		a.atmMachine();
	}

}
