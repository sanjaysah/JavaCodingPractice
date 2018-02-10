package com.springhibernate.module1516;
class GenericClass<T>{
	T obj;

	public T get() {
		return obj;
	}

	public void add(T obj) {
		this.obj = obj;
	}
}
//five terms used in generics - <T> (Type), <E> (Elements- Collections), <k,v> , <N> - Numbers
public class HowGenericsWorksWithClasses {
	
	public static void main(String[] args) {
		GenericClass<Integer> gc1 = new GenericClass<>();
		gc1.add(1);
		gc1.add(2);
		System.out.println(gc1.get());//will print the latest added value
		
		GenericClass<String> gc2 = new GenericClass<>();
		gc2.add("A");
		gc2.add("B");
		System.out.println(gc2.get());//will print the latest added value
	}

}
