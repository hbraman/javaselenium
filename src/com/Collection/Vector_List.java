package com.Collection;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Vector_List {
	
	public static void main(String[] args) {
				
		List<Object> v=new Vector<Object>();
		v.add(1);
		v.add(2);
		v.add(100009l);
		v.add(null);
		v.add("Vector");
		v.add(2);
		v.add('V');
		System.out.println(v);
		
		int s = v.size();
		System.out.println(s);
		
		Object j = v.get(2);
		System.out.println(j);
		
		v.set(3, "Home");
		System.out.println(v);
		
		boolean r = v.remove(null);
		System.out.println(r);
		
		v.remove(4);
		System.out.println(v);
		
		v.add(6, "One");
		System.out.println(v);
		
		int id1 = v.indexOf("Home");
		System.out.println(id1);
		
		int lof = v.lastIndexOf(2);
		System.out.println(lof);
		
		
	}
	
	

}
