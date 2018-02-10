package com.springhibernate.module10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowCollectionsSortWorks {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		List<String> destAscStrList = new ArrayList<>();
		strList.add("zbc");
		strList.add("ghj");
		strList.add("kij");
		strList.add("poi");
		strList.add("wed");
		strList.add("abc");
		//initializing dest list of same size as src list with data
		destAscStrList.add("zbc");
		destAscStrList.add("ghj");
		destAscStrList.add("kij");
		destAscStrList.add("poi");
		destAscStrList.add("wed");
		destAscStrList.add("abc");
		
		Collections.sort(strList);//sort in default ascending order
		for(String str:strList){
			System.out.print(str+", ");
		}
		System.out.println();
		Collections.copy(destAscStrList, strList);//dest list size should be equal or larger than src list
		Collections.reverse(destAscStrList);//reverse order of content of dest list
		for(String str:destAscStrList){
			System.out.print(str+", ");
		}
	}

}
