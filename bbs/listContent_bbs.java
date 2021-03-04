package bbs;

public class listContent_bbs {

	//	============================================================
	//	listPart 메서드 선언
	public static void listContent(int i) {
		System.out.println("\n===== " + repository.numbers.get(i) + "번 게시물 =======");
		System.out.println("번호 : " + repository.numbers.get(i));
		System.out.println("제목 : " + repository.titles.get(i));
		System.out.println("내용 : " + repository.bodies.get(i));
		System.out.println("======================");
	}
}
