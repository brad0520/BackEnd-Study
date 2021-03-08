package bbs2;

import java.util.Scanner;

public class Article {

	int number;
	String title;
	String body;
	static Scanner sc = new Scanner(System.in);
	
	
	public Article(int number, 	String title, String body) {
		this.number = number;
		this.title = title;
		this.body = body;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}