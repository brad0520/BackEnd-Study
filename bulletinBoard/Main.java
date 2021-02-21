package bulletinBoard;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static ArticleDao adao = new ArticleDao();
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// �Է� �뵵
		Scanner sc = new Scanner(System.in);
		Member loginedMember = null;

		while (true) {
			if (loginedMember == null) {
				System.out.println("��ɾ� : ");
			} else {
				System.out.println("��ɾ� [" + loginedMember.getLoginId() + "(" + loginedMember.getNickname() + ")] : ");
			}
			String cmd = sc.nextLine();

			if (cmd.equals("add")) {

				System.out.println("������ �Է����ּ��� : ");
				String title = sc.nextLine();

				System.out.println("������ �Է����ּ��� : ");
				String body = sc.nextLine();

				adao.addArticle(title, body);

				// DB�� ���� - insert

			} else if (cmd.equals("list")) {
				// �����ߴ� ������ ��� ���
				// DB�� �ִ� ������ �����ͼ� ��� - select

				adao.ArticleList();

			} else if (cmd.equals("update")) {

				System.out.println("������ �Խù� ��ȣ �Է� : ");
				// �Խù� ��ȣ�� �Խù� ã��
				int aid = Integer.parseInt(sc.nextLine());

				if (isExistArticleById(aid)) {

					System.out.println("������ �Է����ּ��� : ");
					String title = sc.nextLine();

					System.out.println("������ �Է����ּ��� : ");
					String body = sc.nextLine();

					stmt = conn.createStatement();

					String sql2 = "UPDATE article \r\n" + "SET title = '" + title + "',\r\n" + "`body` = '" + body + "'\r\n" + "WHERE id = " + aid;

					stmt.executeUpdate(sql2);

				} else {
					System.out.println("���� �Խù��Դϴ�.");
				}
			} else if (cmd.equals("delete")) {
				System.out.println("������ �Խù� ��ȣ �Է� : ");
				// �Խù� ��ȣ�� �Խù� ã��
				int aid = Integer.parseInt(sc.nextLine());

				if (isExistArticleById(aid)) {
					String sql = "DELETE\r\n" + "FROM article\r\n" + "WHERE id = " + aid;
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);

				} else {
					System.out.println("���� �Խù��Դϴ�.");
				}
			} else if (cmd.equals("read")) {
				System.out.println("�󼼺��� �� �Խù� ��ȣ �Է� : ");
				// �Խù� ��ȣ�� �Խù� ã��
				int aid = Integer.parseInt(sc.nextLine());
				Article article = adao.getArticleById(aid);
				if (article != null) {
					System.out.println("��ȣ : " + article.getId());
					System.out.println("���� : " + article.getTitle());
					System.out.println("���� : " + article.getBody());
					System.out.println("�ۼ��� : " + article.getRegDate());
				} else {
					System.out.println("���� �Խù��Դϴ�.");
				}
			} else if (cmd.equals("signup")) {
				System.out.println("���̵�:");
				String id = sc.nextLine();
				System.out.println("��й�ȣ:");
				String pw = sc.nextLine();
				System.out.println("�г���:");
				String nick = sc.nextLine();

				adao.addMember(id, pw, nick);

			} else if (cmd.equals("login")) {
				System.out.println("���̵�:");
				String id = sc.nextLine();
				System.out.println("��й�ȣ:");
				String pw = sc.nextLine();

				loginedMember = adao.loginCheck(id, pw);

			}
		}
		// ================================================================================
	}

	private static boolean isExistArticleById(int aid) throws SQLException {

		String sql = "select * from article where id = " + aid;

		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		if (rs.next()) {
			return true;
		}

		return false;
	}

}
