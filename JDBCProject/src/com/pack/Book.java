package com.pack;

public class Book {
private int id;
private String bname;
private int price;
public Book(int id, String bname, int price) {
	super();
	this.id = id;
	this.bname = bname;
	this.price = price;
}
public Book() {
	super();
}
@Override
public String toString() {
	return "Book [id=" + id + ", bname=" + bname + ", price=" + price + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


	
}
