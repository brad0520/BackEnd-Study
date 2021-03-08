package bbs2;

public class update_bbs {

	//	============================================================
	//	update �޼��� ����
	public static void update() {
		System.out.println("몇번 데이터를 수정하시겠습니까? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// ���� �ڵ�
			System.out.println("새제목 : ");
			String newTitle = Article.sc.next();
			System.out.println("새내용 : ");
			String newBody = Article.sc.next();


			Articles.articles.get(targetIndex).setTitle(newTitle);
			Articles.articles.get(targetIndex).setBody(newBody);
		}		
	}
}
