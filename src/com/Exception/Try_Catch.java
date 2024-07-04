package com.Exception;

import java.text.NumberFormat;

public class Try_Catch {
	
	private static int int1;

	public static void main(String[] args) {
		
		String a="1234";
		int i = Integer.parseInt(a);
		System.out.println(i+1);
		
		/*String b="ABCDE";
		String v = String.valueOf(b);
		System.out.println(vof);*/
		
		String c="ABCD";
		
		try {
		int j = Integer.valueOf(c);
		System.out.println(j);
		
		} 
		catch (NumberFormatException e) {
			System.out.println("123344433");
		}
		catch (ArithmeticException e2) {
			System.out.println("2345");
		}
		catch (NullPointerException e) {
			System.out.println();
		}
		System.out.println(40);	
		}
	}


