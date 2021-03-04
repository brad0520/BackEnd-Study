package bbs;

public class search_bbs {

//	============================================================
	//	search 메서드 선언

	public static void search() {

		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용) : ");
		
		int command = repository.sc.nextInt();
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("검색 제목을 입력해주세요 : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.titles.size(); i++) {
				if (repository.titles.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 2:
			System.out.println("검색 내용을 입력해주세요 : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.bodies.size(); i++) {
				if (repository.bodies.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 3:
			System.out.println("키워드를 입력해주세요 : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.bodies.size(); i++) {
				if (repository.titles.get(i).contains(keyword)||repository.bodies.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
	
		}
	}
}
