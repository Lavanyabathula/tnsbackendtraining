package com.tns.kprit.constructornuserinput;
//Demo for Copy Constructor
public class Book {
	
	private String title;
	//Parameterized constructor
	Book(String t){
		title=t;
	}
	
	Book(Book b){
		title=b.title;
	}
	
	void display() {
		System.out.println("The title of the book" +title);
	}
	
	

}
