package bbs3;

public class BoardApp {

	public void start() {

		Print.printSample();

		while (true) {
			System.out.println("\n명령어를 입력해주세요:");
			String command = Article.sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {
				help.printHelp();

			} else if (command.equals("add")) {
				Add a = new Add();
				a.addArticle();

			} else if (command.equals("list")) {
				if(Articles.articles.size()==0) {
					Print.printSample();
				} else {
					Print.PrintList(Articles.articles);
				}

			} else if (command.equals("read")) {
				Read r = new Read();
				r.readArticle();

			} else if (command.equals("search")) {
				Search s = new Search();
				s.searchArticle();

			} else if (command.equals("update")) {
				Update u = new Update();
				u.updateArticile();
				Print.PrintList(Articles.articles);

			} else if (command.equals("delete")) {
				Delete d = new Delete();
				d.deleteArticle();
				Print.PrintList(Articles.articles);
			}
		}

	}

}
