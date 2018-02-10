package com.springhibernate.module1516;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {
//Generics provides 3 main advantage - 1. Type Safety, 2. Type Cast no longer reqd. , 
//3. Compile time error on type safety(classcastException)
	public static void main(String[] args) {
		List<Integer> listArr = new ArrayList<>();//1. Type safety <String> means only will accept Strings
		listArr.add(1);
		//listArr.add("A");//2. COmpile time error stating int is not acceptable instead of String
		listArr.add(2);
		int i = listArr.get(1);//3. Here Type Casting is not reqd, older code had it - int i = (int)listArr.get(1);
	}

}
