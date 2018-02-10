package com.springhibernate.module10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhatAreRegularExpressions {

	public static void main(String[] args) {
		
		//1st way of working with REGEX, Pattern and Matcher API
		Pattern p = Pattern.compile(".o");
		Matcher m = p.matcher("Ao");
		Boolean result1 = m.matches();
		System.out.println("Pattern matching returned - "+result1);
		
		//2nd way of working with REGEX, Pattern and Matcher API
		boolean result2 = Pattern.compile(".o").matcher("Ao").matches();
		System.out.println("Pattern matching returned - "+result2);
		
		//3rd way of working with REGEX, Pattern and Matcher API
		boolean result3 = Pattern.matches(".o", "Ao");
		System.out.println("Pattern matching returned - "+result3);
	}

}
