package com.javaspringhibernate.module1;

public class HWFibonacciSeries {

	public static void main(String[] args) {
		
		int firstno=0,secondno=1,thirdno;
		System.out.print("Fibonnoci series numbers are "+firstno+", "+secondno+", ");
		for(int i=0;i<=10;++i){
			thirdno=firstno+secondno;
			System.out.print(thirdno+", ");
			firstno=secondno;
			secondno=thirdno;		
			
		}
		//original solution by teacher
/*		for(int i=0, j=1;i<50;i=i+j,j=i-j){
			System.out.print(i+" ");
		}*/
	}

}
