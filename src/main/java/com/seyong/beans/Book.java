package com.seyong.beans;

public class Book {

	 private String bookName;
	 private String author;
	 private double price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String author, double price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	 
	 
}
