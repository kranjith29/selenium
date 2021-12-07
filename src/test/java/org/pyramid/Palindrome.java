package org.pyramid;

// Ex: 12321 --> reverse: 12321
//modulus?
public class Palindrome {
public static void main(String[] args) {
//	int a = 12321;
//	int b;   //Modulus
//	int c=0; //final value
	int a =12321,b,c=0;
	while(a>0) {
		b=a%10; //---> b=1; b=2; b=3; b=2; b=1
		c=(c*10)+b; //formula c=1; c=12; c=123; c=22; c=11
		a=a/10;  //-->a=1232; a=123; a=12; a=1; a=0
}
	System.out.println(c);
	
		
	}
	

}
