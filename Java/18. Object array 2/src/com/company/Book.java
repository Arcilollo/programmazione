package com.company;

public class Book {
	private String title;
	private String author;
	private int pages;
	private float cost;

	public Book(String bookName, String author, int pages, float cost) {
		this.title = bookName;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}