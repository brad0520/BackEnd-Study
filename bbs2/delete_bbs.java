package bbs2;

public class delete_bbs {

	//	============================================================
	//	delete 메서드 선언
	public static void delete() {
		System.out.println("몇번 데이터를 삭제하시겠습니까? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// 삭제 코드
			Articles.articles.remove(targetIndex);
		}
	}
}
