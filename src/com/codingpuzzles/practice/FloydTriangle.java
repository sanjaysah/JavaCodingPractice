package com.codingpuzzles.practice;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n=0;
		for(int i=0;i<r;i++){
			for(int j =0;j<=i;j++){
				System.out.print(++n+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
