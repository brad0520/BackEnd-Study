package bbs;

public class add_bbs {

	//	============================================================
	//	add �޼��� ����
	public static void add() {
		System.out.println("������ �Է����ּ��� : ");
		String title = repository.sc.next();
		System.out.println("������ �Է����ּ��� : ");
		String body = repository.sc.next();

		repository.numbers.add(repository.number);
		repository.titles.add(title);
		repository.bodies.add(body);
		repository.number++;
		
		System.out.println("�Խù��� ��ϵǾ����ϴ�.");		
	}
}
