package com.javaspringhibernate.module1720;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HowArrayListWorksCustomClass {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		Book book1 = new Book(4, "ThePowerOfHabit", "CharlesDubigg", "MentorBox", 20);
		Book book2 = new Book(2, "YouAreTheOne", "KuteBlackson", "AentorBox", 1);
		Book book3 = new Book(1, "MindGames", "StarkBencor", "UentorBox", 4);
		Book book4 = new Book(3, "BumGames", "MarkWaugh", "ZentorBox", 16);
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		
		for(Book b:bookList){
			if(b!=null){
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}
		}
	}

}
