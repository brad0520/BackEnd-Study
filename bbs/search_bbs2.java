package java2021;

public class search_bbs2 {

//	============================================================
	//	search 메서드 선언

	public static void search() {

		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용) : ");
		
		int command = Integer.parseInt(bbs.sc.next());
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("검색 제목을 입력해주세요 : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.titles.size(); i++) {
				if (bbs.titles.get(i).contains(keyword)) {
					System.out.println("번호 : " + bbs.numbers.get(i));
					System.out.println("제목 : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 2:
			System.out.println("검색 내용을 입력해주세요 : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.titles.size(); i++) {
				if (bbs.bodies.get(i).contains(keyword)) {
					System.out.println("번호 : " + bbs.numbers.get(i));
					System.out.println("제목 : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 3:
			System.out.println("키워드를 입력해주세요 : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.bodies.size(); i++) {
				if (bbs.titles.get(i).contains(keyword)||bbs.bodies.get(i).contains(keyword)) {
					System.out.println("번호 : " + bbs.numbers.get(i));
					System.out.println("제목 : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
	
		}
	}
}
