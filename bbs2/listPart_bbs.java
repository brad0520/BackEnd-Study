package bbs2;

public class listPart_bbs {

	//	============================================================
	//	listPart �޼��� ����
	public static void listPart(int i) {
			System.out.println("��ȣ : " + Articles.articles.get(i).number);
			System.out.println("���� : " + Articles.articles.get(i).title);
			System.out.println("======================");
	}
}
