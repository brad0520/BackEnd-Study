package bbs;

public class update_bbs {

	//	============================================================
	//	update �޼��� ����
	public static void update() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = repository.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			System.out.println("������ : ");
			String newTitle = repository.sc.next();
			System.out.println("������ : ");
			String newBody = repository.sc.next();


			repository.titles.set(targetIndex, newTitle);
			repository.bodies.set(targetIndex, newBody);
		}		
	}
}
