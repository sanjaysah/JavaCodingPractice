package com.springhibernate.module10;

import java.util.Arrays;

public class HowArraysSortWorks {

	public static void main(String[] args) {
		//Int array sorting
		int[] intArr = {1,3,9,7,5,2,8,4,6};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//String Array sorting
		String[] strArr={"abc","zbc","ghj","kij","poi","wed"};
		//Arrays class dont have sort(String []) method, instead sort(Object []) can be used for string arrays
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
	}

}
