package com.javaspringhibernate.module1;

public class FibonocciSolutionTeacher {

	public static void main(String[] args) {
		
		for(int i=0, j=1;i<50;i=i+j,j=i-j){
			System.out.print(i+" ");
		}
	}

}
