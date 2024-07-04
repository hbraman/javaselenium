package com.Scanner;

import java.util.Scanner;

public class Project_Details {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println("Project Name:" + a);
		int b = s.nextInt();
		System.out.println("Build Year:" + b);
		float c = s.nextFloat();
		System.out.println("Version:" + c);
		String d = s.next();
		System.out.println("Developer Name:" + d);
		long e = s.nextLong();
		System.out.println("Dev.Ph.No:" + e);
		String f = s.next();
		System.out.println("Project Class:" + f);
		String g = s.next();
		System.out.println("Projcet Value:" + g);

		int i = s.nextInt();
		for (; i < 10; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i);
			}
			System.out.println();
			System.out.println("Sum.num:" + i);
		}

	}

}
