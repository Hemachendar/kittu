package com.selenium;

import java.util.*;

public class set {
	
	public static void main(String[] args) {
		HashSet<String> al = new HashSet<String>();
		al.add("rrassasa");
		al.add("sai");
		al.add("ramakrishna");
		al.add("shiva");
		
/*		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
*/
		System.out.println(al.hashCode());
		System.out.println(al.contains("sai"));
		/*for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		for (String string : al) {
			System.out.println(string);
		}
		
		
		//System.out.println(al.get(0));
	}

}
