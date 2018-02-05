package com.codingpuzzles.practice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check whether it is an ArmStrongNumber");
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		//int number =371;
		int actualasn=0;
		String numstr = String.valueOf(number);
		//System.out.println(numstr.length());
		int[] intarr = new int[numstr.length()];
		for(int i=0;i<numstr.length();i++){
			intarr[i]=Integer.valueOf(String.valueOf(numstr.charAt(i)));
			//System.out.println(intarr[i]);
			actualasn = (intarr[i]*intarr[i]*intarr[i])+actualasn;
		}
		if(actualasn==number){
			System.out.println("The Number entered is an ArmStrongNumber");
		}else{
			System.out.println("The Number entered is not an ArmStrongNumber");
		}
	}

}
