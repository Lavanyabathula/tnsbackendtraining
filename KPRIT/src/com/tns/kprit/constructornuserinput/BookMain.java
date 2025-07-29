package com.tns.kprit.constructornuserinput;

public class BookMain {

	public static void main(String[] args) {

		Book b=new Book("Java Full Stack");
		//copying b to b1
		Book b1=new Book(b);
		b.display();
		b1.display();
		
		
	}

}
