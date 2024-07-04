package org.FullyAbstraction;

public class Student implements Teacher1, Teacher2 {

	@Override
	public void subject1() {
		System.out.println("Maths");

	}

	@Override
	public void subject2() {
		System.out.println("English");

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.subject1();
		s.subject2();
	}

}
