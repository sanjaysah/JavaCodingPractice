package com.springhibernate.module10;

import java.util.Arrays;

public class HowComparatorSortWorks {

	public static void main(String[] args) {
		EmployeeCustomClassComparatorSort[] empArr = new EmployeeCustomClassComparatorSort[4];
		empArr[0] = new EmployeeCustomClassComparatorSort(3,"Zen",29,50000);
		empArr[1] = new EmployeeCustomClassComparatorSort(1,"Archie",25,40000);
		empArr[2] = new EmployeeCustomClassComparatorSort(4,"Xavier",27,60000);
		empArr[3] = new EmployeeCustomClassComparatorSort(2,"Ben",26,20000);
		
		Arrays.sort(empArr);
		System.out.println("Sorted by using Comparable Interface(CompareTo methos override) using id - "+Arrays.toString(empArr));
		
		Arrays.sort(empArr, EmployeeCustomClassComparatorSort.nameComparator);
		System.out.println("Sorted by using Comparable Interface(CompareTo methos override) using name - "+Arrays.toString(empArr));
		
		Arrays.sort(empArr, EmployeeCustomClassComparatorSort.ageComparator);
		System.out.println("Sorted by using Comparable Interface(CompareTo methos override) using age - "+Arrays.toString(empArr));
		
		Arrays.sort(empArr, EmployeeCustomClassComparatorSort.salaryComparator);
		System.out.println("Sorted by using Comparable Interface(CompareTo methos override) using salary - "+Arrays.toString(empArr));
		
	}

}
