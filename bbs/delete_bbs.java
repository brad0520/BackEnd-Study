package java2021;

public class delete_bbs {

	//	============================================================
	//	delete �޼��� ����
	public static void delete() {
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
			bbs.numbers.remove(targetIndex);
			bbs.titles.remove(targetIndex);
			bbs.bodies.remove(targetIndex);
		}
	}
}
