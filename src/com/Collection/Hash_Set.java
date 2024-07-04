package com.Collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set {
	public static void main(String[] args) {
		
		//Set<Object> s=new HashSet<Object>();
		Set<Object> s=new LinkedHashSet<>();
		//Set<Object>s= new TreeSet<>();
		s.add(11);
		s.add('S');
		s.add(22);
		s.add("Jan");
		s.add(11);
		s.add(99.99);
		s.add(null);
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		s.remove(99.99);
		System.out.println(s);
		
		/*s.clear();
		System.out.println(s);*/
		
		Set<Object> ls=new LinkedHashSet<>();
		ls.add("Fan");
		ls.add(20);
		ls.add(33.99f);
		
		s.addAll(ls);
		System.out.println(s);
		
		s.retainAll(ls);
		System.out.println(s);
		
		boolean c = s.contains(20);
		System.out.println(c);
		
		s.removeAll(ls);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
	}

}
