package com.springhibernate.module10;

import java.util.Comparator;
//Using Comparable we can sort by one variable at a time, 
//but using Comparator we have choice of implementing sort by all avilable variables in Class.
//to achieve that we have to create many ananymous implementation of comparator interface in the class which need to be sorted
public class EmployeeCustomClassComparatorSort implements Comparable<EmployeeCustomClassComparatorSort>{
	
	int id;
	String name;
	int age;
	long salary;
	
	EmployeeCustomClassComparatorSort(int id,String name,int age,long salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "[id = "+this.id+
				",name = "+this.name+
				",age = "+this.age+
				",salary = "+this.salary+"]";
		
	}

	@Override
	public int compareTo(EmployeeCustomClassComparatorSort o) {
		return (this.id - o.id);
		//return (this.name.compareTo(o.name));
		//return (this.age - o.age);
		//return (int)(this.salary - o.salary);
	}
	
	static Comparator<EmployeeCustomClassComparatorSort> ageComparator = new Comparator<EmployeeCustomClassComparatorSort>(){

		@Override
		public int compare(EmployeeCustomClassComparatorSort o1,
				EmployeeCustomClassComparatorSort o2) {
			return o1.age-o2.age;
		}
		
	};

	static Comparator<EmployeeCustomClassComparatorSort> nameComparator = new Comparator<EmployeeCustomClassComparatorSort>(){

		@Override
		public int compare(EmployeeCustomClassComparatorSort o1,
				EmployeeCustomClassComparatorSort o2) {
			return o1.name.compareTo(o2.name);
		}
		
	};
	
	static Comparator<EmployeeCustomClassComparatorSort> salaryComparator = new Comparator<EmployeeCustomClassComparatorSort>(){

		@Override
		public int compare(EmployeeCustomClassComparatorSort o1,
				EmployeeCustomClassComparatorSort o2) {
			return (int)(o1.salary-o2.salary);
		}
		
	};
}
