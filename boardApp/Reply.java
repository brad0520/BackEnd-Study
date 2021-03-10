package boardApp;

public class Reply {
	
	int num;
	int articleNum;
	String reply; 
	String nickname;
	String regDate;

	public Reply(String reply, String nickname, String regDate) {
		this.reply = reply;
		this.nickname = nickname;
		this.regDate = regDate;
	}

}
