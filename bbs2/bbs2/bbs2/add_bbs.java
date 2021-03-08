package bbs2;

public class add_bbs {

	//	============================================================
	//	add 선언
	int number = 1;
	
	public static void add() {
		System.out.println("제목을 입력해주세요 : ");
		String title = Article.sc.next();
		System.out.println("내용을 입력해주세요 : ");
		String body = Article.sc.next();
		System.out.println("등록일자를 입력해주세요 : ");
		String regDate = Article.sc.next();
		System.out.println("별명을 입력해주세요 : ");
		String nickname = Article.sc.next();
		System.out.println("히트수를 입력해주세요 : ");
		int hit = Article.sc.nextInt();
		int number = 4;
		
		Article article = new Article(number, title, body, regDate, nickname, hit);
		Articles.articles.add(article);
		number++;
		
		System.out.println("게시물이 등록되었습니다.");		
	}
}
