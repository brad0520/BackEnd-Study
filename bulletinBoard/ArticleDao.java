package bulletinBoard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB 관련 로직 처리
public class ArticleDao {

	Connection conn = null;

	// JDBC 접속 정보
	// ====================== DB 접속 정보============================================
	String url = "jdbc:mysql://127.0.0.1:3306/t1?serverTimezone=UTC"; // 접속할 DBMS 주소
	String id = "root";
	String pw = "";
	// ==============================================================================

	// ===============================접속 시도======================================
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysqlDriver 를 찾아야합니다.
			conn = DriverManager.getConnection(url, id, pw); // 특정 DBMS에 접속
		}

		return conn;
		// ==============================================================================
	}

	// 게시물 등록
	public void addArticle(String title, String body) throws SQLException, ClassNotFoundException {

		Statement stmt = getConnection().createStatement();

		String sql = "INSERT INTO article \r\n" + "SET title = '" + title + "',\r\n" + "`body` = '" + body + "',\r\n" + "`mid` = 1,\r\n"
				+ "hit = 0,\r\n" + "regDate = NOW()";
		// 조회 결과가 있는 경우 : select -> executeQuery() - ResultSet으로 리턴
		// 조회 결과가 없는 경우 : update, delete, insert -> executeUpdate() - 리턴 X
		stmt.executeUpdate(sql);

		if (stmt != null) {
			stmt.close();
		}

	}

	// 게시물 목록 조회
	public void ArticleList() throws SQLException, ClassNotFoundException {

		Statement stmt = getConnection().createStatement();
		String sql = "select * from article";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			// 커서를 이동했을 때 결과 있으면 true, false
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

	// 회원가입
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

	// 로그인
	public Member loginCheck(String id, String pw) throws ClassNotFoundException, SQLException {
		Statement stmt = getConnection().createStatement();
		String sql = "SELECT * FROM `member` WHERE loginId = '" + id + "' AND loginPw = '" + pw + "'";

		ResultSet rs = stmt.executeQuery(sql);
		// 단건은 if로 next 처리
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

	// 특정 게시물 가져오기
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

