package com.springhibernate.module14;

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	void printEmployee(){
		System.out.println("ID - "+this.id+", Name - "+this.name);
	}
}

public class AvoidNullPointerExceptionUsingTernaryOperator {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,null);
		emp1.printEmployee();
		Employee emp2 = null;
		String message=(emp2==null)?"":(emp2.getId()+" - "+emp2.getName());
		System.out.println(message);
	}

}
