package bbs;

public class Article {

	int number;
	String title;
	String body;
	
	public Article(int number, 	String title, String body) {
		this.number = number;
		this.title = title;
		this.body = body;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

//	============================================================
//	�����뺯�� ����
//	static ArrayList<Integer> numbers= new ArrayList<Integer>();
//	static ArrayList<String> titles = new ArrayList<String>();
//	static ArrayList<String> bodies = new ArrayList<String>();
//	static Scanner sc = new Scanner(System.in);
//	static int number = 1;