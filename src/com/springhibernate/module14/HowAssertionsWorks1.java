package com.springhibernate.module14;

import java.util.Scanner;

public class HowAssertionsWorks1 {
//Assertion compliments the Exception Handling and Unit Testing, When Assertion fails JVM throws AssertionError
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ageInput = scan.nextInt();
		assert ageInput >=18 : "Age should not be less than 18 to Vote";
		System.out.println("Age entered by user is - "+ageInput);
		scan.close();
	}

}// run as run config - pass (-ea) in VM arguments, click ok and type age in command line argument and press enter
