package com.javaspringhibernate.module9;

import java.util.StringTokenizer;

public class HowStringTokenizerWorks {

	public static void main(String[] args) {
		
		String str = "I am the 1st strongest man in the world ~!@#";
		StringTokenizer token = new StringTokenizer(str, "~");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}

}
