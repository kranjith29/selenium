//We can reverse String using 
//1. StringBuilder
//2.StringBuffer
//3. iteration etc. Let's see the ways to reverse String in Java.
package org.string;

public class ReverseString {
	
//1. StringBuilder	
/*
	public static void reverse() {
		String s = "Ranjith Kumar";
		StringBuilder a = new StringBuilder(s);
		System.out.println("Actual String: "+a);
		a.reverse();
		System.out.println("Reverse String: "+a);
	}
*/	

//2. StringBuffer
/*
	 public static void reverse() {
			String s = "Ranjith Kumar";
			StringBuffer a = new StringBuffer(s);
			System.out.println("Actual String: "+a);
			a.reverse();
			System.out.println("Reverse String: "+a);
		}
*/
	
//3. iteration
	
	public static void reverse() {
		String s = "Ranjith Kumar";
		String r = "";
		char[] ch = s.toCharArray();
		System.out.println("Actual String: "+s);
		for(int i=ch.length-1; i>=0; i--) {
			r=r+ch[i];
		}
		System.out.println("Reverse String: "+r);
	}
	
	public static void main(String[] args) {
		ReverseString.reverse();
	}

	
	
	
}

