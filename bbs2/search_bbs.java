package bbs2;

public class search_bbs {

//	============================================================
	//	search �޼��� ����

	public static void search() {

		System.out.println("�˻� �׸��� �������ּ��� (1. ����, 2. ����, 3. ���� + ����) : ");
		
		int command = Article.sc.nextInt();
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = Article.sc.next();
			System.out.println("======================");
			for(int i = 0; i < Articles.articles.size(); i++) {
				if (Articles.articles.get(i).title.contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 2:
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = Article.sc.next();
			System.out.println("======================");
			for(int i = 0; i < Articles.articles.size(); i++) {
				if (Articles.articles.get(i).body.contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 3:
			System.out.println("Ű���带 �Է����ּ��� : ");
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
