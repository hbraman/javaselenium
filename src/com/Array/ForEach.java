package com.Array;

public class ForEach {
	
	public static void main(String[] args) {
		
		String s[] = { "Jan", "Feb", "Mar", "Apr", "May" };
		System.out.println(s[4]);
										// for each ==valueBased
		for (String new1 : s) {
			System.out.println(new1);
		}
		
		for (int i = 0; i < s.length; i++) {
			String string = s[i];
			
		}

	}

}
