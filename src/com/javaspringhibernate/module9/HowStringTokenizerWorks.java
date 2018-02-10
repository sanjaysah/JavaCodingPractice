package com.javaspringhibernate.module9;

import java.util.StringTokenizer;

public class HowStringTokenizerWorks {

	public static void main(String[] args) {
		//my second commit and push upsteam
		//String str = "I am the 1st strongest man in the world ~!@#";
		String str = new String("I am the 1st strongest man in the world ~!@#");
		StringTokenizer token = new StringTokenizer(str, "1");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}

}
