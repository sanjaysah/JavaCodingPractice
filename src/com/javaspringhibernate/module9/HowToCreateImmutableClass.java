package com.javaspringhibernate.module9;

import java.util.HashMap;
import java.util.Iterator;

public final class HowToCreateImmutableClass {
	private final String name;
	private final int id;
	private final HashMap<String, String> testMap;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
		//return testMap;
		return (HashMap<String, String>) testMap.clone();
		
	}
	
	HowToCreateImmutableClass(int id, String name, HashMap<String, String> hm){
		this.id=id;
		this.name=name;
/*		//Shallow Copy
		this.testMap=hm;*/
		//Deep Copy Starts
		HashMap<String, String> tempMap = new HashMap<>();
		String key;
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()){
			key=itr.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
		//Deep Copy Ends
	}
	
	public static void main(String[] args) {
		
		String name = "Sanjay";
		int id =1;
		HashMap<String, String> employee = new HashMap<>();
		employee.put("1", "Sanjay");
		employee.put("2", "Savita");
		employee.put("3", "Darsh Sah");
		HowToCreateImmutableClass obj = new HowToCreateImmutableClass(id, name, employee);
		System.out.println(obj.getId()+"-"+obj.getName()+"-"+obj.getTestMap());
		
		id=10;
		name="Mistri";
		employee.put("4", "Mistri");
		obj = new HowToCreateImmutableClass(id, name, employee);
		System.out.println(obj.getId()+"-"+obj.getName()+"-"+obj.getTestMap());
		
	}
}
