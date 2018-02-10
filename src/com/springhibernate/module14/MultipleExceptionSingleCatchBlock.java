package com.springhibernate.module14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class MultipleExceptionSingleCatchBlock {

	public static void main(String[] args) {
		try{
			System.out.println("MultipleExceptionSingleCatchBlock");
			int i=20/0;
			Thread.sleep(2000);
			Reader in = new StringReader("Reading String from StringReader class");
			BufferedReader br = new BufferedReader(in);
			String strRead = br.readLine();
			br.close();
		}catch(IndexOutOfBoundsException|ArithmeticException|InterruptedException|IOException e){
			e.printStackTrace();
		}
	}

}
