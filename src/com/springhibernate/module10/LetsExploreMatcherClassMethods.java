package com.springhibernate.module10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetsExploreMatcherClassMethods {

	public static void main(String[] args) {
		// Here \\b means word boundary\space
		Pattern p = Pattern.compile("\\bA\\b");
		Matcher m = p.matcher("A A A AB A");
		int count=0;
		while(m.find()){
			System.out.println("Start Index -- "+m.start());
			System.out.println("End Index -- "+m.end());
			count++;
			System.out.println("Total Match count -- "+count);
		}
		
		//Find Pattern Match and Replace All
		Pattern pattern = Pattern.compile("Core Java");
		Matcher matcher = pattern.matcher("Core Java Training Program");
		String replace = "Regular Expression";
		System.out.println("----------------------------");
		System.out.println(matcher.replaceAll(replace));
		
	}

}
