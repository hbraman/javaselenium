package org.FullyAbstraction;

public class Bike implements Showroom {

	@Override
	public void model() {
		System.out.println("Honda CT100");
	}

	@Override
	public void cc() {
		System.out.println("110CC");
	}

	@Override
	public void cost() {
		System.out.println("1.2laks");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.model();
		b.cc();
		b.cost();
	}

}
