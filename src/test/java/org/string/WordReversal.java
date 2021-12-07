package org.string;
//Word Reverse & in readable format
public class WordReversal {
	
	public static void main(String[] args) {
		String s = "I Love India";
		System.out.println("Input: "+s);
		String[] split = s.split(" ");
		String r = "";
		for(int i=split.length-1; i >=0; i--) {
			r=r+split[i]+" ";
		}
		System.out.println("Output: "+r);
	}
	

}
