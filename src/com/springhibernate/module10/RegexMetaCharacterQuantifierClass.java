package com.springhibernate.module10;

import java.util.regex.Pattern;

public class RegexMetaCharacterQuantifierClass {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d", "1"));//single digit only
		System.out.println(Pattern.matches("\\D", "a"));//single non digit only
		////quantifier plus meta character use both next
		System.out.println(Pattern.matches("\\d*", ""));//digit single or more or not at all
		System.out.println(Pattern.matches("\\D+", ""));//non digit single or more
	}

}
