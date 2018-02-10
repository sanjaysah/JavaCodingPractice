package com.springhibernate.module10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassHowToCountGroups {

	public static void main(String[] args) {
		String pattern ="(.*)(\\d)(.*)";
		String text = "sdjkdjkajkajskajska 89898989 hahsahsajhs!(@999(&#@*@";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			System.out.println("Default Group is "+m.group(0));//All I/P String
			System.out.println("1st Group is "+m.group(1));//Anything upto last single digit in I/P string
			System.out.println("2nd Group is "+m.group(2));//Last single digit in I/P string
			System.out.println("3rd Group is "+m.group(3));//Anything left after Last single digit in I/P string
			System.out.println("Group Count is "+m.groupCount());//Groups count
		}
	}

}
