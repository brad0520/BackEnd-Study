package bbs3;

public class update {

	//	============================================================
	//	update 선언
	public static void updateArticile() {
		System.out.println("몇번 데이터를 수정하시겠습니까? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = getTargetIndex.targetIndexOfArticle(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			System.out.println("새제목 : ");
			String newTitle = Article.sc.next();
			System.out.println("새내용 : ");
			String newBody = Article.sc.next();

			Articles.articles.get(targetIndex).setTitle(newTitle);
			Articles.articles.get(targetIndex).setBody(newBody);
		}		
	}
}