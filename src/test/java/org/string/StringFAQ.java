package org.string;

import java.util.HashMap;
import java.util.Map;

public class StringFAQ {
	//StringDuplicate
	public static void StringDuplicate(String str) {
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		char[] charArray = str.toCharArray();
		//String[] split = str.split("");
		for(char c:charArray) {
		//for(String c:split) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());				
			}
		}
	}
	//ReverseString without StringBuilder & StringBuffer
	public static void ReverseString(String str) {
		char[] charArray = str.toCharArray();
		String r = "";
		for(int i=charArray.length-1;i>=0;i--) {
			r=r+charArray[i];
		}
		System.out.println("Orginal String: "+str);
		System.out.println("Reverse String: "+r);
	}
	//WordReversal
	public static void WordReversal(String str) {
		System.out.println("Actual String: "+str );
		String[] split = str.split(" ");
		String rw ="";
		for(int i=split.length-1; i>=0;i--) {
			rw = rw+split[i]+" ";
		}
		System.out.println("ReverseWord: "+rw);
		
	}
	
	//StringBuffer
	public static void RevrsStringBuf(String Str) {
		StringBuffer r = new StringBuffer(Str);
		r.reverse();
		System.out.println("Actual String: "+Str);
		System.out.println("Reverser string: "+r);
		
	}
	
	//StringBuilder
		public static void RevrsStringBuild(String Str) {
			StringBuilder r = new StringBuilder(Str);
			r.reverse();
			System.out.println("Actual String: "+Str);
			System.out.println("Reverser string: "+r);
			
		}
	public static void main(String[] args) {
		System.out.println("++++++++"+"Identify StringDuplicate"+"+++++++++++++++++");
		StringFAQ.StringDuplicate("My Name is Ranjiith kkummaar");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		StringFAQ.WordReversal("I am working in CTS");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		StringFAQ.ReverseString("Ranjith Kumar");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		StringFAQ.RevrsStringBuf("John Christopher");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		StringFAQ.RevrsStringBuild("Ranjith John");
	}

}
