package java2021;

public class list_bbs {

	//	============================================================
	//	list �޼��� ����
	public static void list() {
		System.out.println("======================");
		for(int i = 0; i < bbs.titles.size(); i++) {
			System.out.println("��ȣ : " + bbs.numbers.get(i));
			System.out.println("���� : " + bbs.titles.get(i));
			//			System.out.println("���� : " + bodies.get(i));
			System.out.println("======================");
		}	
	}
}
