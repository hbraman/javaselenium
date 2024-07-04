package com.Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypesOf_Exception {
	
	public static void main(String[] args) {
		
		int a=50;
		int b=0;
		int c=a/b;
		System.out.println(c);//Arithmetic Exception
		
		String s=null;
		System.out.println(s.length());//Null Pointer Exception
		
		String p="Hello";
		System.out.println(p.charAt(6));//String Index out of bound
		
		String q="9876abcd";
		int i=Integer.parseInt(q);
		System.out.println(++i);//Number Format Exception
		
		List<Integer> y=new ArrayList<>();//Index out of Bound Exception
		System.out.println(y.get(5));
		
		
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the Row & Coloum");//Input Mismatch Exception
		int nextInt = m.nextInt();
		
		
		int d[]=new int[3];
		d[0]=1;
		d[1]=2;
		d[2]=3;
		d[3]=4;
		d[4]=5;
		System.out.println(d);//ArrayIndexOut of Bound Exception
		
		
	}
	
	

}
