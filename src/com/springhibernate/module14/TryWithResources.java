package com.springhibernate.module14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {
//try with resources is used in coding to highlight the code/resource causing Exception in the program
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new StringReader("Reading String"));){
			String str;
			//BufferedReader br = new BufferedReader(new StringReader("Reading String"));
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
