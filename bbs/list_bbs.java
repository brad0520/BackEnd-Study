package java2021;

public class list_bbs {

	//	============================================================
	//	list 메서드 선언
	public static void list() {
		System.out.println("======================");
		for(int i = 0; i < bbs.titles.size(); i++) {
			System.out.println("번호 : " + bbs.numbers.get(i));
			System.out.println("제목 : " + bbs.titles.get(i));
			//			System.out.println("내용 : " + bodies.get(i));
			System.out.println("======================");
		}	
	}
}
