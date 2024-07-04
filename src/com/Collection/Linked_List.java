package com.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String[] args) {
		
		List<Object> x=new LinkedList<Object>();
		x.add(10);
		x.add('A');
		x.add(null);
		x.add(10);
		x.add("JAVA");
		x.add(20.5f);
		x.add("java");
		x.add('b');
		System.out.println(x);
		
		int i = x.size();
		System.out.println(i);
		
		Object j = x.get(5);
		System.out.println(j);
		
		x.set(2, "Set");
		System.out.println(x);
		
		x.remove(6);
		System.out.println(x);
		
		x.add(6, "Selenium");
		System.out.println(x);
		
		int i1 = x.indexOf('b');
		System.out.println(i1);
		
		int i3 = x.lastIndexOf(10);
		System.out.println(i3);
		
		List<Object> x2=new ArrayList<Object>();
		x2.add('A');
		x2.add(2000);
		x2.add("Apple");
		
		x.addAll(x2);
		System.out.println(x);
		
		boolean eq = x.equals(x2);
		System.out.println(eq);
		
		boolean cn = x.contains('A');
		System.out.println(cn);
		
		x.retainAll(x2);
		System.out.println(x);
		
		x.removeAll(x2);
		System.out.println();
		
		
		
		
	}

}
