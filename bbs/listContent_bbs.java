package bbs;

public class listContent_bbs {

	//	============================================================
	//	listPart �޼��� ����
	public static void listContent(int i) {
		System.out.println("\n===== " + repository.numbers.get(i) + "�� �Խù� =======");
		System.out.println("��ȣ : " + repository.numbers.get(i));
		System.out.println("���� : " + repository.titles.get(i));
		System.out.println("���� : " + repository.bodies.get(i));
		System.out.println("======================");
	}
}
