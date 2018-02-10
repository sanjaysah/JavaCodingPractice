package com.springhibernate.module10;

public class HowEnumDataTypesWorks {
	public enum Company{
		AMAZON,PAYPAL,GOOGLE,YAHOO,ATT;
	}
	Company cName;
	
	HowEnumDataTypesWorks(Company cName){
		this.cName=cName;
	}
	
	void compayDetails(){
		switch (cName) {
		case AMAZON:
			System.out.println("Biggest market place - AMAZON");
			break;
		case PAYPAL:
			System.out.println("Biggest payment online - PAYPAL");
			break;
		case GOOGLE:
		case YAHOO:
			System.out.println("Biggest search Engine - "+cName);
			break;
		default:
			System.out.println("Biggest Construction Company - ATT");
			break;
		}
	}
	
	public static void main(String[] args) {
		HowEnumDataTypesWorks obj1 = new HowEnumDataTypesWorks(Company.AMAZON);
		obj1.compayDetails();
		
		HowEnumDataTypesWorks obj2 = new HowEnumDataTypesWorks(Company.PAYPAL);
		obj2.compayDetails();
		
		HowEnumDataTypesWorks obj3 = new HowEnumDataTypesWorks(Company.GOOGLE);
		obj3.compayDetails();
		
		HowEnumDataTypesWorks obj4 = new HowEnumDataTypesWorks(Company.YAHOO);
		obj4.compayDetails();
		
		HowEnumDataTypesWorks obj5 = new HowEnumDataTypesWorks(Company.ATT);
		obj5.compayDetails();
		
	}
}
