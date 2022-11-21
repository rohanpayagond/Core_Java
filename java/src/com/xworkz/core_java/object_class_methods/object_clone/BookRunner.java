package com.xworkz.core_java.object_class_methods.object_clone;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book("Classmate", 85, 75);
		
		try {
			Book copyOfBook=(Book) book.clone();
			System.out.println("Original Book = "+book);
			System.out.println("Copy of the Book = "+copyOfBook);
			
			copyOfBook.brand="Vidya";
			copyOfBook.noOfPages=88;
			copyOfBook.price=74;
			System.out.println("-------------");
			System.out.println("After changing = "+copyOfBook);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
