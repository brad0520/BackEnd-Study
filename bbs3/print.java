package bbs3;

import java.util.ArrayList;

public class print{

	//	============================================================
	//	listContent 선언
	public static void printAll(ArrayList<Article> articles) {
		System.out.println("\n======================");
		for(int i1 = 0; i1 < articles.size(); i1++) {
			System.out.println("\n===== " + articles.get(i1).number + "번 게시물 =======");
			System.out.println("번호 : " + articles.get(i1).number);
			System.out.println("제목 : " + articles.get(i1).title);
			System.out.println("내용 : " + articles.get(i1).body);
			System.out.println("등록일 : " + articles.get(i1).regDate);
			System.out.println("작성자 : " + articles.get(i1).nickname);
			System.out.println("조회수 : " + articles.get(i1).hit);
			System.out.println("======================");
		}
	}
	//	============================================================
	//	readPrint 선언
	public static void readPrint(int i1) {
		System.out.println("\n===== " + Articles.articles.get(i1).number + "번 게시물 =======");
		System.out.println("번호 : " + Articles.articles.get(i1).number);
		System.out.println("제목 : " + Articles.articles.get(i1).title);
		System.out.println("내용 : " + Articles.articles.get(i1).body);
		System.out.println("등록일 : " + Articles.articles.get(i1).regDate);
		System.out.println("작성자 : " + Articles.articles.get(i1).nickname);
		System.out.println("조회수 : " + Articles.articles.get(i1).hit);
		System.out.println("======================");

	}
	//	============================================================
	//	listPart 선언
	public static void PrintList(ArrayList<Article> articles) {
		System.out.println("\n======================");
		for(int i1 = 0; i1 < articles.size(); i1++) {
			System.out.println("번호 : " + articles.get(i1).number);
			System.out.println("제목 : " + articles.get(i1).title);
			System.out.println("등록일 : " + Articles.articles.get(i1).regDate);
			System.out.println("작성자 : " + Articles.articles.get(i1).nickname);
			System.out.println("조회수 : " + Articles.articles.get(i1).hit);
			System.out.println("======================");
		}
	}
	//	============================================================
	//	listSample 선언
	public static void printSample() {
		Article a1 = new Article(1, "안녕~", "안녕하세요", "2021.03.04", "익명");
		Article a2 = new Article(2, "반갑습니다", "반가워요", "2021.03.07", "익명");
		Article a3 = new Article(3, "하이~", "처음 뵙겠습니다.", "2021.03.08", "익명");
			
		Articles.articles.add(a1);
		Articles.articles.add(a2);
		Articles.articles.add(a3);
		
		System.out.println("\n출력예시\n");
		printAll(Articles.articles);
		
	}
}