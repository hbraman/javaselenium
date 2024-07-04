package com.String;

import java.util.Scanner;

public class Reverse_String {
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter:");
	String a=s.nextLine();
	String rev = new StringBuilder(a).reverse().toString();
	//String rev=reverseString(a);
	char[]b=a.toCharArray();
	for(int i=b.length-1;i>=0;i--) {
		rev=b[i]+rev;
	}
		System.out.println(rev);
		
}
}

	



