package com.springhibernate.module1516;

import java.util.ArrayList;
import java.util.Collections;

public class HowLowerBoundedWildCardWorks {

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
		printListItems(intArr);
		ArrayList<Number> numArr = new ArrayList<>();
		numArr.add(5);
		numArr.add(6.2D);
		numArr.add(1.3f);
		numArr.add(3.12d);
		numArr.add(2);
		numArr.add(4);
		//Collections.sort(numArr);//Error Number is not any <T> type
		printListItems(numArr);
		ArrayList<Double> dArr = new ArrayList<>();
		dArr.add(5d);
		dArr.add(6.2D);
		dArr.add(2.4d);
		dArr.add(3.41d);
		dArr.add(2.8D);
		dArr.add(4D);
		Collections.sort(dArr);
		//printListItems(dArr);//Double is not super of Integer so returning error
	}

	static void printListItems(ArrayList<? super Integer> list) {
		for(Object obj:list){
			System.out.print(" "+obj);
		}
		System.out.println();
	}

}
