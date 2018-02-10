package com.springhibernate.module10;

import java.util.Arrays;

public class HowComparableSortWorks {

	public static void main(String[] args) {
		EmployeeCustomClassComparableSort[] empArr = new EmployeeCustomClassComparableSort[4];
		empArr[0] = new EmployeeCustomClassComparableSort(3,"Zen",29,50000);
		empArr[1] = new EmployeeCustomClassComparableSort(1,"Archie",25,40000);
		empArr[2] = new EmployeeCustomClassComparableSort(4,"Xavier",27,60000);
		empArr[3] = new EmployeeCustomClassComparableSort(2,"Ben",26,20000);
		
		Arrays.sort(empArr);
		System.out.println("Sorted by using Comparable Interface(CompareTo methos override) using id's - "+Arrays.toString(empArr));
		
	
	}

}
