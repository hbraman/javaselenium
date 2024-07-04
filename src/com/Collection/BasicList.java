package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BasicList {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(20);
		l.add(30);
		l.add(50);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		List<Integer>i=new ArrayList<>();
		i.add(20);
		i.add(70);
		i.add(90);
		System.out.println(i);
		
		
		
		/*List<String> m=new LinkedList<>();
		m.add("aaa");
		m.add("bbb");
		System.out.println(m);
		
		Set<Integer>n=new HashSet<>();
		n.add(90);
		n.add(100);
		n.add(200);
		System.out.println(n);
		
		*/
		
		
	}
}


		
		


