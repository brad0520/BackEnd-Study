package bbs;

public class bbs {

	//	�����뺯�� ����

	//	============================================================
	//	main �޼���
	public static void main(String[] args) {

		while (true) {
			System.out.println("\n��ɾ �Է����ּ��� :");
			String command = repository.sc.next();

			if (command.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (command.equals("help")) {
				help_bbs.help();

			} else if (command.equals("add")) {
				add_bbs.add();

			} else if (command.equals("list")) {
				if(repository.titles.size()==0) {
					listSmaple_bbs.listSample();
				} else {
					list_bbs.list();
				}

			} else if (command.equals("read")) {
				read_bbs.read();

			} else if (command.equals("search")) {
				search_bbs.search();

			} else if (command.equals("update")) {
				update_bbs.update();
				list_bbs.list();

			} else if (command.equals("delete")) {
				delete_bbs.delete();
				list_bbs.list();
			}
		}
	}
}