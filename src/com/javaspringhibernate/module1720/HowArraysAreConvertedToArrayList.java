package com.javaspringhibernate.module1720;

import java.util.ArrayList;
import java.util.Arrays;

public class HowArraysAreConvertedToArrayList {

	public static void main(String[] args) {
		String[] str = {"Z", "D", "H", "A", "B"};
		////Converting an array into ArrayList by using Arrays.asList(array) into Arraylist constructor
		ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
		strList.add("L");
		strList.add("O");
		
		for(String s:strList){
			System.out.print(" "+s);
		}
	}

}
