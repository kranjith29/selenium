package org.string;

public class StringTest {
	public void UpperChar(String str){
		
        System.out.println("Input: "+str);
		String a[]=str.split(" ");
		int l = a.length;
		String b="";
		for(int i=0; i<=l-1; i++){
		   if(i==l-1) {
			   b=b+a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase();   
		   }
		   else {
		   b=b+a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ";
		  
		 }
		}   
		System.out.println("Output: "+b);
		}
	
	public void reverse(String str){

		int l = str.length();

		String a[]=str.split("");
		
		String b="";

		for(int i=l-1; i>=0; i--){
		b=b+a[i]; 
		}

		System.out.println("Reverse: "+b);

		if(str.equals(b)){
		    
		System.out.println(str.equals(b)+" ; its a palindrome String");

		  }

		else{
		  
		System.out.println(str.equals(b)+" ; its not a palindrome String");
		 

 }
}
	
public void WordReverse(String str) {
	System.out.println("Input: "+str);
	String c[] = str.split("");
	int l =c.length;  //Array length
	String d="";
	for(int i=l-1; i>=0; i--) {
		 d=d+c[i]+"";
		}
	//System.out.println(d);
	String h[]=d.split(" ");
	int m = h.length; 
	String g="";
	for(int j=m-1; j>=0; j--){
	    g=g+h[j]+" ";
	}
	System.out.println("Output: "+g);
}

	public static void main(String[] args){
	       StringTest q = new StringTest();
	      q.UpperChar("inda love one");
	      q.UpperChar("ranjithkumar rajeshkumar jegadeeshkumar");
	      q.UpperChar("iNdIa iS mY cOuNtrY");
	      q.reverse("Ranjith");
	      q.reverse("nitin");
	      q.WordReverse("this is my code");
	}	
//	public static void main(String[] args){
//		StringTest m = new StringTest();	
//		m.reverse("this is javatpoint");
//		System.out.println("");
//		m.reverse("nitin");
//		
//		}
}
