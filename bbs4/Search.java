package bbs3;

import java.util.ArrayList;

public class Search {

	//	============================================================
	//	search 선언
	public void searchArticle() {

		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용, 4. 작성자) : ");
		int searchFlag = Article.sc.nextInt();
		System.out.println("검색 키워드를 입력해주세요 : ");
		String keyword = Article.sc.next();
		
		ArrayList<Article> searchedArticles = new ArrayList<Article>();
		
		String searchTarget = "";
		
		for(int i = 0; i < Articles.articles.size(); i++) {
			
			Article article = Articles.articles.get(i);
			
			if(searchFlag == 1) {
				searchTarget = article.title; // 게시물 제목
			} else if(searchFlag == 2) {
				searchTarget = article.body;
			} else if(searchFlag == 3) {
				searchTarget = article.title + article.body; 
			} else if(searchFlag == 4) {
				searchTarget = article.nickname;
			}
			
			if(searchTarget.contains(keyword)) {
				searchedArticles.add(article);
			}
		}
		
		Print.PrintList(searchedArticles);
		
	}
}
//		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용) : ");
//		
//		int command = Article.sc.nextInt();
//		String keyword = "";
//		
//		switch(command) {
//		case 1: 		
//			System.out.println("검색 제목를 입력해주세요 :  ");
//			keyword = Article.sc.next();
//			System.out.println("======================");
//			for(int i = 0; i < Articles.articles.size(); i++) {
//				if (Articles.articles.get(i).title.contains(keyword)) {
//					listPart_bbs.listPart(i);
//				}
//			}
//			break;
//			
//		case 2:
//			System.out.println("검색 내용를 입력해주세요 :  ");
//			keyword = Article.sc.next();
//			System.out.println("======================");
//			for(int i = 0; i < Articles.articles.size(); i++) {
//				if (Articles.articles.get(i).body.contains(keyword)) {
//					listPart_bbs.listPart(i);
//				}
//			}
//			break;
//			
//		case 3:
//			System.out.println("검색 키워드를 입력해주세요 :  ");
//			keyword = Article.sc.next();
//			System.out.println("======================");
//			for(int i = 0; i < Articles.articles.size(); i++) {
//				if (Articles.articles.get(i).title.contains(keyword)||Articles.articles.get(i).body.contains(keyword)) {
//					listPart_bbs.listPart(i);
//				}
//			}
//			break;
//	
//		}