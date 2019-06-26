package com.selenium;

import java.util.*;

public class HashM {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "SAI");
		hm.put(2, "rk");
		
		for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }

		
	}

}
