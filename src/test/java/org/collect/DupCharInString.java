//Input: str = “geeksforgeeks”
//Output: s : 2; e : 4; g : 2; k : 2
/*
 Approach: The idea is to do hashing using HashMap.

1. Create a hashMap of type {char, int}.
2. Traverse the string, check if the hashMap already contains the traversed character or not.
3. If it is present, then increment the count or else insert the character in the hashmap with frequency = 1.
4. Now traverse through the hashmap and look for the characters with frequency more than 1. 
5. 0Print these characters with their respective frequencies.
 */

//A Map doesn't allow duplicate keys, but you can have duplicate values. 
//HashMap and LinkedHashMap allow null keys and values
//but TreeMap doesn't allow any null key or value.

package org.collect;

import java.util.HashMap;
import java.util.Map;

public class DupCharInString {
	public static void countDupChar(String str) {
		 // 1. Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		// 2. Converting given string into a CharArray
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// 3. Checking each Character in CharArray
		for (char c:charArray) {
			if(map.containsKey(c)) {
				 ////Put elements in Map  using .put
				// If character is present in map incrementing it's count by 1
			  map.put(c,map.get(c)+1);
			}
			else {
				// If character is present in map putting this character into map with 1 as it's value.
				map.put(c, 1);
			}
		}
		System.out.println("map: "+map);
		System.out.println("map.entryset():" +map.entrySet());
		
		//4. Traverse the HashMap, check if the count of the character is greater than 1 then print
		    // the character and its frequency
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
			
	}
	public static void main(String[] args) {
	
		String b = "India is my country";
		countDupChar(b);
	}

}
