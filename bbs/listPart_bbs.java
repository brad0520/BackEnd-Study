package bbs;

public class listPart_bbs {

	//	============================================================
	//	listPart 메서드 선언
	public static void listPart(int i) {
			System.out.println("번호 : " + repository.numbers.get(i));
			System.out.println("제목 : " + repository.titles.get(i));
			//			System.out.println("내용 : " + bodies.get(i));
			System.out.println("======================");
	}
}
