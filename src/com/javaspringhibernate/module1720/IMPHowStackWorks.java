package com.javaspringhibernate.module1720;

import java.util.Enumeration;
import java.util.Stack;

public class IMPHowStackWorks {
//Stack is subclass of Vector and is a Data Structure that follows LIFO(Last in First out) structure
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		Enumeration<Integer> enumitr = stack.elements();
		while(enumitr.hasMoreElements()){
			System.out.print(" "+enumitr.nextElement());
		}
	}

}
