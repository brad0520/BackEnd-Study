package bbs;

public class list_bbs {

	//	============================================================
	//	list �޼��� ����
	public static void list() {
		System.out.println("\n======================");
		for(int i = 0; i < repository.titles.size(); i++) {
			listPart_bbs.listPart(i);
		}	
	}
}
