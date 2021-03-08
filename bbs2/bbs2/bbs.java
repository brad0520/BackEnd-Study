package bbs2;

public class bbs {
	static int number = 1;
	//	============================================================
	//	main �޼���
	public static void main(String[] args) {

		while (true) {
			System.out.println("\n명령어를 입력해주세요:");
			String command = Article.sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {
				help_bbs.help();

			} else if (command.equals("add")) {
				add_bbs.add();

			} else if (command.equals("list")) {
				if(Articles.articles.size()==0) {
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