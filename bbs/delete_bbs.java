package bbs;

public class delete_bbs {

	//	============================================================
	//	delete �޼��� ����
	public static void delete() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = repository.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			repository.numbers.remove(targetIndex);
			repository.titles.remove(targetIndex);
			repository.bodies.remove(targetIndex);
		}
	}
}
