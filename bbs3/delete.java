package bbs3;

public class delete {

	//	============================================================
	//	delete 선언
	public static void deleteArticle() {
		System.out.println("몇번 데이터를 삭제하시겠습니까? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = getTargetIndex.targetIndexOfArticle(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			Articles.articles.remove(targetIndex);
		}
	}
}