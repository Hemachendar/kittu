package com.selenium;

import java.util.ArrayList;



public class ArrayLs {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("rk");
		al.add("shiva");
		
/*		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
*/
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
/*		for (String string : al) {
			System.out.println(string);
		}
*/		
		
		//System.out.println(al.get(0));
	}

}
