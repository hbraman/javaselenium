package org.PolyOverriding;

public class Child extends Parent {

	@Override
	public void bankSavings() {
		super.bankSavings();
		System.out.println("Savings Acc:2laks");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.bankSavings();
		c.landValue();
		c.jewells();
		c.jewells();
	}

}
