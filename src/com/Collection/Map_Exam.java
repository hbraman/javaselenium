package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Exam {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<>();
		
		m.put(1, "Hi");
		m.put(2,"Hello");
		m.put(3, "How");
		m.put(4, "are");
		m.put(5, "You");
		m.put(6, null);
		System.out.println(m);
		
		int si = m.size();
		System.out.println(si);
		
		String st = m.get(3);
		System.out.println(st);
		
		Set<Integer> ks = m.keySet();
		System.out.println(ks);
		
		Collection<String> vl = m.values();
		System.out.println(vl);
		
		boolean ck = m.containsKey(5);
		System.out.println(ck);
		
		boolean cv = m.containsValue("are");
		System.out.println(cv);
		
		m.remove(6);
		System.out.println(m);
		
		Set<Entry<Integer, String>> es = m.entrySet();
		System.out.println(es);
		
		m.replace(2, "Janu");
		System.out.println(m);
		
		int hc = m.hashCode();
		System.out.println(hc);
		
		boolean emp = m.isEmpty();
		System.out.println(emp);
		
		
		/*m.clear();
		System.out.println(m);
		*/
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
