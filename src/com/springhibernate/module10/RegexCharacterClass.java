package com.springhibernate.module10;

import java.util.regex.Pattern;

public class RegexCharacterClass {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[abc]+", "ccc"));//one or more char out of char a,b and c only
		////regex more extensive usage examples
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}+", "core67"));
		//System.out.println(Pattern.matches("[789]?{1}[a-zA-Z0-9]{3}+", "7abc"));
	}

}
