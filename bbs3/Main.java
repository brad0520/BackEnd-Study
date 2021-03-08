package bbs3;

public class Main {
	//	============================================================
	//	main 메서드 선언
	public static void main(String[] args) {
		print.printSample();
		
		while (true) {
			System.out.println("\n명령어를 입력해주세요:");
			String command = Article.sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {
				help.printHelp();

			} else if (command.equals("add")) {
				add.addArticle();

			} else if (command.equals("list")) {
				if(Articles.articles.size()==0) {
					print.printSample();
				} else {
					print.PrintList(Articles.articles);
				}

			} else if (command.equals("read")) {
				read.readArticle();

			} else if (command.equals("search")) {
				search.searchArticle();

			} else if (command.equals("update")) {
				update.updateArticile();
				print.PrintList(Articles.articles);

			} else if (command.equals("delete")) {
				delete.deleteArticle();
				print.PrintList(Articles.articles);
			}
		}
	}
}