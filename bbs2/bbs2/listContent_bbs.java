package bbs2;

public class listContent_bbs {

	//	============================================================
	//	listContent �޼��� ����
	public static void listContent(int i) {
		System.out.println("\n===== " + Articles.articles.get(i).number + "�� �Խù� =======");
		System.out.println("번호 : " + Articles.articles.get(i).number);
		System.out.println("제목 : " + Articles.articles.get(i).title);
		System.out.println("내용 : " + Articles.articles.get(i).body);
		System.out.println("======================");
	}
}
