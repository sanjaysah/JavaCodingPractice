package com.javaspringhibernate.module1720;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IMPHowLinkedListWorks {
//Linked List uses doubly linked list Data Structure (both forward and backward direction
//It implements List and Dequeue interfaces
//Manipulation is faster than ArrayList as lot of shifting is not required
	public static void main(String[] args) {
		LinkedList<Integer> intArr = new LinkedList<>();
		intArr.add(5);
		intArr.add(null);//Allow storing null values
		intArr.add(1);
		intArr.add(3);
		intArr.add(2);
		intArr.add(4);//Maintains Insertion Order
		intArr.add(null);//duplicate null value
		intArr.add(6);//duplicates integer
		//Collections.sort(intArr);// will throw null pointer exception as values are null's
		
		LinkedList<Integer> intArr1 = new LinkedList<>();
		intArr1.add(5);
		intArr1.add(null);
		intArr1.add(1);
		intArr1.add(3);
		intArr1.add(2);
		intArr1.add(4);
		intArr1.add(null);
		intArr1.add(6);
		intArr1.add(7);
		
		LinkedList<String> strArr = new LinkedList<>();
		strArr.add("A");
		strArr.add(null);//Allow storing null values
		strArr.add("Z");
		strArr.add("B");
		strArr.add("U");
		strArr.add("F");//Maintains Insertion Order
		strArr.add(null);//duplicate null value
		strArr.add("Z");//duplicates string
		//Collections.sort(strArr);// will throw null pointer exception as values are null's
		
		////LinkedList specific methods
		intArr.addFirst(0);//add at first position in LinkedList
		intArr.push(9);//This method is equivalent to addFirst(E).
		intArr.addLast(8);//add at last position in LinkedList
//		System.out.println(intArr.getFirst());//returns the first element/object in the LL
//		System.out.println(intArr.element());//Retrieves, but does not remove, the head (first element) of this list.
//		System.out.println(intArr.getLast());//returns the last element/object in the LL
//		System.out.println(intArr.offer(9));//add at tail position in LinkedList and returns true
//		System.out.println(intArr.offerFirst(0));//add at first position in LinkedList and returns true
//		System.out.println(intArr.offerLast(10));//add at last position in LinkedList and returns true
//		System.out.println(intArr.peek());//Retrieves, but does not remove, the head (first element) of this list.
//		System.out.println(intArr.peekFirst());//Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
//		System.out.println(intArr.peekLast());//Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
//		System.out.println(intArr.poll());//Retrieves and removes the head (first element) of this list.
//		System.out.println(intArr.pollFirst());//Retrieves and removes the first element of this list, or returns null if this list is empty.
//		System.out.println(intArr.pollLast());//Retrieves and removes the last element of this list, or returns null if this list is empty.
//		System.out.println(intArr.removeFirst());//Removes and returns the first element from this list
//		System.out.println(intArr.removeLast());//Removes and returns the last element from this list
//		System.out.println(intArr.removeFirstOccurrence(null));//Removes the first occurrence of the specified element in this list 
//		System.out.println(intArr.removeLastOccurrence(null));//Removes the Last occurrence of the specified element in this list
//		System.out.println(intArr.pop());//this method is equivalent to removeFirst() method

		/*////Retreiving objects index based
		System.out.println(strArr.get(5));//LinkedList is index based
		*/
		
		////Add All
		intArr.addAll(intArr1);//appends intArr1 at the end of intArr and store all in intArr
		
		/*////Cloning of LinkedList<Integer>, cloning is shallow copy
		Object intArr2 = intArr.clone(); //Cloning way1
		//@SuppressWarnings("unchecked")
		//LinkedList<Integer> intArr2 = (LinkedList<Integer>) intArr.clone();//Cloning way 2
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
		
		/*Iterator<Integer> itr1 = intArr.iterator();
		while(itr1.hasNext()){
			System.out.print(" "+itr1.next());
		}
		System.out.println();
		////remove and retain methods
		//intArr.remove(0);//remove object at an index in list
		//intArr.remove(null);//remove object, after finding it at any index first time
		LinkedList<Integer> intArr2 = new LinkedList<>();
		intArr2.add(1);
		intArr2.add(3);
		intArr2.add(2);
		intArr2.add(4);
		intArr.removeAll(intArr2);//will remove all objects in intArr2 from intArr list
		//intArr.retainAll(intArr2);//will retain all elements of intArr2 list in List including duplicates intArr and remove all others
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
		
	/*	////toArray() - convert List into Object Array
		Object[] list = intArr.toArray();
		Arrays.sort(list);//just to check converted to Arrays of object
		for(Object obj:list){
			System.out.print(" "+obj);
		}
		System.out.println();*/
		
		////Traversing through elements using 1> Iterator class
		Iterator<Integer> itr = intArr.iterator();
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
		
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

