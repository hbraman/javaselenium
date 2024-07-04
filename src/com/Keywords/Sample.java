package com.Keywords;

import java.lang.reflect.Method;

public class Sample extends Static_Concept {

	@Override
	public void method2() {
		super.method2();
		System.out.println("super");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.method();
		s.method1(1, "overload");
		s.method2();

		System.out.println(s.a);

		System.out.println(a);
	}

}
