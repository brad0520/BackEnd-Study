package boardApp;

public class Reply {
	
	int num;
	int articleNum;
	String reply; 
	String nickname;
	String regDate;

	public Reply(int num, int articleNum, String reply, String nickname, String regDate) {
		this.num = num;
		this.articleNum = articleNum;
		this.reply = reply;
		this.nickname = nickname;
		this.regDate = regDate;
	}

}
