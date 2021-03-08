package bbs2;

public class ArticleSmaple_bbs {

	//	============================================================
	//	ArticleSamplePrint 선언
	public static void ArticleSamplePrint() {
		System.out.println("\n출력예시\n");
		System.out.println("======================");

		for(int i = 1; i < 4; i++) {
			Article article = new Article(i, "title", "body", "regDate", "nickname", i*10);
			Articles.articles.add(article);
			
			System.out.println("번호 : " + Articles.articles.get(i-1).number);
			System.out.println("제목 : " + Articles.articles.get(i-1).title);
			System.out.println("내용 : " + Articles.articles.get(i-1).body);
			System.out.println("등록일 : " + Articles.articles.get(i-1).regDate);
			System.out.println("작성자 : " + Articles.articles.get(i-1).nickname);
			System.out.println("조회수 : " + Articles.articles.get(i-1).hit);
			System.out.println("======================");
		
		}

	}
}
