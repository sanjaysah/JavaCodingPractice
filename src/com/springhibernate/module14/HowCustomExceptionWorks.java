package com.springhibernate.module14;

//Custom Exception class inheriting Parent Exception class and 
//in constructor calling parent constructor with string message as argument
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class HowCustomExceptionWorks {

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of Code.......");
	}

	static void validate(int i) throws InvalidAgeException {
		if(i>=18)
			System.out.println("Valid age for Voting");
		else{
			throw new InvalidAgeException("Invalid age for voting");
		}
	}

}
