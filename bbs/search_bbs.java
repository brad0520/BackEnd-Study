package bbs;

public class search_bbs {

//	============================================================
	//	search �޼��� ����

	public static void search() {

		System.out.println("�˻� �׸��� �������ּ��� (1. ����, 2. ����, 3. ���� + ����) : ");
		
		int command = repository.sc.nextInt();
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.titles.size(); i++) {
				if (repository.titles.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 2:
			System.out.println("�˻� ������ �Է����ּ��� : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.bodies.size(); i++) {
				if (repository.bodies.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
			
		case 3:
			System.out.println("Ű���带 �Է����ּ��� : ");
			keyword = repository.sc.next();
			System.out.println("======================");
			for(int i = 0; i < repository.bodies.size(); i++) {
				if (repository.titles.get(i).contains(keyword)||repository.bodies.get(i).contains(keyword)) {
					listPart_bbs.listPart(i);
				}
			}
			break;
	
		}
	}
}
