package org.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrList1 {
	public static void main(String[] args) {
	List<Object> l = new ArrayList<Object>();
	//add, get, set, remove, contains, indexOf, clear, addAll, retainALL, removeALL
	//add
	l.add("Ranjit");
	l.add("Surya");
	l.add("Raj");
	l.add("Rajesh");
	l.add("Jegadeesh");
	System.out.println(l);
	
	//get
	Object get = l.get(1);
	System.out.println(get);
	
	//set
	Object set = l.set(1, "Kumar");
	System.out.println(set); //it give the actual value of index 1 in the existing list
	System.out.println(l);   //it give the updated list
	
	//remove
	Object remove = l.remove(1);
	System.out.println(remove);
	System.out.println(l);
	
	//contains
	boolean a = l.contains("Ranjit");
	System.out.println(a);
	
	//indexOf
	int b = l.indexOf("Raj");
	System.out.println(b);
	
	//clear
	l.clear();  //No return type
	System.out.println(l);
	l.add("Ranjith1");
	l.add("Surya1");
	l.add("Raj1");
	l.add("Rajesh1");
	l.add("Jegadeesh1");
	
	
	//addALL
	List<Object> l1 = new ArrayList<Object>();
	l1.add("rkkk");
	l1.add("ewkreo");
	l1.add(1234);
	l1.add('w');
	System.out.println(l1);
	l.addAll(l1);
	System.out.println(l);
	//retainALL	
	List<Object> l2 = new ArrayList<Object>();
	l2.add("Ranjith1");
	l2.add(146820);
	l2.add("jeg");
	l2.add("Raj1");
	l2.retainAll(l); //It give common data for both list
	System.out.println(l2);

	//removeALL
	System.out.println(l);
	l.removeAll(l2); //It remove common data in l which is in l2
	System.out.println(l);
		
	}

}
