package bbs2;

public class listPart_bbs {

	//	============================================================
	//	listPart 선언
	public static void listPart(int i) {
			System.out.println("번호 : " + Articles.articles.get(i).number);
			System.out.println("제목 : " + Articles.articles.get(i).title);
			System.out.println("======================");
	}
}
