package com.javaspringhibernate.module1720;

import java.util.HashSet;
import java.util.Set;

public class IMPHowSetHashSetWorks {
//No Duplicates(Unique Data), Null Allowed, Random order of insertion,
//Set are used when we need unique data to be maintained
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(0);
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(6);
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("A");
		strSet.add("B");
		strSet.add("C");
		strSet.add("D");
		strSet.add("E");
		strSet.add("F");
		strSet.add("G");
		
/*		for(int i:intSet){
			System.out.print(" "+i);
		}*/
		
		for(String s:strSet){
			System.out.print(" "+s);
		}	
	}

}
