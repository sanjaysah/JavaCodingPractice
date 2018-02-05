package com.javaspringhibernate.module8;

public class CustomClassEqualityHashcodeEquality {

	public static void main(String[] args) {
		EmployeeHashcodeEquals e1 = new EmployeeHashcodeEquals("Sanjay");
		EmployeeHashcodeEquals e2 = new EmployeeHashcodeEquals("Sanjay");
		
		if(e1.equals(e2)){
			System.out.println("e1 and e2 are equal");
		}else{
			System.out.println("e1 and e2 are not equal");
		}
		
		System.out.println("Hashcode Value of e1 Object is "+e1.hashCode());
		System.out.println("Hashcode Value of e2 Object is "+e2.hashCode());
	}

}
