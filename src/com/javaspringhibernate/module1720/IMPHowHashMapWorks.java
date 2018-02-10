package com.javaspringhibernate.module1720;

import java.util.HashMap;
import java.util.Map;

public class IMPHowHashMapWorks {
//Map is useful when we have requirement same as accessing the database(key, value relation) 
//and performing CRUD operations. Map contains unique keys but can have duplicate values
//HashMap can have one null key, multiple null values inside keys. Every key-value pair is one Entry
//and set of Entries are called EntrySet. KeySet is all keys stored in a set. Instead of add, we use put(k,v)
//Entry is a sub-Interface of Map Interface
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "1stValue");
		hMap.put(3, "2ndValue");
		hMap.put(2, "3rdValue");
		System.out.println(hMap.putIfAbsent(3, "3rdValue"));//if the key mentioned is present, return the existing value
		
		//Traversing
		for(Map.Entry m:hMap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
