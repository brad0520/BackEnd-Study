package bbs3;

public class read {

	//	============================================================
	//	read 선언
	public static void readArticle() {
		System.out.println("몇 번 게시물을 확인하시겠습니까? :");
		int index = Article.sc.nextInt();

		int targetIndex = getTargetIndex.targetIndexOfArticle(index);

		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.");
		} else {
			print.readPrint(targetIndex);
		}
		Articles.articles.get(targetIndex).hit++;

		while (true) {
			help.readMore();

			int select = Article.sc.nextInt();

			if (select < 1 || select >5) {
				System.out.println("올바른 번호를 입력해주세요.");
			} else if (select == 1) {
				System.out.println("댓글을 입력해주세요.");
				break;
			} else if (select == 2) {
				System.out.println("'좋아요'를 추가합니다.");
				break;
			} else if (select == 3) {
				System.out.println("게시물을 수정합니다.");
				break;
			} else if (select == 4) {
				System.out.println("게시물을 삭제합니다.");
				break;
			} else if (select == 5) {
				System.out.println("목록으로 돌아갑니다.");
				break;
			}
		}
	}
}