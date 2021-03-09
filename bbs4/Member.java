package bbs3;

public class Member {

	String id;
	int pass;
	String nickname = "익명";
	
	public Member(String id, int pass, String nickname) {
		this.id = id;
		this.pass = pass;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}