package bbs2;

public class list_bbs {

	//	============================================================
	//	list 메서드 선언
	public static void list() {
		System.out.println("\n======================");
		for(int i = 0; i < Articles.articles.size(); i++) {
			listPart_bbs.listPart(i);
		}	
	}
}
