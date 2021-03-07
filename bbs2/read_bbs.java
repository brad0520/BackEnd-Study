package bbs2;

public class read_bbs {

	//	============================================================
	//	read 메서드 선언
	public static void read() {
		System.out.println("몇번 게시물을 확인하시겠습니까?");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("게시물이 존재하지 않습니다.");
		} else {
			listContent_bbs.listContent(targetIndex);
		}
	}
}
