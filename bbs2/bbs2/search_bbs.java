package bbs2;

public class search_bbs {

//	============================================================
	//	search �޼��� ����

	public static void search() {

		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용) : ");
		
		int command = Article.sc.nextInt();
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("검색 제목를 입력해주세요 :  ");
			keyword = Article.sc.next();
			System.out.println("======================");
			for(int i = 0; i < Articles.articles.size(); i++) {
				if (Articles.articles.get(i).title.contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 2:
			System.out.println("검색 내용를 입력해주세요 :  ");
			keyword = Article.sc.next();
			System.out.println("======================");
			for(int i = 0; i < Articles.articles.size(); i++) {
				if (Articles.articles.get(i).body.contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 3:
			System.out.println("검색 키워드를 입력해주세요 :  ");
			keyword = Article.sc.next();
			System.out.println("======================");
			for(int i = 0; i < Articles.articles.size(); i++) {
				if (Articles.articles.get(i).title.contains(keyword)||Articles.articles.get(i).body.contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
	
		}
	}
}
