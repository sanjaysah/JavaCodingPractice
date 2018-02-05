package com.javaspringhibernate.module1;

public class BreakLabelledBreak {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++){
			for(int j=0;j<=5;j++){
				if(i==3&&j==3){
					break;
				}
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}
	}

}
