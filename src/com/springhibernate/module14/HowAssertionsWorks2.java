package com.springhibernate.module14;

public class HowAssertionsWorks2 {
//Assertion compliments the Exception Handling and Unit Testing, When Assertion fails JVM throws AssertionError
	public static void main(String[] args) {
		int argslength = args.length;
		assert argslength==5:"Arguments length must be 5";
		System.out.println("Done");
	}

}//run - as run config - pass (-ea) in VM arguments, type 5 in program arguments and click apply and ok