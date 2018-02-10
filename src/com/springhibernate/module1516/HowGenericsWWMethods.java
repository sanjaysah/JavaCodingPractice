package com.springhibernate.module1516;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HowGenericsWWMethods {

	public static void main(String[] args) {
		Integer[] iarr = {1,2,3,4,5,6};
		System.out.println("Lets Print Int Array");
		printArray(iarr);
		String[] strarr = {"A","Z","X","D","U","L"};
		System.out.println("Lets Print String Array");
		printArray(strarr);
	}
//Use of <E> in Method in case of Primitive data types Normal arrays passed in parameter
	static <E> void printArray(E[] elements) {
		Arrays.sort(elements);//Sorting simple primitive data types Arrays
		for(E e:elements){
			System.out.print(" "+e);
		}
		System.out.println();
	}

}
