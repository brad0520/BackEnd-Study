package java2021;

public class update_bbs {

	//	============================================================
	//	update �޼��� ����
	public static void update() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = bbs.sc.nextInt();
		int targetIndex = -1;

		for(int i=0; i < bbs.numbers.size(); i++) {
			if (index == bbs.numbers.get(i)) {
				targetIndex = i;
			}
		}
		
		if(targetIndex == -1) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			System.out.println("������ : ");
			String newTitle = bbs.sc.next();
			System.out.println("������ : ");
			String newBody = bbs.sc.next();


			bbs.titles.set(targetIndex, newTitle);
			bbs.bodies.set(targetIndex, newBody);
		}		
	}
}
