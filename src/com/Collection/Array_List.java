package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		
		l.add("Apple");
		l.add("Ball");
		l.add("Cat");
		l.add("Dog");
		System.out.println(l);
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		l1.add(30);
		l1.add(null);
		System.out.println(l1);
		
		List<Float> l2=new ArrayList<Float>();
		l2.add(55.55f);
		l2.add(44.44f);
		l2.add(66.66f);
		System.out.println(l2);
		
		
		int i = l.size();
		System.out.println(i);
		
		String a = l.get(3);
		System.out.println(a);
		
		Float f1 = l2.get(2);
		System.out.println(f1);
		
		l.set(2, "Camel");
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		l.add(3, "Dam");
		System.out.println(l);
		
		int j = l.indexOf("Ball");
		System.out.println(j);
		
		int j1 = l1.lastIndexOf(20);
		System.out.println(j1);
		
		List<Object> l3=new ArrayList<Object>();
		l3.add(1);
		l3.add('A');
		l3.add(10);
		l3.add("Array");
		l3.add(20);
		l3.add('A');
		
		
		l3.addAll(l1);
		System.out.println(l3);
		
		boolean e = l3.equals(l1);
		System.out.println(e);
		
		boolean f = l3.contains('A');
		System.out.println(f);
		
		int indexOf = l3.indexOf(null);
		System.out.println(indexOf);
			
		boolean et = l3.isEmpty();
		System.err.println(et);
		
		l3.retainAll(l1);
		System.out.println(l3);
		
		l3.removeAll(l1);
		System.out.println(l3);
		
		String q="";
		boolean emp= q.isEmpty();
		System.err.println(emp);
		
		
	}

}
