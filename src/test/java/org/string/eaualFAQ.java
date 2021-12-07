package org.string;

public class eaualFAQ {
	public static void main(String[] args) {
		String s1 = "Ranjith";
		String s2 = "Ranjith";
		String s3 = new String("Ranjith");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3.equals(s1));
		System.out.println(s3.equals(s2));
				
	}

}
