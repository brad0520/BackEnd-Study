package bbs2;

public class delete_bbs {

	//	============================================================
	//	delete �޼��� ����
	public static void delete() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			Articles.articles.remove(targetIndex);
		}
	}
}
