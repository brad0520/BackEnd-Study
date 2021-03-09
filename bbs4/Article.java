package bbs3;

import java.util.Scanner;

public class Article {

	int number;
	String title;
	String body;
	String regDate;
	String nickname = "익명";
	int hit = 0;
	static Scanner sc = new Scanner(System.in);
	
	
	public Article(int number, 	String title, String body, String regDate, String nickname) {
		this.number = number;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
		this.nickname = nickname;
//		this.hit = hit;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
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