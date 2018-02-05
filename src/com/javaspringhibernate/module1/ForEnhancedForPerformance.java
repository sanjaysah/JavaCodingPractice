package com.javaspringhibernate.module1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForEnhancedForPerformance {
	
	static long startTime;
	static long endTime;
	static List<Integer> list = new ArrayList<>();
	
	static{
		for(int i=0;i<=100_000_00;i++){
			list.add(i);
		}
	}

	public static void main(String[] args) {
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i:list){}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("TIme taken by Enhanced For loop is - "+(endTime-startTime)+" ms.");
		System.out.println();
		
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i=0;i<list.size();i++){}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("TIme taken by Normal For loop is - "+(endTime-startTime)+" ms.");
		System.out.println();
		
		startTime=Calendar.getInstance().getTimeInMillis();
		int size = list.size();
		for(int i=0;i<size;i++){}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("TIme taken by Normal For loop with size presaved in variable is - "+(endTime-startTime)+" ms.");
		System.out.println();
		
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i=list.size();i>=0;--i){}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("TIme taken by Normal For loop in descending order/Backwards is - "+(endTime-startTime)+" ms.");
		System.out.println();
	}

}
