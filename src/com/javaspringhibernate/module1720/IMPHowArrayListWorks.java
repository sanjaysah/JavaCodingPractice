package com.javaspringhibernate.module1720;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IMPHowArrayListWorks {

	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(5);
		intArr.add(null);//Allow storing null values
		intArr.add(1);
		intArr.add(3);
		intArr.add(2);
		intArr.add(4);//Maintains Insertion Order
		intArr.add(null);//duplicate null value
		intArr.add(6);//duplicates integer
		//Collections.sort(intArr);// will throw null pointer exception as values are null's
		
		ArrayList<Integer> intArr1 = new ArrayList<>();
		intArr1.add(5);
		intArr1.add(null);
		intArr1.add(1);
		intArr1.add(3);
		intArr1.add(2);
		intArr1.add(4);
		intArr1.add(null);
		intArr1.add(6);
		intArr1.add(7);
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("A");
		strArr.add(null);//Allow storing null values
		strArr.add("Z");
		strArr.add("B");
		strArr.add("U");
		strArr.add("F");//Maintains Insertion Order
		strArr.add(null);//duplicate null value
		strArr.add("Z");//duplicates string
		//Collections.sort(strArr);// will throw null pointer exception as values are null's
		
		/*//System.out.println(strArr.get(1));//ArrayList is index based
*/		
		////Add All
		intArr.addAll(intArr1);//appends intArr1 at the end of intArr and store all in intArr
		
		/*////Cloning of ArrayList<Integer>
		//Object intArr2 = intArr.clone(); //Cloning way1
		ArrayList<Integer> intArr2 = (ArrayList<Integer>) intArr.clone();//Cloning way 2
		System.out.println(intArr2.toString());//prints fine in both way of cloning
*/		
		/*////method contains(value) or containsAll(list)
		boolean b = intArr.contains(null);//return true or false whether specified value is contained in the list
		System.out.println(b);
		boolean bAll = intArr.containsAll(intArr1);//return true or false whether specified list's(intArr1) all content is contained in the actual list inArr
		System.out.println(bAll);*/
		
		/*////indexOf(Value)
		System.out.println(intArr.indexOf(null));//first occurence of object, returns its index no
		System.out.println(intArr.lastIndexOf(7));//last occurence of object, returns its index no
		*/
/*		////Traversing through elements using 1> Iterator class
		Iterator<Integer> itr1 = intArr.iterator();
		while(itr1.hasNext()){
			System.out.print(" "+itr1.next());
		}
		System.out.println();*/
		/*////remove and retain methods
		//intArr.remove(1);//remove object at an index in list
		//intArr.remove(null);//remove object, after finding it at any index first time
		ArrayList<Integer> intArr2 = new ArrayList<>();
		intArr2.add(1);
		intArr2.add(3);
		intArr2.add(2);
		intArr2.add(4);
		//intArr.removeAll(intArr2);//will remove all objects in intArr2 from intArr list
		intArr.retainAll(intArr2);//will retain all elements of intArr2 list in List including duplicates intArr and remove all others
		*/
		
		/*////sets the object passed at the index passed
		intArr.set(1, 7);*/
		
		/*////subList method
		List<Integer> list = intArr.subList(0, 6);//return a sub list created fromindex to toindex in the actual list.
		Iterator<Integer> itr1 = list.iterator();
		while(itr1.hasNext()){
			System.out.print(" "+itr1.next());
		}
		System.out.println();*/
		
		/*////toArray() - convert List into Object Array
		Object[] list = intArr.toArray();
		for(Object obj:list){
			System.out.print(" "+obj);
		}*/
		
		/*////Traversing through elements using 1> Iterator class
		Iterator<Integer> itr = intArr.iterator();
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}*/
		
		/*Iterator<String> stritr = strArr.iterator();
		while(stritr.hasNext()){
			System.out.print(" "+stritr.next());
		}*/
		
		////Traversing through elements using 1> Advanced For Loop
		/*for(int i:intArr){
			System.out.println(" "+i);
		}*/
		/*for(String s:strArr){
			System.out.println(" "+s);
		}*/
	}

}
