package bbs2;

public class read_bbs {

	//	============================================================
	//	read �޼��� ����
	public static void read() {
		System.out.println("��� �Խù��� Ȯ���Ͻðڽ��ϱ�?");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("�Խù��� �������� �ʽ��ϴ�.");
		} else {
			listContent_bbs.listContent(targetIndex);
		}
	}
}
