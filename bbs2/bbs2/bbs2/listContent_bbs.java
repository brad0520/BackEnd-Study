package bbs2;

public class listContent_bbs {

	//	============================================================
	//	listContent 선언
	public static void listContent(int i) {
		System.out.println("\n===== " + Articles.articles.get(i).number + "번 게시물 =======");
		System.out.println("번호 : " + Articles.articles.get(i).number);
		System.out.println("제목 : " + Articles.articles.get(i).title);
		System.out.println("내용 : " + Articles.articles.get(i).body);
		System.out.println("등록일 : " + Articles.articles.get(i).regDate);
		System.out.println("작성자 : " + Articles.articles.get(i).nickname);
		System.out.println("조회수 : " + Articles.articles.get(i).hit);
		System.out.println("======================");
	}
}
