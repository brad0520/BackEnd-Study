package bbs3;

public class help {

	//	============================================================
	//	help 선언
	public static void printHelp() {
		System.out.println("========================");
		System.out.println("help : 도움말");
		System.out.println("add : 데이터 추가");
		System.out.println("list : 데이터 조회");
		System.out.println("read : 상세 조회");
		System.out.println("search : 키워드 검색");
		System.out.println("update : 데이터 수정");
		System.out.println("delete : 데이터 삭제");
		System.out.println("exit : 프로그램 종료");
		System.out.println("========================");
	}
	//	============================================================
	//	readMore 선언
	public static void readMore() {
		System.out.println("상세보기 기능을 선택해주세요."
		+ "\n(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로)");
	}
}