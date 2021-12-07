package org.collect;

import java.util.*;

public class DupCharString {
	public static void DupString(String str) {
		Map<Object, Integer> map = new HashMap<Object,Integer>();
		char[] charArray = str.toCharArray();
		for(char c:charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		for(Map.Entry<Object,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
           }
		
	}
	public static void main(String[] args) {
		DupCharString.DupString("Ra/n/jithK/umar");
	}

}
