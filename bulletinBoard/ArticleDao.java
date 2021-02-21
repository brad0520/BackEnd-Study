package bulletinBoard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB ���� ���� ó��
public class ArticleDao {

	Connection conn = null;

	// JDBC ���� ����
	// ====================== DB ���� ����============================================
	String url = "jdbc:mysql://127.0.0.1:3306/t1?serverTimezone=UTC"; // ������ DBMS �ּ�
	String id = "root";
	String pw = "";
	// ==============================================================================

	// ===============================���� �õ�======================================
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysqlDriver �� ã�ƾ��մϴ�.
			conn = DriverManager.getConnection(url, id, pw); // Ư�� DBMS�� ����
		}

		return conn;
		// ==============================================================================
	}

	// �Խù� ���
	public void addArticle(String title, String body) throws SQLException, ClassNotFoundException {

		Statement stmt = getConnection().createStatement();

		String sql = "INSERT INTO article \r\n" + "SET title = '" + title + "',\r\n" + "`body` = '" + body + "',\r\n" + "`mid` = 1,\r\n"
				+ "hit = 0,\r\n" + "regDate = NOW()";
		// ��ȸ ����� �ִ� ��� : select -> executeQuery() - ResultSet���� ����
		// ��ȸ ����� ���� ��� : update, delete, insert -> executeUpdate() - ���� X
		stmt.executeUpdate(sql);

		if (stmt != null) {
			stmt.close();
		}

	}

	// �Խù� ��� ��ȸ
	public void ArticleList() throws SQLException, ClassNotFoundException {

		Statement stmt = getConnection().createStatement();
		String sql = "select * from article";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			// Ŀ���� �̵����� �� ��� ������ true, false
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String body = rs.getString("body");
			int mid = rs.getInt("mid");
			int hit = rs.getInt("hit");
			String regDate = rs.getString("regDate");

			System.out.println(id);
			System.out.println(title);
			System.out.println(body);
			System.out.println(mid);
			System.out.println(hit);
			System.out.println(regDate);
		}

		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
	}

	// ȸ������
	public void addMember(String id, String pw, String nick) throws ClassNotFoundException, SQLException {
		Statement stmt = getConnection().createStatement();
		String sql = "INSERT INTO `member`\r\n" + 
				"SET loginId = '" + id + "',\r\n" + 
				"loginPw = '" + pw + "',\r\n" + 
				"nickname = '" + nick + "',\r\n" + 
				"regDate = NOW();";

		stmt.executeUpdate(sql);
		if (stmt != null) {
			stmt.close();
		}
	}

	// �α���
	public Member loginCheck(String id, String pw) throws ClassNotFoundException, SQLException {
		Statement stmt = getConnection().createStatement();
		String sql = "SELECT * FROM `member` WHERE loginId = '" + id + "' AND loginPw = '" + pw + "'";

		ResultSet rs = stmt.executeQuery(sql);
		// �ܰ��� if�� next ó��
		Member m = new Member();

		if(rs.next()) {	
			//m.loginId = rs.getString("loginId");
			m.setLoginId(rs.getString("loginId"));
			m.setNickname(rs.getString("nickname"));
		}

		if (stmt != null) {
			stmt.close();
		}

		return m;
	}

	// Ư�� �Խù� ��������
	public Article getArticleById(int aid) throws ClassNotFoundException, SQLException {

		Statement stmt = getConnection().createStatement();
		String sql = "SELECT * \r\n" + "FROM article \r\n" + "WHERE id = " + aid;
		ResultSet rs = stmt.executeQuery(sql);

		Article a = new Article();

		if (rs.next()) {
			int targetId = rs.getInt("id");
			String title = rs.getString("title");
			String body = rs.getString("body");
			String regDate = rs.getString("regDate");

			a.setId(targetId);
			a.setTitle(title);
			a.setBody(body);
			a.setRegDate(regDate);

		}

		return a;
	}
}

