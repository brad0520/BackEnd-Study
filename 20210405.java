package board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardArticleController {

	public static void main(String[] args) {

		System.out.println("=== 프로그램 시작 ===");
		Scanner sc = new Scanner(System.in);
		String command;

		List<Article> articles = new ArrayList<>();
		int lastArticleId = 0;

		while (true) {
			System.out.println("명령어) ");
			command = sc.nextLine().trim();

			System.out.printf("입력된 명령어 : %s\n", command);

			if (command.equals("writeArticle")) {

				int id = lastArticleId + 1;
				System.out.println("제목: ");
				String title = sc.nextLine();
				System.out.println("내용: ");
				String body = sc.nextLine();

				Article a = new Article(id, title, body);
				articles.add(a);

				System.out.printf("%d번 글이 생성되었습니다.\n", id);

				lastArticleId = id;
			} else if (command.equals("modifyArticle")) {
				System.out.println("수정할 글 번호: ");
				int anum = Integer.parseInt(sc.nextLine());
				System.out.println("제목: ");
				String title = sc.nextLine();
				System.out.println("제목: ");
				String body = sc.nextLine();

				for (Article a : articles) {
					if (a.getId() == anum) {
						a.setTitle(title);
						a.setBody(body);
						System.out.println(a.getId() + "번 게시물이 수정되었습니다.");
					} else {
						System.out.println("없는 게시물 번호입니다.");
					}
				}
			} else if (command.equals("listArticle")) {
				if (articles.size() == 0) {
					System.out.println("게시된 글이 없습니다.");

				} else {
					for (Article a : articles) {
						System.out.println("번호 : " + a.getId());
						System.out.println("제목 : " + a.getTitle());
					}
				}
			} else if (command.equals("searchArticle")) {
				System.out.println("검색할 글 번호: ");
				int anum = Integer.parseInt(sc.nextLine());

				for (Article a : articles) {
					if (a.getId() == anum) {
						System.out.println("번호 : " + a.getId());
						System.out.println("제목 : " + a.getTitle());
						System.out.println("내용 : " + a.getBody());
					} else if (a.getId() == 0) {
						System.out.println("없는 게시물 번호입니다.");
					}
				}

			}

			else if (command.equals("deleteArticle")) {
				System.out.println("삭제할 글 번호: ");
				int anum = Integer.parseInt(sc.nextLine());

				for (Article a : articles) {
					if (a.getId() == anum) {
						articles.remove(a);
					} else if (a.getId() == 0) {
						System.out.println("없는 게시물 번호입니다.");
					}
				}

			} else if (command.equals("system exit")) {
				break;
			} else {
				System.out.println("존재하지 않는 명령어입니다.");
			}
		}

		System.out.println("=== 프로그램 끝 ===");

	}

}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
