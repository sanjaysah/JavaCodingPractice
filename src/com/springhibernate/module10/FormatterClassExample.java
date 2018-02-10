package com.springhibernate.module10;

import java.util.Formatter;

public class FormatterClassExample {

	public static void main(String[] args) {
		// FORMATTER - TO print a content in a particular way
		Formatter fmt = new Formatter();
		fmt.format("%s %d %f", "string", 10, 13.234);
		System.out.println(fmt.out());
		fmt.close();

	}

}
