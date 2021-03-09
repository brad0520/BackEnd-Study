package bbs3;

public class Add {

	//	============================================================
	//	add 선언
	static int number = 4;
	
	public void addArticle() {
//		제목 입력
		System.out.println("제목을 입력해주세요 : ");
		String title = Article.sc.next();
//		내용 입력
		System.out.println("내용을 입력해주세요 : ");
		String body = Article.sc.next();
//		등록 시간 입력
		String regDate = Util.getNowDate();
//		별명 입력
		System.out.println("별명을 입력해주세요 : ");
		String nickname = Article.sc.next();
//		새로운 article 생성
		Article article = new Article(number, title, body, regDate, nickname);
//		새로운 article을 Articles에 저장
		Articles.articles.add(article);
//		넘버 1증가 => 글번호 증가
		number++;
		
		System.out.println("게시물이 등록되었습니다.");		
	}
}