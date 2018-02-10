package com.springhibernate.module1516;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HowUnBoundedWildCardWorks {

	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(5);
		intArr.add(6);
		intArr.add(1);
		intArr.add(3);
		intArr.add(2);
		intArr.add(4);
		Collections.sort(intArr);//sorting for collections objects
		System.out.println("Lets Print Integer List Array");
		printArray(intArr);
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Z");
		strArr.add("D");
		strArr.add("A");
		strArr.add("Y");
		strArr.add("L");
		strArr.add("B");
		Collections.sort(strArr);
		System.out.println("Lets Print String List Array");
		printArray(strArr);
	}
	
	//Use of Unbounded Wildcard in Method in case of Collection lists are passed instead of normal arrays.
		static void printArray(Collection<?> elements) {
			//Collections.sort(elements);
			for(Object e:elements){
				System.out.print(" "+e);
			}
			System.out.println();
		}

}
