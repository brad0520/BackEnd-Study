package bbs2;

public class read_bbs {

	//	============================================================
	//	read 선언
	public static void read() {
		System.out.println("몇 번 게시물을 확인하시겠습니까? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.");
		} else {
			listContent_bbs.listContent(targetIndex);
		}
	}
}
