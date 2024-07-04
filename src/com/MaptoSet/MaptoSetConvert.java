package com.MaptoSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaptoSetConvert {
	
	public static void repitativeWords() {
		String s="Hello is the Hello is is the the is this";
		String[] wd = s.split("");
		Map<String, Integer> wdMap=new HashMap<String, Integer>();
		for (String string : wd) {
			System.out.println(wd);
			if (wdMap.containsKey(string)) {
				Integer inte = wdMap.get(string);
				wdMap.put(string, inte+2);
				
			} else {
				wdMap.put(string, 1);

			}
			
		}
		System.out.println("List of Duplicate");
		Set<Entry<String, Integer>> entrySet = wdMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key +"="+value);
			} 

			}
			
		}
	
	
	public static void main(String[] args) {
		repitativeWords(); 
		
	}

}
