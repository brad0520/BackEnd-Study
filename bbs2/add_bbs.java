package bbs2;

public class add_bbs {

	//	============================================================
	//	add 메서드 선언
	public static void add() {
		System.out.println("제목을 입력해주세요 : ");
		String title = Article.sc.next();
		System.out.println("내용을 입력해주세요 : ");
		String body = Article.sc.next();

		
		Article article = new Article(bbs.number, title, body);
		Articles.articles.add(article);
		bbs.number++;
		
		System.out.println("게시물이 등록되었습니다.");		
	}
}
