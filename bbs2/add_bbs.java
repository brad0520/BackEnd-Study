package bbs2;

public class add_bbs {

	//	============================================================
	//	add �޼��� ����
	public static void add() {
		System.out.println("������ �Է����ּ��� : ");
		String title = Article.sc.next();
		System.out.println("������ �Է����ּ��� : ");
		String body = Article.sc.next();

		
		Article article = new Article(bbs.number, title, body);
		Articles.articles.add(article);
		bbs.number++;
		
		System.out.println("�Խù��� ��ϵǾ����ϴ�.");		
	}
}
