package com.javaspringhibernate.module1720;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowHashMapWorksWithCustomClasses {

	public static void main(String[] args) {
		HashMap<Integer, Book> bookList = new HashMap<>();
		
		Book book1 = new Book(4, "ThePowerOfHabit", "CharlesDubigg", "MentorBox", 20);
		Book book2 = new Book(2, "YouAreTheOne", "KuteBlackson", "AentorBox", 1);
		Book book3 = new Book(1, "MindGames", "StarkBencor", "UentorBox", 4);
		Book book4 = new Book(3, "BumGames", "MarkWaugh", "ZentorBox", 16);
		
		bookList.put(1,book1);
		bookList.put(2,book2);
		bookList.put(3,book3);
		bookList.put(4,book4);
		
		for(Map.Entry<Integer, Book> m : bookList.entrySet()){
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println("For Key no - "+key+" Book id is - "+b.id+" Name is - "+b.name
					+" author - "+b.author+" publisher - "+b.publisher+" quantity - "+b.quantity);
		}
	}

}
