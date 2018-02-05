package com.javaspringhibernate.module1;

public class SwitchCase {
	
	public static void grading(char grade){
		int success;
		switch(grade){
		case 'A':
			System.out.println("Excellent Grade");
			success=1;
			break;
		case 'B':
			System.out.println("Very Good Grade");
			success=1;
			break;
		case 'C':
			System.out.println("Good Grade");
			success=1;
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low Grade");
			success=0;
			break;
		default:
			System.out.println("Invalid Grade");
			success=-1;
			break;
		}
		resultAsPerGrading(success);
		System.out.println();
	}
	
	public static void resultAsPerGrading(int success){
		switch(success){
		case -1:
			System.out.println("No Result");
			break;
		case 0:
			System.out.println("Fail");
			break;
		case 1:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Dont know");
		}
	}

	public static void main(String[] args) {
		grading('A');
		grading('B');
		grading('C');
		grading('D');
		grading('E');
		grading('F');
		grading('G');
	}

}
