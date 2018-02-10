package com.javaspringhibernate.module1720;

import java.util.Enumeration;
import java.util.Vector;

public class IMPHowVectorWorks {

	public static void main(String[] args) {
//Vector empty constructor creates default initial size and load Factor/Capacity Increment of 10, e.g. 10, 20, 30 etc..
//another constructor takes initial capacity as parameter and load factor/capacity increment is done by 100% of initial Capacity set
//e.g. if initial capacity is 2 than later capacity will be increased by 100% of initial capacity 2+2=4, later 4+4=16, 16+16=32
//Insertion order is maintained
//allow duplicates and null value more than once
//Enumeration and Iterator is used for transvering over elements
		Vector<String> vec =  new Vector<>(2);//(2,5)
		//System.out.println(vec.capacity());
		vec.add("FirstElement");//add is unsynchronized and returns boolean
		System.out.println(vec.capacity()+" - "+vec.size());//capacity is increased by load factor but size is increased by 1 every time element is added.
		vec.addElement("SecondElement");//addElement is synchronized and returns void
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("ThirdElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("FourthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FifthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SixthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FirstElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SecondElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("ThirdElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("FourthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FifthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SixthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FirstElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SecondElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("ThirdElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("FourthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FifthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SixthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FirstElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SecondElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("ThirdElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("FourthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.add("FifthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		vec.addElement("SixthElement");
		System.out.println(vec.capacity()+" - "+vec.size());
		
		Enumeration itr = vec.elements();
		while(itr.hasMoreElements()){
			System.out.println(itr.nextElement());
		}
	}

}
