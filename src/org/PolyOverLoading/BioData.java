package org.PolyOverLoading;

public class BioData {
	private void empDetails() {
		System.out.println("Employe BioData:");
	}

	private void empDetails(String a) {
		System.out.println("Employe Name:" + a);
	}

	private void empDetails(int b, String a) {
		System.out.println("Age:" + b + "\nD.O.B:" + a);
	}

	private void empDetails(String a, Long b) {
		System.out.println("Email Id:" + a + "\nPh.No:" + b);
	}

	private void empDetails(String a, int b, float c) {
		System.out.println("Qualification:" + a + "\nYear of Passedout:" + b + "\nPercentage:" + c);

	}

	public static void main(String[] args) {
		BioData b = new BioData();
		b.empDetails();
		b.empDetails("Ram");
		b.empDetails(28, "12.04.1994");
		b.empDetails("ram007@gmail.com", 9876543210l);
		b.empDetails("B.com", 2014, 80.5f);

	}

}
