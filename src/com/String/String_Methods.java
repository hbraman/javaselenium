package com.String;

public class String_Methods {
	public static void main(String[] args) {

		String s = "Welcome to Great Magic Show";

		int a = s.length();//ctrl+2+L retun type
		System.out.println(a);
		
		boolean b = s.equals("welcome to great magic show");
		System.out.println(b);
		boolean b1 = s.equals("Welcome to Great Magic Show");
		System.out.println(b1);
		
		

		boolean c = s.equalsIgnoreCase("welcome to Great magic show");
		System.out.println(c);
		boolean c1 = s.equalsIgnoreCase("welcom to Great");
		System.out.println(c1);

		String d = s.toUpperCase();
		System.out.println(d);

		String e = s.toLowerCase();
		System.out.println(e);

		boolean f = s.startsWith("Wel");
		System.out.println(f);

		boolean g = s.endsWith("ow");
		System.out.println(g);

		boolean h = s.contains("Great Magic");
		System.out.println(h);

		int i = s.indexOf('c');
		System.out.println(i);

		int j = s.lastIndexOf('i');
		System.out.println(j);

		char k = s.charAt(17);
		System.out.println(k);

		String l = s.replace("Magic", "Comedy");
		System.out.println(l);
		

		boolean u1=s.isEmpty();
		System.out.println(u1);

		String m = s.substring(15);
		System.out.println(m);
		String m1 = s.substring(11, 20);
		System.out.println(m1);

		
		String s2 = "";// no arguments there
		boolean o = s2.isEmpty();
		System.out.println(o);

		String[] p = s.split(" ");
		for (String x : p) {
			System.out.println(x);
		}
		String[] p1 = s.split("e");
		for (String x1 : p1) {
			System.out.println(x1);
		}

		String s3 = " Hello ";

		String[] p2 = s3.split("");
		for (String x2 : p2) {
			System.out.println(x2);
		}

		String q = s3.trim();
		System.out.println(q);

		String s4 = "Good";
		String r = s4.concat(s4);
		System.out.println(r);

		int i1 = 2112;
		String t = String.valueOf(s4);
		System.out.println(i1 + t);
		
		

		String s1 = "Super Good";
		String s5 = "Asscii Value";
		int u = s1.compareTo(s5);
		System.out.println(u);

		String s6 = "@!  Asscii 234 Value 45";
		String v = s6.replaceAll("[@!0-9]", " ");
		System.out.println(v);
		String w = s6.replaceAll("[A-Za-z]", "");
		System.out.println(w);

		char x = s6.charAt(11);
		System.out.println(x);
		
		
		
	}

}



