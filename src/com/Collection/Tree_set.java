package com.Collection;


import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
	
	public static void main(String[] args) {
		
		Set<Object> t=new TreeSet<Object>();
		
		t.add(1);
		t.add(2);
		
		t.add("Tree");
		t.add("Set");
		/*
		t.add(33.33f);
		t.add(2345678l);*/
		System.out.println(t);
		
		
	}

}
