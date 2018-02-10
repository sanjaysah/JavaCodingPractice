package com.springhibernate.module12;

import java.io.IOException;

class Parent1{
	static String str = "Parent Class";
	
	static void printmethod(){
		System.out.println(str);
	}
}
//Rule 1 - If Parent class isn't declaring any exception then Child class can throw unchecked exception without issue
//         But if child class throw checked exception then all implemnting class and calling method/class has to use Try-Catch/Throws
//Rule 2 - If Parent class is declaring any Checked Exception then Child class can declare same,
//child exception of parent exception but no parent exception of same. else copiletime error. to solve change parent throws declaration to higher parent exception

public class ExceptionRule1InInheritenceClasses extends Parent1{
	static String str = "Child Class";
	static void printmethod(){
		System.out.println(str);
		//throw new IOException("Checked Exception in Child Class");//Unhandled Exception Compiletime error - use try catch/Throws to run fine
		throw new ArithmeticException("Unchecked Exception in Child Class");//No Compile time error
	}
	
	public static void main(String[] args) {
		printmethod();
	}
}
