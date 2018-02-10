package com.springhibernate.module1516;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle Shape");
	}	
}

class Square extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Square Shape");
	}	
}

public class HowUpperBoundedWildcardWorks {

	static void drawShape(List<? extends Shape> list) {
		for(Shape s:list){//Instead of Object, using custom class Shape s:list
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		List<Rectangle> listR = new ArrayList<>();
		listR.add(new Rectangle());
		
		List<Square> listS = new ArrayList<>();
		listS.add(new Square());
		
		drawShape(listR);
		drawShape(listS);
	}
}
