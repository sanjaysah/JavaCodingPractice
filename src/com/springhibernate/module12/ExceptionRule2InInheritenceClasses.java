package com.springhibernate.module12;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent2{
	static String str = "Parent Class";
	
	static void printmethod() throws IOException{
		System.out.println(str);
		//throw new IndexOutOfBoundsException("Unchecked Exception Parent Class");
		throw new IOException("Checked Exception Parent Class");
	}
}
//Rule 1 - If Parent class isn't declaring any exception then Child class can throw unchecked exception without issue
//         But if child class throw checked exception then all implemnting class and calling method/class has to use Try-Catch/Throws
//Rule 2 - If Parent class is declaring any Checked Exception then Child class can declare same,
//         child exception of parent exception but no parent exception of same. else copiletime error. to solve change parent throws declaration to higher parent exception

public class ExceptionRule2InInheritenceClasses extends Parent2{

	static String str = "Child Class";
	static void printmethod() throws IOException{
		System.out.println(str);
		//throw new FileNotFoundException("Checked Exception in Child Class");//CHild Exception of Exception declared by Parent class
		//throw new IOException("Checked Exception in Child Class");//same Exception of Exception declared by Parent class
		//throw new Exception("Checked Exception in Child Class");//Parent Exception of Exception declared by Parent class - Not allowed by Rule2
	
	}
	
	public static void main(String[] args) throws IOException {
		printmethod();
	}
}
