package java2021;

public class search_bbs2 {

//	============================================================
	//	search �޼��� ����

	public static void search() {

		System.out.println("�˻� �׸��� �������ּ��� (1. ����, 2. ����, 3. ���� + ����) : ");
		
		int command = Integer.parseInt(bbs.sc.next());
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.titles.size(); i++) {
				if (bbs.titles.get(i).contains(keyword)) {
					System.out.println("��ȣ : " + bbs.numbers.get(i));
					System.out.println("���� : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 2:
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.titles.size(); i++) {
				if (bbs.bodies.get(i).contains(keyword)) {
					System.out.println("��ȣ : " + bbs.numbers.get(i));
					System.out.println("���� : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 3:
			System.out.println("Ű���带 �Է����ּ��� : ");
			keyword = bbs.sc.next();
			System.out.println("======================");
			for(int i = 0; i < bbs.bodies.size(); i++) {
				if (bbs.titles.get(i).contains(keyword)||bbs.bodies.get(i).contains(keyword)) {
					System.out.println("��ȣ : " + bbs.numbers.get(i));
					System.out.println("���� : " + bbs.titles.get(i));
					System.out.println("======================");
				}
			}
			break;
	
		}
	}
}
