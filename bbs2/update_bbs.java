package bbs2;

public class update_bbs {

	//	============================================================
	//	update �޼��� ����
	public static void update() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = Article.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			System.out.println("������ : ");
			String newTitle = Article.sc.next();
			System.out.println("������ : ");
			String newBody = Article.sc.next();


			Articles.articles.get(targetIndex).setTitle(newTitle);
			Articles.articles.get(targetIndex).setBody(newBody);
		}		
	}
}
