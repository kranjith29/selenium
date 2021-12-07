package org.string;

import java.util.HashMap;
import java.util.Map;

public class sample {
  public static void reverse(String str){
	//String str = "I love India";
	String s[]=str.split("");
	Map<String,Integer> map = new HashMap<String,Integer>();
	for(String a:s){
	 if(map.containsKey(a)){
	    map.put(a,map.get(a)+1);
	}

	else{
	map.put(a,1);
	}
	
   }
	System.out.println(map);
}
  public static void main(String[] args) {
	  sample s = new sample();
	  s.reverse("rraannjj");
	  //sample.reverse("iii kkkkk jdjjjdjdsanfd sdkdjf &&&&&&");
}
  
}
