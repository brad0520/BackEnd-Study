package bbs2;

public class listContent_bbs {

	//	============================================================
	//	listContent �޼��� ����
	public static void listContent(int i) {
		System.out.println("\n===== " + Articles.articles.get(i).number + "�� �Խù� =======");
		System.out.println("��ȣ : " + Articles.articles.get(i).number);
		System.out.println("���� : " + Articles.articles.get(i).title);
		System.out.println("���� : " + Articles.articles.get(i).body);
		System.out.println("======================");
	}
}
