package com.javaspringhibernate.module1720;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class ConvertingArrayListToVector {

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("A");
		strArr.add(null);
		strArr.add("Z");
		strArr.add("B");
		strArr.add("U");
		strArr.add("F");
		strArr.add(null);
		strArr.add("Z");
		Vector<String> vec =  new Vector<String>(strArr);
		vec.add("L");
		
		Enumeration enumitr= vec.elements();
		while(enumitr.hasMoreElements()){
			System.out.print(enumitr.nextElement()+" ");
		}
	}

}
